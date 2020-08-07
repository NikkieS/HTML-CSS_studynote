package com.aia.mm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aia.mm.model.Member;
import com.aia.mm.service.MemberListService;

@RestController
@RequestMapping("/members")	// /members?pageNum=1&cnt=10
public class MemberRestController {
	
	@Autowired
	MemberListService listService;
	
	// 회원의 리스트: JSON으로 응답
	@GetMapping		// GET | /members
	public List<Member> getMemberList(){
		return listService.getMemberList();
	}
	
	// 회원 가입
	@PostMapping	// POST | /members
	public int reg() {
		return 0;
	}
	
	// 한명의 회원 정보 보기
	@GetMapping("/{idx}")	// GET | /members
	public Member getMember() {
		return null;
	}
	
	// 한명의 회원 정보 수정
	@PutMapping("/{idx}")	// PUT | /members/{idx}
	public int edit() {
		return 0;
	}
	
	// 한명의 회원 삭제
	@DeleteMapping("/{idx}")// DELETE | /members
	public int delete() {
		return 0;
	}
	
//	@GetMapping
//	public String test() {
//		return "Request GET";
//	}
}
