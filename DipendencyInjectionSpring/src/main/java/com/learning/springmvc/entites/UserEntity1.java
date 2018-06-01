package com.learning.springmvc.entites;

public class UserEntity1 {
	
	public Integer userId;
	public String userFirstName;
	private String userLastName;
	private Integer age;
	private String storyType;
	
	@Override
	public String toString() {
		return "UserEntity1 [userId=" + userId + ", userFirstName="
				+ userFirstName + ", userLastName=" + userLastName + ", age="
				+ age + ", storyType=" + storyType + "]";
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getStoryType() {
		return storyType;
	}
	public void setStoryType(String storyType) {
		this.storyType = storyType;
	}
	
	

}
