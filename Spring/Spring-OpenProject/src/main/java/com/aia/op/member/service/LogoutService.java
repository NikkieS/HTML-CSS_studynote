package com.aia.op.member.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class LogoutService {

	public boolean logout(HttpSession session) {
		session.invalidate();
		
		return true;
	}
}
