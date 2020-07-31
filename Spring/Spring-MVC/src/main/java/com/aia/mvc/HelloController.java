package com.aia.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")	// uri가 hello일때의 요청을 처리해준다
	public String hello(Model model) {
		// Model 객체는 springframe에서 제공 하여 공유할 수 있게 한다.
		
		// data를 저장하여 전달
		model.addAttribute("msg", "안녕하세요");
		
		return "hello/hello";
		// /WEB-INF/views/hello/hello.jsp 폴더를 생성해서 넣어줄 수 있다.
	}
}
