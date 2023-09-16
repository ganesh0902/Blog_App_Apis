package com.api.service;

import java.util.List;

import com.api.payloads.CategoryDto;

public interface CategoryService {

	//create category
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update category
	public CategoryDto updateCategory(CategoryDto categoryDto,int id);
	
	//delete category
	public CategoryDto deletecategory(int id);
	
	//get category by Id
	public CategoryDto getCategory(int id);
	
	//get all category
	
	public List<CategoryDto> getAllCategory();
	
}
