package com.api.service;

import java.util.List;
import com.api.payloads.UserDto;

public interface UserService {

	 UserDto createUser(UserDto user);
	 UserDto userUpdate(UserDto user,int id);
	 UserDto getUserById(int id);
	 List<UserDto> getAllUsers();
	 
	 void deleteUser(int id);
}
