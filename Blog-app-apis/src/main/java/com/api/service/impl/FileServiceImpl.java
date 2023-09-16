package com.api.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.api.service.FileService;

@Service
public class FileServiceImpl implements FileService{

	@Override
	public String uploadImage(String path, MultipartFile multipartFile) {
		
		String filename = multipartFile.getOriginalFilename();
		
		
		//randome name  generate file		
		String randomeId = UUID.randomUUID().toString();
		
		String fileName1 = randomeId.concat(filename.substring(filename.lastIndexOf(".")));
		
		//full filepath
		
		String filepath=path+File.separator+fileName1;
		
		File file2 = new File(path);
		
		if(!file2.exists())
		{
			file2.mkdir();
		}
		
		try {
			Files.copy(multipartFile.getInputStream(),Paths.get(filepath));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileName1;
	}

	@Override
	public InputStream getResource(String path, String fileName) {
				
		String filePath=path+File.separator+fileName;
		FileInputStream is = null; 
		try {
			
			 is = new FileInputStream(filePath);
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return is;
	}
}