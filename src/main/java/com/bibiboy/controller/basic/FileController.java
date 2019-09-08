package com.bibiboy.controller.basic;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.service.basic.IFileService;

@RestController
@RequestMapping("/file")
public class FileController {
	
	@Autowired
	private IFileService fileServiceImpl;
	
	@PostMapping(value="/pic")
	public BaseResult uploadPic(@RequestParam(value="file") MultipartFile file) throws IllegalStateException, IOException {
		return fileServiceImpl.uploadPic(file);
	}
	
	@PostMapping(value="/qrcode")
	public BaseResult qrcode(@RequestBody String imgData) throws Exception {
		return fileServiceImpl.qrcode(imgData);
	}
	
}
