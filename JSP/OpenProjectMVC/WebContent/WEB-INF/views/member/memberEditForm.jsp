<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String idx = request.getParameter("idx");
	request.setAttribute("idx", idx);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css" type="text/css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<style>
	.check_ok{
		color: blue;
	}
	.check_not{
		color: red;
	}
	#idchk{
		display: none;
	}
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<div>
		<h1 id=header>회원정보 수정</h1>
		<hr>
		<form action="memberEdit.do" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>아이디(email)</td>
					<td>
						<input type="email" name="uid" id="uid" required>
						<span id="checkmsg"></span>
						<input type="checkbox" id="idchk">
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="upw" required></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="uname" required></td>
				</tr>
				<tr>
					<td>사진</td>
					<td><input type="file" name="uphoto"></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="hidden" value="${idx }" name="nIdx">
						<input type="submit" value="수정 완료" id="regForm">
						<input type="reset" value="초기화">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
<script>
	$(document).ready(function(){
		$("#regForm").submit(function(){
			if(!($("#idchk").prop('checked'))){
				alert('아이디 중복 체크는 필수 항목입니다.');
				$('#uid').focus();
				return false;
			};
		});
		$("#uid").focusin(function(){
			$(this).val('');
			$("#idchk").prop('checked', false);
			
			$("#checkmsg").text("");
			
			$("#checkmsg").removeClass("check_ok");
			$("#checkmsg").removeClass('check_not');
		});
		$("#uid").focusout(function(){
			if($(this).val().length<1){
				$("#checkmsg").text("아이디는 필수 항목입니다.");
				$("#checkmsg").addClass("check_not");

				return false;
			}
			// 비동기 통신
			$.ajax({
				url: 'idCheck.do',
				data: {uid: $(this).val()},
				success: function(data){
					if(data == 'Y'){
						$("#checkmsg").text("사용가능한 아이디 입니다.");

						$("#checkmsg").addClass("check_ok");
						$("#idchk").prop('checked', true);
					} else{
						$("#checkmsg").text("이미 사용중인 아이디 입니다.");

						$("#checkmsg").addClass("check_not");
						$("#idchk").prop('checked', false);
					}
				}
			});
		});
	});
</script>