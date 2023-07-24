package com.spring.user_management.component;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class user {

	@Id
	private int userId;
	private String userName;
	private long userPhNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserPhNo() {
		return userPhNo;
	}
	public void setUserPhNo(long userPhNo) {
		this.userPhNo = userPhNo;
	}
	@Override
	public String toString() {
		return "user [userId=" + userId + ", userName=" + userName + ", userPhNo=" + userPhNo + "]";
	}
	
	
}
