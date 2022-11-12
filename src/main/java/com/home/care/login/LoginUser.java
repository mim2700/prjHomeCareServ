/**
 * 
 */
package com.home.care.login;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.home.care.bo.User;

/**
 * @author bhabesh
 *
 */
public class LoginUser {
	private Long id;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private	String email;
	private String password;
	@JsonProperty("password_confirm")
	private String passwordCconfirm;
	
	public LoginUser() {}
	
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param password
	 * @param passwordCconfirm
	 * @param loginUser
	 */
	public LoginUser(Long id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	/**
	 * 
	 * @param user
	 */
	public  LoginUser(User user) {
		this.id = user.getId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
	}	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/**
	 * @return the passwordCconfirm
	 */
	public String getPasswordCconfirm() {
		return passwordCconfirm;
	}


	/**
	 * @param passwordCconfirm the passwordCconfirm to set
	 */
	public void setPasswordCconfirm(String passwordCconfirm) {
		this.passwordCconfirm = passwordCconfirm;
	}


	/**
	 * 
	 * @return
	 */
	public User getUser() {
		return new User(this.firstName, this.lastName, this.email, this.password);
	}
	

	@Override
	public String toString() {
		return "LoginUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", passwordCconfirm=" + passwordCconfirm + "]";
	}
	
	
}
