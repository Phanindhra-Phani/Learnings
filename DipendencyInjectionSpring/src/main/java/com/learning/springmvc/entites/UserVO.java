package com.learning.springmvc.entites;

public class UserVO {
	
	private String usermail;
	private String password;
	
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserVO [usermail=" + usermail + ", password=" + password + "]";
	}

}
