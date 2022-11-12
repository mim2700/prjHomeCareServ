/**
 * 
 */
package com.home.care.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.home.care.login.LoginService;
import com.home.care.login.LoginUser;

/**
 * @author bhabesh
 *
 */
@RestController
@RequestMapping(value="/api")
public class AuthController {
	@Autowired
	LoginService loginService;
	@Autowired
	PasswordEncoder passwordEncoder;

	@PostMapping(value = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public LoginUser register(@RequestBody LoginUser user) {
		if (!user.getPassword().equals(user.getPasswordCconfirm())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password did not match");
		}
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return loginService.register(user);
	}
}
