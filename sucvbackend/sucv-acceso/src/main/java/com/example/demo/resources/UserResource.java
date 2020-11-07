package com.example.demo.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;
import com.example.demo.services.interfaces.IUserService;

@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	private IUserService userServices;
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable(value = "id") Integer id){
		try {
			return userServices.getUser(id);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.ACCEPTED);
		}
	}
	
	@GetMapping("/all")
	public List<User> getAll() {
		return userServices.getAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> remove(@PathVariable(value = "id") Integer id) {
		return userServices.remove(id);
	}
}
