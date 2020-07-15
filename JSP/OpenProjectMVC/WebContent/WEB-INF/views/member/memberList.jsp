<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/css/default.css"/>" type="text/css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<style>
	table{
		margin: 10px 20px;
	}
	td>img{
		width: 100px;
		height: 100px;
	}
	td{
		text-align: center;
	}
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<h1 id="header">회원 리스트</h1>
	<hr>
	<table border="1">
		<tr>
			<th>No.</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>첨부파일</th>
		</tr>
	<c:if test="${not empty listView.memberList }">
	<c:forEach items="${listView.memberList }" var="member">
		<tr>
			<td>${member.idx }</td>
			<td>${member.uid }</td>
			<td>${member.upw }</td>
			<td>${member.uname }</td>
			<td><img alt="img" src="<c:url value="${member.uphoto }"/>"></td>
			<td>수정 | <a href="javascript:memberDel(${member.idx }, ${member.upw })">삭제</a></td>
		</tr>
	</c:forEach>
	</c:if>
	</table>
	
	<div class="paging">
		<c:forEach begin="1" end="${listView.pageTotalCount }" var="num">
		<a class="paging_num ${num == listView.currentPage ? 'now_page': '' }" href="memberList.do?page=${num }">[${num }]</a>
		</c:forEach>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
<script>
	function memberDel(idx, upw){
		if(confirm("선택하신 회원 정보를 삭제하시겠습니까?")){
			var pw = prompt("삭제하실 회원의 비밀번호를 입력해주세요.");
			if(upw==pw){
				location.href="memberDelete.do?idx="+idx;
			} else{
				alert("입력하신 비밀번호가 일치하지 않습니다.");
				return false;
			}
		}
	}
</script>