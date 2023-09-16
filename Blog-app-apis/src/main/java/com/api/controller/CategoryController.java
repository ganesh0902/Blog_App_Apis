package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.payloads.ApiResponse;
import com.api.payloads.CategoryDto;
import com.api.service.CategoryService;
import com.api.service.impl.CategoryServiceimpl;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryServiceimpl service;
	
	//create category
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto)
	{
		CategoryDto createCategory = this.service.createCategory(categoryDto);		
		return new ResponseEntity<CategoryDto>(createCategory,HttpStatus.CREATED);
	}
	//Update API
	@PutMapping("/{id}")
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto,@PathVariable("id") int id)
	{
		CategoryDto updateCatory = this.service.updateCategory(categoryDto, id);	
		return new ResponseEntity<CategoryDto>(updateCatory,HttpStatus.OK);
	}
	// Delete API
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable("id") int id)
	{
		this.service.deletecategory(id);
		
		return new ResponseEntity<>(new ApiResponse("User Delete Successfully",true),HttpStatus.OK);
	}
	// get single Use
	@GetMapping("/{id}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable("id") int id)
	{
		CategoryDto category = this.service.getCategory(id);
		
		return new ResponseEntity<CategoryDto>(category,HttpStatus.OK);
	}
	//get all user
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllCategory()
	{
		List<CategoryDto> allCategory = this.service.getAllCategory();
		
		return new ResponseEntity<List<CategoryDto>>(allCategory,HttpStatus.OK);
		
	}
}