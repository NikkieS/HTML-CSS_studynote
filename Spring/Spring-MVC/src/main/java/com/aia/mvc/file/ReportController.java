package com.aia.mvc.file;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aia.mvc.file.model.Report;

@Controller
public class ReportController {
	
	@RequestMapping("/report/reportForm")
	public String getReportForm() {
		
		return "report/reportForm";
	}
	
	// MultipartFile 객체를 사용하여 File IO
	@RequestMapping(value="/report/upload1", method=RequestMethod.POST)
	public String upload1(@RequestParam("sno") String sno, @RequestParam("report") MultipartFile report, Model model) {
		
		String fileName = report.getOriginalFilename();
		long fileSize = report.getSize();
		
		model.addAttribute("sno", sno);
		model.addAttribute("report", fileName+"("+fileSize+")");
		
		return "report/upload";
	}
	
	// MultipartHttpServletRequest 객체를 사용하여 File IO
	@RequestMapping(value="/report/upload2", method=RequestMethod.POST)
	public String upload2(MultipartHttpServletRequest request, Model model) {
		
		// reportForm에서 쓰였던 name들로 참조하여 데이터를 불러온다
		String sno = request.getParameter("sno");
		MultipartFile report = request.getFile("report");
		
		String fileName = report.getOriginalFilename();
		long fileSize = report.getSize();
		
		model.addAttribute("sno", sno);
		model.addAttribute("report", fileName+"("+fileSize+")");
		
		return "report/upload";
	}
	
	// Command 객체를 사용하여 File IO **Report객체와 자동 바인딩!**
	@RequestMapping(value="/report/upload3", method=RequestMethod.POST)
	public String upload3(Report report, Model model) {
		
		// reportForm에서 쓰였던 name들로 참조하여 데이터를 불러온다
		String sno = report.getSno();
		MultipartFile file = report.getReport();
		
		String fileName = file.getOriginalFilename();
		long fileSize = file.getSize();
		
		model.addAttribute("sno", sno);
		model.addAttribute("report", fileName+"("+fileSize+")");
		
		return "report/upload";
	}
}
