package com.aia.op.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aia.op.member.model.Member;
import com.aia.op.member.model.MemberXmlList;
import com.aia.op.member.service.MemberListJsonService;
//import com.aia.mvc.member.service.MemberListService;
import com.aia.op.member.service.MemberListService2;
import com.aia.op.member.service.MemberListXmlService;

@Controller
public class MemberListController {

	@Autowired
	MemberListService2 listService;
	@Autowired
	MemberListXmlService listXmlService;
	@Autowired
	MemberListJsonService listJsonService;
	
	@RequestMapping("/member/memberList")
	public String list(Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		model.addAttribute("listView", listService.getView(request, response));
		
		return "/member/memberList";
	}
	
	@RequestMapping("/member/memberList.xml")
	@ResponseBody	// jsp를 거치지 않고 xml 객체로 html에 반환
	public MemberXmlList xml() {
		//model.addAttribute("listXml", listXmlService.getXml());
		//return "/member/memberListXML";
		return listXmlService.getXml();
	}
	
	@RequestMapping("/member/memberList.json")
	@ResponseBody	// jsp를 거치지 않고 JSON 객체로 html에 반환
	public List<Member> json(){
		
		return listJsonService.getJson();
	}
}
