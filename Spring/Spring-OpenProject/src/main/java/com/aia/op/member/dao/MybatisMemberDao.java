package com.aia.op.member.dao;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aia.op.member.model.Member;

@Repository
public class MybatisMemberDao {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	private String mapperPath = "com.aia.op.mybatis.mapper.MemberMapper";
	
	public int insertMember(Member member) throws SQLException {
		//int resultCnt = 0;
		
		//String sql = "insert into project.member (uid, upw, uname, uphoto) values (?, ?, ?, ?)";
		
		
		//return resultCnt;
		
		return sessionTemplate.update(mapperPath+".insertMember", member);
	}
	
//	public int countById(Connection conn, String id) throws SQLException {
//		int resultCnt = 0;
//		ResultSet rs = null;
//		PreparedStatement pstmt = null;
//		
//		String sql = "select count(*) from project.member where uid=?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				resultCnt=rs.getInt(1);
//			}
//		} finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return resultCnt;
//	}
//	
//	public int selectTotalCount(Connection conn) throws SQLException {
//		int resultCnt = 0;
//		Statement stmt = null;
//		ResultSet rs = null;
//		
//		try {
//			stmt = conn.createStatement();
//			String sql = "select count(*) from project.member";
//			
//			rs = stmt.executeQuery(sql);
//			
//			if(rs.next()) {
//				resultCnt = rs.getInt(1);
//			}
//		} finally {
//			if(stmt != null) {
//				stmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return resultCnt;
//	}
//	
//	public List<Member> selectList(Connection conn, int startRow, int countperpage) throws SQLException{
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Member member = null;
//		
//		List<Member> list = new ArrayList<Member>();
//		String sql = "select * from project.member order by uname limit ?, ?";
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, startRow);
//			pstmt.setInt(2, countperpage);
//			
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				member = new Member();
//				member.setIdx(rs.getInt("idx"));
//				member.setUid(rs.getString("uid"));
//				member.setUpw(rs.getString("upw"));
//				member.setUname(rs.getString("uname"));
//				member.setUphoto(rs.getString("uphoto"));
//				
//				list.add(member);
//			}
//		} finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
////			if(conn != null) {
////				conn.close();
////			}
//		}
//		
//		return list;
//	}
//	
//	public int deleteMember(Connection conn, int idx) throws SQLException {
//		int resultCnt = 0;
//		PreparedStatement pstmt = null;
//		
//		String sql ="delete from project.member where idx=?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, idx);
//			
//			resultCnt = pstmt.executeUpdate();
//		} finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return resultCnt;
//	}
//	
//	public Member selectByIdx(Connection conn, int idx) throws SQLException {
//		Member member = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "select * from project.member where idx=?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, idx);
//			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				member = new Member();
//				member.setIdx(idx);
//				member.setUid(rs.getString("uid"));
//				member.setUpw(rs.getString("upw"));
//				member.setUname(rs.getString("uname"));
//				member.setUphoto(rs.getString("uphoto"));
//			}
//		} finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return member;
//	}
//	
//	public int editMember(Connection conn, Member member) throws SQLException {
//		int resultCnt = 0;
//		PreparedStatement pstmt = null;
//		String sql = "update project.member set upw=?, uname=?, uphoto=?, where idx=?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, member.getUpw());
//			pstmt.setString(2, member.getUname());
//			pstmt.setString(3, member.getUphoto());
//			pstmt.setInt(4, member.getIdx());
//			
//			resultCnt = pstmt.executeUpdate();
//		} finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return resultCnt;
//	}
//	
//	public Member selectByIdPw(String uid, String pw) throws SQLException {
//		Member member = null;
//
//		String sql = "select * from project.member where uid=? and upw=?";
//		sessionTemplate.update(mapperPath+".insertMember", member);
//		sessionTemplate.select
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, uid);
//			pstmt.setString(2, pw);
//			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				member = new Member();
//				member.setIdx(rs.getInt("idx"));
//				member.setUid(rs.getString("uid"));
//				member.setUpw(rs.getString("upw"));
//				member.setUname(rs.getString("uname"));
//				member.setUphoto(rs.getString("uphoto"));
//			}
//		} finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return member;
//	}
//	
//	public List<Member> selectTotalList(Connection conn) throws SQLException{
//		Member member = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		
//		List<Member> list = new ArrayList<Member>();
//		
//		String sql = "select * from project.member order by uname";
//		
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				member = new Member();
//				member.setIdx(rs.getInt("idx"));
//				member.setUid(rs.getString("uid"));
//				member.setUpw(rs.getString("upw"));
//				member.setUname(rs.getString("uname"));
//				member.setUphoto(rs.getString("uphoto"));
//				
//				list.add(member);
//			}
//		} finally{
//			if(stmt != null) {
//				stmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//		
//		return list;
//	}
}
