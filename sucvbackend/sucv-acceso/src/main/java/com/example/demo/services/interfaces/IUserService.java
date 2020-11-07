package com.example.demo.services.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;
import com.example.demo.response.ResponseMessage;

public interface IUserService {
	public UserDto autenticate(String email, String password);
	public ResponseEntity<Object> getUser(Integer id) throws Exception;	
	public List<User> getAll();
	public UserDto save(UserDto user);
	public ResponseEntity<String> remove(Integer id);
}
