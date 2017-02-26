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
<h1>글 등록</h1>
<form method="post" id="register">
	title
	<input type="text" name="title">
	writer
	<input type="text" name="writer">
	content
	<input type="text" name="content">
<!-- 	opendate -->
<!-- 	<input type="text" name="opendate">
	closedate
	<input type="text" name="closedate">
	image
	<input type="text" name="boardimage"> -->

</form>
<button class="regBtn">등록하기</button>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".regBtn").on("click" , function() {
		$("#register").attr("action" , "boardregister").submit();
	});
});
</script>
</body>
</html>