/**
 * 
 */
package com.home.care.login;

import java.security.NoSuchAlgorithmException;

import io.jsonwebtoken.security.InvalidKeyException;

/**
 * @author bhabesh
 *
 */
public class Login {
	private final Token accessToken;
	private final Token refreshToken;
	private  String messageLogin;
	

	/**
	 * @return the accessToken
	 */
	public Token getAccessToken() {
		return accessToken;
	}

	/**
	 * @return the refreshToken
	 */
	public Token getRefreshToken() {
		return refreshToken;
	}
	
	
	/**
	 * @return the messageLogin
	 */
	public String getMessageLogin() {
		return messageLogin;
	}

	private Login(String messageLogin) {
		this.messageLogin = messageLogin;
		this.accessToken = null;
		this.refreshToken = null;
	}
	
	public static Login of (String messageLogin) {
		return new Login(messageLogin);
	}
	
	private Login(Token accessToken, Token refreshToken) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}
	
	public static Login of (Long userid, String accessSecret, String refreshSecret) throws InvalidKeyException, NoSuchAlgorithmException {
		return new Login(
				Token.of(userid, 1L, accessSecret),
				Token.of(userid, 1L, refreshSecret)
				);
	}
}
