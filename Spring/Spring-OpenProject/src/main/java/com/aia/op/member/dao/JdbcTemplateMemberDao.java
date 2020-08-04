package com.aia.op.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.aia.op.member.model.Member;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateMemberDao {
	
	@Inject
	JdbcTemplate jdbcTemplate;
	
	public int selectTotalCount() throws SQLException {
		
//		int resultCnt = 0;
//		String sql = "select count(*) from project.member";
//		
//		resultCnt = jdbcTemplate.queryForObject(sql, Integer.class);
//		
//		return resultCnt;
		
		return jdbcTemplate.queryForObject("select count(*) from project.member", Integer.class);
	}
	
	public List<Member> selectList(int startRow, int countperpage) throws SQLException{
		
//		List<Member> list = new ArrayList<Member>();
//		String sql = "select * from project.member order by uname limit ?, ?";
//		
//		// Object[] args는 순서대로 넣어줌
//		list = jdbcTemplate.query(sql, new Object[] {startRow, countperpage}, new MemberRowMapper());
//		
//		return list;
		
		return jdbcTemplate.query("select * from project.member order by uname limit ?, ?", new Object[] {startRow, countperpage}, new MemberRowMapper());
	}
}