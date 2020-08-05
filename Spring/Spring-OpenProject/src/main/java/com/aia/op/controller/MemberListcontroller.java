package com.aia.op.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.aia.mvc.member.service.MemberListService;
import com.aia.op.member.service.MemberListService2;

@Controller
public class MemberListcontroller {

	@Autowired
	MemberListService2 listService;
	
	@RequestMapping("/member/memberList")
	public String list(Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		model.addAttribute("listView", listService.getView(request, response));
		
		return "/member/memberList";
	}
}
