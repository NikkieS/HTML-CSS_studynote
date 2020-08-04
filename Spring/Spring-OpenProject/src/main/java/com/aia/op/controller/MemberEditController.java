package com.aia.op.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aia.op.member.model.MemberEditRequest;
import com.aia.op.member.service.MemberEditService;

@Controller
@RequestMapping("/member/memberEdit")
public class MemberEditController {

	@Autowired
	MemberEditService editService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String editForm(@RequestParam("idx") int idx, Model model) {
		
		model.addAttribute("member", editService.getMember(idx));
		
		return "member/memberEditForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String edit(MemberEditRequest editRequest, HttpServletRequest request, Model model) {
		
		model.addAttribute("result", editService.memberEdit(editRequest, request));
		return "member/memberEdit";
	}
}
