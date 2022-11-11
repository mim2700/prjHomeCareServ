/**
 * 
 */
package com.home.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.home.care.bo.User;
import com.home.care.db.UserRepo;

/**
 * @author bhabesh
 *
 */
@Service
public class UserService {
	@Autowired
	UserRepo userRepo; 

	public User register(User user ) {
		return userRepo.save(user);
	}
}
