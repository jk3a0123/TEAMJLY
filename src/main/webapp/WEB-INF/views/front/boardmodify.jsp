<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="modify" method="post">
	<input type="hidden" name="bno" value="${modify.bno}">
	<input type="text" name="title" value="${modify.title}">
	<input type="text" name="title" value="${modify.writer}">
	<input type="text" name="title" value="${modify.content}">
	<input type="text" name="title" value="${modify.opendate}">
	<input type="text" name="title" value="${modify.closedate}">
	<%-- <input type="file" name="file" value="${modify.boardimage}"> --%>
</form>
	<button class="modifyBtn">수정하기</button>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".modifyBtn").on("click" , function(event) {
		$("#modify").attr("action" , "boardmodify").submit();
	});
});
</script>
</body>
</html>