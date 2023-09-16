package com.api.controller;

import java.util.List;
import java.util.Map;

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
import com.api.payloads.UserDto;
import com.api.service.UserService;
import com.api.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
//	@Autowired
	//private UserService service;
	
	
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
	{
		UserDto createUser = service.createUser(userDto);
		
		return new ResponseEntity<>(createUser,HttpStatus.CREATED);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId") int userId)
	{
		UserDto userUpdate = service.userUpdate(userDto, userId);
		
		return new ResponseEntity<>(userUpdate,HttpStatus.OK);
				
	}
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") int userId)
	{		
		service.deleteUser(userId);
		return new ResponseEntity(new ApiResponse(" User Deleted Successfully",true),HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser()
	{						
		return ResponseEntity.ok(this.service.getAllUsers());
	}
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getAllUser(@PathVariable("userId") int userId)
	{						
		return ResponseEntity.ok(this.service.getUserById(userId));
	}
	
}
