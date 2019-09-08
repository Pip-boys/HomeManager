package com.bibiboy.service.basic.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.order.CodeInfo;
import com.bibiboy.service.basic.IFileService;
import com.bibiboy.service.basic.ISysUserService;
import com.bibiboy.service.equip.IEquipMainService;
import com.bibiboy.util.GeneralParameter;
import com.bibiboy.util.GeneralTool;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import sun.misc.BASE64Decoder;

@Service
public class FileServiceImpl implements IFileService{
	
	@Autowired
	private IEquipMainService equipService;
	
	@Autowired
	private ISysUserService sysUserService;

	@Override
	public BaseResult uploadPic(MultipartFile file) throws IllegalStateException, IOException {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        if (file==null) {
			return new BaseResult(400, "文件不存在");
		}
        String name=file.getOriginalFilename();
		String subffix = name.substring(name.lastIndexOf(".") + 1, name.length());
		if (!GeneralTool.haveSupportPicType(subffix)) {
			return new BaseResult(400, "图片仅支持jpg,png,jpeg格式！");
		}
		String filepath=GeneralParameter.SERVICEPATH+"images/head/"+uuid+"."+subffix;
		File saveFile=new File(filepath);
		File head = new File(GeneralParameter.SERVICEPATH+"images/head/");
		if (!head.exists()) {
			head.mkdirs();
		}
		file.transferTo(saveFile);
		return new BaseResult(200, "上传成功", filepath.replace(GeneralParameter.SERVICEPATH, GeneralParameter.NGINXHOST));
	}

	@Override
	public BaseResult qrcode(String imgData) throws Exception {
		JSONObject parseObject = JSON.parseObject(imgData);
		String s = (String) parseObject.get("imgData");
		
		s=s.substring(22);
		@SuppressWarnings("restriction")
		BASE64Decoder decoder = new BASE64Decoder();  
        @SuppressWarnings("restriction")
		byte[] b = decoder.decodeBuffer(s);
        String vcUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        String path=GeneralParameter.SERVICEPATH+"images/temp/"+vcUserName+".jpg";
        OutputStream out = new FileOutputStream(path);
        out.write(b);
        out.flush();
        out.close();
        
        File file=new File(path);;
       
        BufferedImage image;
        image = ImageIO.read(file);
        if (image == null) {
            return null;
        }
        BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result;
        Hashtable hints = new Hashtable();
        hints.put(DecodeHintType.CHARACTER_SET, "utf-8");
        result = new MultiFormatReader().decode(bitmap, hints);
        String vcCode = result.getText();
        
        if (!StringUtils.isNotBlank(vcCode)) {
			return new BaseResult(400, "未查询到信息");
		}
        
        SysUser sysUser = sysUserService.getSysUserByRedis();
        UserEquip userEquip = new UserEquip();
        userEquip.setnUserId(sysUser.getnId());
        userEquip.setVcCode(vcCode);
        CodeInfo codeInfo = equipService.getUserEquipCodeInfo(userEquip);
        
        if (codeInfo.getnId()!=null) {
			return new BaseResult(codeInfo);
		}else {
			equipService.addUserEquip(userEquip);
			return new BaseResult("激活成功！");
		}
        
	}

}
