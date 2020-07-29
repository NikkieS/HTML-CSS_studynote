package di.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import di.service.ChangePasswordService2;
import di.service.MemberRegisterService2;

public class MainForSpring7 {
	
	private static GenericXmlApplicationContext ctx = null;

	public static void main(String[] args) {
		
		ctx = new GenericXmlApplicationContext("classpath:appCtx7.xml");
		
		MemberRegisterService2 mrService1 = ctx.getBean("memberregSvc", MemberRegisterService2.class);
		MemberRegisterService2 mrService2 = ctx.getBean("memberregSvc", MemberRegisterService2.class);
		
		boolean chk1 = mrService1==mrService2;
		System.out.println("mrService1==mrService2 ? " + chk1);	// scope= prototype 이기 때문에 각기 다른 생성자를 사용
		
		ChangePasswordService2 cpService1 = ctx.getBean("memberPwSvc", ChangePasswordService2.class);
		ChangePasswordService2 cpService2 = ctx.getBean("memberPwSvc", ChangePasswordService2.class);
		
		boolean chk2 = cpService1==cpService2;
		System.out.println("cpService1==cpService2 ? " + chk2);	// scope= singleton 이기 때문에 동일한 하나의 생성자를 사용

	}
}
