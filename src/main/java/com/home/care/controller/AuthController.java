/**
 * 
 */
package com.home.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.home.care.bo.User;
import com.home.care.db.UserRepo;
import com.home.care.login.LoginService;
import com.home.care.login.LoginUser;
import com.home.care.service.UserService;

import net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record;

/**
 * @author bhabesh
 *
 */
@RestController
@RequestMapping(value="/api")
public class AuthController {
	@Autowired
	UserService userService;
	@Autowired
	LoginService loginService;

	@PostMapping(value = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public LoginUser register(@RequestBody LoginUser user) {
		if (!user.getPassword().equals(user.getPasswordCconfirm())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password did not match");
		}
		return loginService.register(user);
	}
}
