package com.aia.op.member.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.jdbc.ConnectionProvider;
import com.aia.op.member.dao.MemberDao;

@Service
public class IdCheckService {

	@Autowired
	MemberDao dao;
	
	public String checkId(String uid) {
		String result = "N";
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnectionProvider.getConn();
			resultCnt=dao.countById(conn, uid);
			
			if(resultCnt<1) {
				result = "Y";
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
