/**
 * 
 */
package com.home.care.login;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.care.bo.User;
import com.home.care.db.UserRepo;

/**
 * @author bhabesh
 *
 */
@Service
public class LoginService {
	@Autowired UserRepo userRepo;
	
	public LoginUser register(LoginUser loginUser) {
		User user = loginUser.getUser();
		return new LoginUser(userRepo.save(user));
	}
	
	public Optional<User> findByEmail(String strParamEmail) {
		return userRepo.findByEmail(strParamEmail);
		
	}
	
}
