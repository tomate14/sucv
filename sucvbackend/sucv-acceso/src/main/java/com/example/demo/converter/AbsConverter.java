package com.example.demo.converter;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;

public interface AbsConverter<E, D> {
	public E fromDto(D dto);

	public D fromEntity(E entity);
	
	public List<User> fromDto(List<UserDto> dtos);
	
	public List<UserDto> fromEntity(List<User> entities);
}
