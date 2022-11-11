/**
 * 
 */
package com.home.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.care.bo.User;
import com.home.care.db.UserRepo;
import com.home.care.service.UserService;

/**
 * @author bhabesh
 *
 */
@RestController
@RequestMapping(value="/api")
public class AuthController {
	@Autowired
	UserService userService;

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello";
	}

	@PostMapping(value = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public User register(@RequestBody User user ) {
		return userService.register(user);
	}

}
