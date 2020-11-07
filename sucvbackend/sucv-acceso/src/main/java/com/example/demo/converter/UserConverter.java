package com.example.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;

public class UserConverter implements AbsConverter<User, UserDto> {

	
	@Override
	public List<User> fromDto(List<UserDto> dtos){
		if(dtos == null) return null;
		return dtos.stream().map(dto -> fromDto(dto)).collect(Collectors.toList());
	}
	
	@Override
	public List<UserDto> fromEntity(List<User> entities){
		if(entities == null) return null;
		return entities.stream().map(entity -> fromEntity(entity)).collect(Collectors.toList());
	}

	@Override
	public User fromDto(UserDto dto) {
		User user = new User();
		user.setDni(dto.getDni());
		user.setId(dto.getId());
		user.setName(dto.getName());
		
		return user;
	}

	
	@Override
	public UserDto fromEntity(User entity) {
		UserDto dto = new UserDto();
		dto.setDni(entity.getDni());
		dto.setId(entity.getId());
		dto.setName(entity.getName());		
		
		return dto;
	}

}
