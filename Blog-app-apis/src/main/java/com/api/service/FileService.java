package com.api.service;

import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	String uploadImage(String path,MultipartFile multipartFile);
	
	InputStream getResource(String path,String fileName);
}
