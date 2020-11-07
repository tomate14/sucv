package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.converter.AbsConverter;
import com.example.demo.converter.UserConverter;
import com.example.demo.converter.UserVacationalConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;
import com.example.demo.entities.UserVacational;
import com.example.demo.repository.IUserRepository;
import com.example.demo.services.interfaces.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepository userRepository;	
		
	private AbsConverter<User, UserDto> userConverter = new UserConverter();
	private AbsConverter<UserVacational, UserDto> userVacationalConverter = new UserVacationalConverter();
	
	@Override
	public ResponseEntity<Object> getUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent()) {
			return new ResponseEntity<Object>(user.get(), HttpStatus.OK);
		}
		throw new Exception("Usuario no encontrado");
		
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
		//return userConverter.fromEntity(users);
	}

	@Override
	public UserDto save(UserDto userDto) {
		User user = userConverter.fromDto(userDto);
		return userConverter.fromEntity(userRepository.save(user));
	}

	@Override
	public ResponseEntity<String> remove(Integer id) {
		userRepository.deleteById(id);
		Optional<User> user = userRepository.findById(id);
		
		if(!user.isPresent()) {
			return new ResponseEntity<String>("El usuario fue borrado con exito", HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("Error al eliminar el usuario", HttpStatus.ACCEPTED);
	}

	@Override
	public UserDto autenticate(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
