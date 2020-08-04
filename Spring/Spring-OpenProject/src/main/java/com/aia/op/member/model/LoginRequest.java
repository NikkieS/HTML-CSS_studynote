package com.aia.op.member.model;

public class LoginRequest {
	private String uid;
	private String upw;
	private String redirUri;
	private String remember;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getRedirUri() {
		return redirUri;
	}
	public void setRedirUri(String redirUri) {
		this.redirUri = redirUri;
	}
	public String getRemember() {
		return remember;
	}
	public void setRemember(String remember) {
		this.remember = remember;
	}
	@Override
	public String toString() {
		return "LoginRequest [uid=" + uid + ", upw=" + upw + ", redirUri=" + redirUri + ", remember=" + remember + "]";
	}
}
