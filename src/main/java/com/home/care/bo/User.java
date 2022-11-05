/**
 * 
 */
package com.home.care.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author bhabesh
 *
 */
@Getter
@Setter
@ToString
public class User {
	@Id private Long id;
	private String firstName;
	private String lastName;
	private	String email;
	private String password;
	
	
	public static User of(String firstName, String lastName, String email, String password) {
		return new User(null, firstName, lastName, email, password);
	}
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param password
	 */
	@PersistenceConstructor
	private User(Long id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
}
