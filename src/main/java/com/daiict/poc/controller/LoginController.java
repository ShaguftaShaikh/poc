package com.daiict.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daiict.poc.repository.UserRepository;

@Controller
@RequestMapping(path="/api")
public class LoginController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(path="/authenticate")
	public void authenticateUser() {
		System.out.println(userRepository.findAll());
	}
}
