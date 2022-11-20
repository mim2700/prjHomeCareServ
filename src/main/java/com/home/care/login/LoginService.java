/**
 * 
 */
package com.home.care.login;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.care.bo.User;
import com.home.care.db.UserRepo;

import io.jsonwebtoken.security.InvalidKeyException;

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
	
	public Token getToken(User user)  {
		try {
			return Token.of(user.getId(), 10L, "bbm_test");
		} catch (InvalidKeyException | NoSuchAlgorithmException e) {
			return Token.of(e.getMessage());
		}
	}
	
}
