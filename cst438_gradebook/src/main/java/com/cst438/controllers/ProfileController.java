package com.cst438.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import java.security.Principal;
import java.sql.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

import com.cst438.domain.User;
import com.cst438.domain.UserRepository;
import com.cst438.dto.AccountCredentials;
import com.cst438.dto.UserDTO;

@RestController
@CrossOrigin 
public class ProfileController {

	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/profile")
	public UserDTO getProfile(Principal principal ) {
		String userString = principal.getName();
		User currentUser = userRepository.findByAlias(userString);
		
		UserDTO dto = new UserDTO(currentUser.getId(), currentUser.getAlias(), currentUser.getEmail(), currentUser.getPassword(), currentUser.getRole());
		System.out.println(dto);
		return dto;
	}
}
