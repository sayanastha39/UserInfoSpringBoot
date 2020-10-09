package com.vastika.userinfo.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.vastika.userinfo.model.User;
import com.vastika.userinfo.repository.UserRepository;

@SpringBootTest
public class UserServiceImplTest {
	
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	
	@Test
	public void testsaveUserInfo() {
		User user= getUserMockData();
		Mockito.when(userRepository.save(user)).thenReturn(getUser());
		userServiceImpl.saveUserInfo(user);
	}
	
	@Test
	public void testupdateUserInfo() {
		User user= getUser();
		Mockito.when(userRepository.save(getUser())).thenReturn(getUser());
		userServiceImpl.updateUserInfo(user);
	}
	
	@Test
	public void testdeleteUserInfo() {
		Mockito.doNothing().when(userRepository).deleteById(1);
		userServiceImpl.deleteUserInfo(1);
	}
	
	
	@Test
	public void testGetUserById() {
		Optional<User> u = Optional.of(getUser());
		Mockito.when(userRepository.findById(1)).thenReturn(u);
		User user= userServiceImpl.getUserById(1);
		assertNotNull(user);
		assertEquals(1, user.getId());
		//assertEquals(u.getUsername(), user.getUsername());
	}
	
	@Test
	public void testGetAllUser() {
		List<User> userList = Arrays.asList(getUser());
		Mockito.when(userRepository.findAll()).thenReturn(userList);
		List<User> users = userServiceImpl.getAllUser();
		assertNotNull(users);
		assertEquals(1, users.size());
	}
	
	
	
	public User getUserMockData() {
		User user = new User();
		user.setUsername("test");
		user.setPassword("test");
		user.setDob(new Date());
		user.setHobbies("Singing");
		user.setMobile((long) 863881);
		user.setNationality("Nepalese");
		user.setEmail("test@gmail.com");
		user.setGender("Female");
		return user;
		
	}
	
	
	@Test
	public User getUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("test");
		user.setPassword("test");
		user.setDob(new Date());
		user.setHobbies("Singing");
		user.setMobile((long) 863881);
		user.setNationality("Nepalese");
		user.setEmail("test@gmail.com");
		user.setGender("Female");
		return user;
		
	}

}
