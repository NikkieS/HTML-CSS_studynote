package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.NullServiceImpl;
import service.Service;

public class FrontController extends HttpServlet {
	
	Map<String, Service> commands = new HashMap<String, Service>();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		// 1. commandSerice.properties(외부 설정) => Properties
		// /index = service.IndexServiceImpl
		// 2. 클래스 정보의 클래스들을 생성 -> 인스턴스 생성
		// 3. map에 사용자 요청 command와 인스턴스를 저장
		
		// 1. 외부 설정 파일의 내용을 메모리의 데이터로 이동
		Properties prop = new Properties();
		
		FileInputStream fis = null;
		
		// 설정파일의 웹경로
		String path = "/WEB-INF/commandService.properties";
		// 설정파일의 시스템 절대경로
		String configFile = config.getServletContext().getRealPath(path);
		
		try{
			fis = new FileInputStream(configFile);
			prop.load(fis);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		Iterator itr = prop.keySet().iterator();
		
//		while(itr.hasNext()) {
//			String command = (String) itr.next();
//			String serviceClassName = prop.getProperty(command);
//			System.out.println(command + "="+serviceClassName);
//		}
		
		while(itr.hasNext()) {
			// 사용자 요청  URI
			String command = (String) itr.next();
			// 사용자 요청의 처리를 위한 클래스 이름
			String serviceClassName = prop.getProperty(command);
			
			try {
				// 인스턴스 생성을 위한 Class 객체
				Class serviceClass = Class.forName(serviceClassName);
				
				// 인스턴스 생성
				Service service = (Service) serviceClass.newInstance();
				
				commands.put(command, service);
				System.out.println(command + "=" + service);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
//		commands.put("/", new IndexServiceImpl());
//		commands.put("/index", new IndexServiceImpl());
//		commands.put("/greeting", new GreetingServiceImpl());
//		commands.put("/date", new DateServiceImpl());
//		commands.put("null", new NullServiceImpl());
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 요청 파악: request 객체를 이용
		// request.getParmeter(name)
		// request.getRequestURL()
		// request.getRequestURI() ★★★★★	
		// String type = request.getParameter("type");
		String type = null;
		String command = request.getRequestURI();
		System.out.println(command);
		System.out.println(command.indexOf(request.getContextPath()));
		
		// /simple/
		if(command.indexOf(request.getContextPath())==0) {
			type = command.substring(request.getContextPath().length());
		}
		
		System.out.println("요청 파악: "+type);
		// String page = "/views/simple_view.jsp";
		
		// 3. 핵심 처리: 기능 수행
		// Object resultObj = null;
		Service service = commands.get(type);
		
		if(type==null) {
			service = new NullServiceImpl();
			
		}
		
		
		// http://localhost:8080/web/simple/greeting
		// http://localhost:8080/web/simple/date
//		if(type==null || type.equals("/greeting")) {
//			service = new GreetingServiceImpl();
////			resultObj = "안녕하세요";
////			page="view01.jsp";
//		} else if(type.equals("/date")) {
//			service = new DateServiceImpl();
////			resultObj = new Date();
////			page="view02.jsp";
//		} else if(type.equals("/") || type.equals("/index")) {
//			service = new IndexServiceImpl();
////			page="index.jsp";
//		} else {
//			service = new NullServiceImpl();
////			resultObj = "Invalid Type";
//		}
		//System.out.println("핵심처리 결과: "+resultObj);
		
		// 4. 결과 데이터를 속성에 저장: view페이지에 공유(전달)
		//request.setAttribute("result", resultObj);
		//System.out.println("속성에 저장");
		
		String page = service.getViewPage(request, response);
		
		// 5. 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
	
	// 1. Http의 요청을 받는다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

}
