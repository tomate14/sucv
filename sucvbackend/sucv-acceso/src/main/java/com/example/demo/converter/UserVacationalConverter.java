package com.example.demo.converter;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;
import com.example.demo.entities.UserVacational;

public class UserVacationalConverter implements AbsConverter<UserVacational, UserDto> {

	@Override
	public UserVacational fromDto(UserDto dto) {
		UserVacational user = new UserVacational();
		user.setBirthday(dto.getBirthday());
		user.setBornCity(dto.getBornCity());
		user.setDni(dto.getDni());
		user.setEmail(dto.getEmail());
		user.setId(dto.getId());
		user.setName(dto.getName());
		
		return user;
	}

	@Override
	public UserDto fromEntity(UserVacational entity) {
		UserDto user = new UserDto();
		user.setBirthday(entity.getBirthday());
		user.setBornCity(entity.getBornCity());
		user.setDni(entity.getDni());
		user.setEmail(entity.getEmail());
		user.setId(entity.getId());
		user.setName(entity.getName());
		
		return user;
	}

	@Override
	public List<User> fromDto(List<UserDto> dtos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> fromEntity(List<User> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
