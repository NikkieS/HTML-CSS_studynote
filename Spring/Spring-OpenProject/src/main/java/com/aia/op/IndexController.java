package com.aia.op;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
	
	@RequestMapping("/")
	public String index() {
		String str = null;
		str.toString();
		
		return "index";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException e) {
		
		e.printStackTrace();
		
		return "error/nullPointer";
	}
}
