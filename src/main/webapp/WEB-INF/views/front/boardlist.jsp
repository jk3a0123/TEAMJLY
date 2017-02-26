<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row"><button class="regBtn">등록하기</button></div>
	<c:forEach var="list" items="${list}">
		<c:choose>
			<c:when test="${list.bno mod 2 != 0}">
				<div class="row">
					<div class="col-md-4">${list.boardimage}</div>
					<div class="col-md-8">${list.content}</div>
					<button class="viewBtn" value="${list.bno}">참여하기</button>
				</div>
			</c:when>
			<c:otherwise>
				<div class="row">
					<div class="col-md-8">${list.boardimage}</div>
					<div class="col-md-4">${list.content}</div>
					<button class="viewBtn" value="${list.bno}">참여하기</button>
				</div>
			</c:otherwise>
		</c:choose>
	</c:forEach>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	var result = "${result}";
	switch (result){
		case "registertrue" : alert("reg success!");
		break;
		case "modifytrue" : alert("modify success!");
		break;
		case "deletetrue" : alert("delete success!");
		break;
	}
	
	$(".viewBtn").on("click" , function (event) {
		event.preventDefault();
		var bno = event.target.value;
		console.log ("bno :" + bno);
		console.log("click...");
		$("<form method='get' action='boardview'><input type='hidden' name='bno' value='"+bno+"'></form>").appendTo("body").submit();
	});
	
	$(".regBtn").on("click" , function () {
		$("<form method='get' action='boardregister'></form>").appendTo("body").submit();
	});
	
});
</script>
</body>
</html>