package com.apress.AWS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.AWS.dto.UserDTO;
import com.apress.AWS.repository.UserJpaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserJpaRepository userRepository;
	
	public List<UserDTO> listAll() {
		return userRepository.findAll();
	}
	
	public void save(UserDTO user) {
		userRepository.save(user);
	}
	
	public UserDTO get(Long id) {
		return userRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
}
