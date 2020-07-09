<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	// var form = document.getElementById("delForm").submit;
	
	function check(){
		document.getElementById("delForm").submit();
		if(confirm('삭제하시겠습니까?')){
			return true;
		}else{
			return false;
		};
	}
	/* form.onsubmit = function(){
		alert('삭제하기');
		confirm();
		return false;
	} */
	
</script>
<body>
	<h3>메시지를 삭제하고자 하시면 비밀번호를 입력해 주세요.</h3>
	<form id="delForm" action="deleteMessage.jsp" method="post" onsubmit="check()">
		비밀번호 <input type="password" name="pw">
		<input type="hidden" name="mid" value="${param.mid }">
		<input type="submit" value="삭제하기">
	</form>
</body>
</html>