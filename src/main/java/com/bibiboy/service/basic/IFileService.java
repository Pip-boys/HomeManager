package com.bibiboy.service.basic;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import com.bibiboy.bean.entity.BaseResult;
import com.google.zxing.NotFoundException;

public interface IFileService {
	
	/**
	 * 上传图片
	 * <p>Title: uploadPic</p>  
	 * <p>Description: </p>  
	 * @param file
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public BaseResult uploadPic(MultipartFile file)throws IllegalStateException, IOException;
	
	/**
	 * 二维码识别
	 * <p>Title: qrcode</p>  
	 * <p>Description: </p>  
	 * @param imgData
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 * @throws NotFoundException
	 */
	public BaseResult qrcode(String imgData) throws Exception;
	
}
