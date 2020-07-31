package di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.config.JavaConfig;
import di.dao.MemberDao;
import di.exception.AlreadyExistingMemberException;
import di.service.ChangePasswordService;
import di.service.MemberRegisterService;

public class MainForSpringJavaConfig {
	public static void main(String[] args) throws AlreadyExistingMemberException {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		MemberRegisterService regSvc = ctx.getBean("regSvc", MemberRegisterService.class);

		ChangePasswordService changeSvc = ctx.getBean("changePwSvc", ChangePasswordService.class);
		
		MemberDao dao = ctx.getBean("dao", MemberDao.class);
		
		System.out.println(regSvc);
		System.out.println(dao);
		System.out.println(changeSvc);
		
	}
}
