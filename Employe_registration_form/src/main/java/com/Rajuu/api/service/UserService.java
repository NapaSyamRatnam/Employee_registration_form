package com.Rajuu.api.service;

import com.Rajuu.api.entity.UserEntity;

public interface UserService {
 

	public void registerUser(UserEntity user);
	
	public void deleteUser(Long id);
	
	 
}

