package com.api.exceptions;

public class ResourceNotFoundException extends Exception{

	private String resourceName;
	private String fieldName;
	private long fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {		
		super(String.format("%s Not found With  %s: %s",resourceName,fieldName,fieldValue));		
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}		
}
