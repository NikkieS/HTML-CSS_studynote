package com.aia.op.member.model;

import java.sql.Date;
import java.util.Random;

public class Member {
	private int idx;
	private String uid;
	private String upw;
	private String uname;
	private String uphoto;	// 사진 이름
	private Date regdate;	// sql에서 불러오기
	// 이메일 인증코드
	private String code;
	


	// 이메일 인증여부 확인
	private char verify;
	
	
	public Member(int idx, String uid, String upw, String uname, String uphoto, String code, Date regdate) {
		this.idx = idx;
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.uphoto = uphoto;
		this.code = code;
		this.regdate = regdate;
		
		//2020.08.11 추가
		getRandomString();
	}
	
	// 2020.08.11 추가
	private void getRandomString() {
		Random r = new Random(System.nanoTime());
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<20; i++) {
			// true / false 둘중 하나
			if(r.nextBoolean()) {
				sb.append(r.nextInt(10));	// 0~9 정수 값
			} else {
				sb.append((char)(r.nextInt(26)+97));	// 영문자
			}
		}
		System.out.println("난수 코드 생성: "+sb);
		setCode(sb.toString());
	}

	// MemberRegRequest -> Member
	public Member(String uid, String upw, String uname) {
		this(0, uid, upw, uname, null, null, null);
	}

	public Member() {
		getRandomString();
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	// 2020.08.11 추가
	public String getCode() {
		return code;
	}
	// 2020.08.11 추가
	public void setCode(String code) {
		this.code = code;
	}
	// 2020.08.11 추가
	public char getVerify() {
		return verify;
	}
	// 2020.08.11 추가
	public void setVerify(char verify) {
		this.verify = verify;
	}
	
	public LoginInfo toLoginInfo() {
		return new LoginInfo(uid, uname, uphoto);
	}

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", uphoto=" + uphoto
				+ ", regdate=" + regdate + "]";
	}
}
