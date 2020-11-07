package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;
import com.example.demo.entities.UserVacational;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{

    public Optional<User> findById(Integer id);
	
	public List<User> findAll();
	
	public User save(User user);
	
	public void deleteById(Integer id);
}
