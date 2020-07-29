package di.service;

import di.dao.Dao;
import di.domain.Member;
import di.exception.IdPasswordNotMatchingException;
import di.exception.MemberNotFoundException;

public class ChangePasswordService2 {
	private Dao dao;
	
	// setter를 사용한 메소드 주입방식
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void changePassword(String email, String oldPwd, String newPwd) throws IdPasswordNotMatchingException, MemberNotFoundException {
		Member member = dao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();

		member.changePassword(oldPwd, newPwd);

		dao.update(member);
	}

}
