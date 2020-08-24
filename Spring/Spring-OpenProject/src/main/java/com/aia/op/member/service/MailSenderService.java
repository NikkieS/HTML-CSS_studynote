package com.aia.op.member.service;

import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public class MailSenderService {

	@Autowired
	private JavaMailSender sender;
	
	public int send(String email) {
		
		MimeMessage message = sender.createMimeMessage();
		
		message.setSubject("[안내] 회원가입을 축하합니다.", "UTF-8");
		String htmlMsg = "<h1>회원가입을 축하합니다.</h1>";
		message.setText(htmlMsg, "UTF-8", "html");
		message.setFrom(new InternetAddress("thdrkfka0405@hanmail.net"));
		message.addRecipient(RecipientType.TO, new InternetAddress(email, "고객님", "UTF-8"));
		
		sender.send(message);
	}
	
	public void send(String getuId, String code) {
		MimeMessage message = sender.createMimeMessage();
		
		
	}

}
