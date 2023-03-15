/**
 * 
 */
package com.home.care.login;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.WeakKeyException;

/**
 * @author bhabesh
 *
 */
public class Token {
	private final String token;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	private Token(String token) {
		this.token = token;
	}
	
	public static Token of(String str) {
		return new Token (str);
	}
	/**
	 * 
	 * @param userid
	 * @param validityInMinutes
	 * @param secretKey
	 * @return
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public static Token of(Long userid, Long validityInMinutes, String secretKey ) throws InvalidKeyException, NoSuchAlgorithmException {
		Instant issueDate = Instant.now();
		String token = Jwts.builder()
							.claim("userid", userid)
							.setIssuedAt(Date.from(issueDate))
							.setExpiration(Date.from(issueDate.plus(validityInMinutes,ChronoUnit.MINUTES)))
							.signWith(getSigningKey(secretKey))
							.compact();
		
		return new Token (token);
	}
	
	/**
	 * 
	 * @param token
	 * @param secretKey
	 * @return
	 */
	public static Claims getClaim(String token, String secretKey) {
		Claims claims	= null;
		try {
			claims = (Claims)Jwts.parser()
						 .setSigningKey(getSigningKey(secretKey))
						 .parse(token)
						 .getBody();
		} catch (JwtException | ClassCastException | NoSuchAlgorithmException e) {
				System.out.println(e.getMessage());
		}
		return claims;
	}
	
	/**
	 * 
	 * @param secretKey
	 * @return
	 * @throws WeakKeyException
	 * @throws NoSuchAlgorithmException
	 */
	private static  Key getSigningKey(String secretKey) throws WeakKeyException, NoSuchAlgorithmException {
			return Keys.hmacShaKeyFor(makeSecretKey(secretKey));
		}
	/**
	 * 
	 * @param secretKey
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static byte[] makeSecretKey(String secretKey) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.update(secretKey.getBytes(StandardCharsets.UTF_8));
		return messageDigest.digest();
	}

	@Override
	public String toString() {
		return token;
	}
	
	
}
