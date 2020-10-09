package com.vastika.userinfo.service;

import java.util.List;

import com.vastika.userinfo.model.User;


public interface UserService {
	
	void saveUserInfo(User user);
	
	void updateUserInfo(User user);
	
	void deleteUserInfo(int id);
	
	User getUserById(int id);
	
	List <User> getAllUser();

}
