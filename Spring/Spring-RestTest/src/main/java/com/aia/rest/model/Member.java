package com.aia.rest.model;

import java.util.Date;

public class Member {
	
	private int id;
	private String name;
	private String email;
	private String photo;
	private Date regdate;

	public Member(int id, String name, String email, String photo, Date regdate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.photo = photo;
		this.regdate = regdate;
	}	
	
	public Member() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
