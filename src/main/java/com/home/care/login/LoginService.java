/**
 * 
 */
package com.home.care.login;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.home.care.bo.User;
import com.home.care.bo.Userface;
import com.home.care.db.UserRepo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.security.InvalidKeyException;

/**
 * @author bhabesh
 *
 */
@Service
public class LoginService {
	@Autowired UserRepo userRepo;
	@Value("${application.security.access.token.secret}")
	String accessTokenSecret;
	@Value("${application.security.refresh.token.secret}")
	String refreshTokenSecret;
	
	Long ACCESS_TOKEN_VALIDITY	= 10L;
	Long REFRESH_TOKEN_VALIDITY = 10L;
	
	public LoginUser register(LoginUser loginUser) {
		User user = loginUser.getUser();
		return new LoginUser(userRepo.save(user));
	}
	
	public Optional<User> findByEmail(String strParamEmail) {
		return userRepo.findByEmail(strParamEmail);
		
	}

	public Optional<Userface> findByUserId(Long longParamId) {
		return userRepo.findByUserId(longParamId);
		
	}
	
	public Token getToken(User user)  {
		try {
			return Token.of(user.getId(), ACCESS_TOKEN_VALIDITY, accessTokenSecret);
		} catch (InvalidKeyException | NoSuchAlgorithmException e) {
			return Token.of(e.getMessage());
		}
	}

	public Token getToken(User user, String secretKey)  {
		try {
			return Token.of(user.getId(), ACCESS_TOKEN_VALIDITY, secretKey);
		} catch (InvalidKeyException | NoSuchAlgorithmException e) {
			return Token.of(e.getMessage());
		}
	}
	
	
	public Login login(User user) {
		try {
			return Login.of(user.getId(), accessTokenSecret, refreshTokenSecret, ACCESS_TOKEN_VALIDITY, REFRESH_TOKEN_VALIDITY);
		} catch (InvalidKeyException | NoSuchAlgorithmException e) {
			return Login.of(e.getMessage());
		}
		
	}
	
	public Long getAccessClaim(String token, String searchString) throws ResponseStatusException{
		
		Long userId = 0L;
		try {
			Claims claims = Token.getClaim(token, accessTokenSecret);
			userId = Long.valueOf((Integer)claims.get(searchString));
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Token not exists or expired");
		}
		return userId;
	}

	public Long getRefreshClaim(String token, String searchString) throws ResponseStatusException{
		
		Long userId = 0L;
		try {
			Claims claims = Token.getClaim(token, accessTokenSecret);
			userId = Long.valueOf((Integer)claims.get(searchString));
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Token not exists or expired");
		}
		return userId;
	}	
	
	
	public Login refreshAccess(String strRefreshToken) {
		Long userId = getRefreshClaim(strRefreshToken, "userid");
		User user	= new User();
		user.setId(userId);
		Token accessToken = getToken(user);
		Token refreshToken = Token.of(strRefreshToken);
		
		return Login.of(accessToken, refreshToken);
	}
	
}
