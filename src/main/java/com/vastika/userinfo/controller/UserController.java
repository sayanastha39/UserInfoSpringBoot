package com.vastika.userinfo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vastika.userinfo.model.User;
import com.vastika.userinfo.service.UserService;

@RestController
@RequestMapping("/users") //root mapping
@CrossOrigin(origins="*")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService= userService;
	}
	
	@PostMapping
	public void saveUser(@RequestBody User user) {
		userService.saveUserInfo(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUserInfo(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUserInfo(id);
	}
	
	@GetMapping ("/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping 
	public List <User> getAllUser(){
		return userService.getAllUser();
	}
	
}
