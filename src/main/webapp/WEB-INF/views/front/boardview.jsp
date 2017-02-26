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
${view.title}
${view.content}
${view.writer}
${view.opendate}
${view.regdate}
<button class="modifyBtn" value="${view.bno}">수정하기</button>
<button class="deleteBtn" value="${view.bno}">삭제하기</button>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".modifyBtn").on("click" , function(event) {
		event.preventDefault();
		var bno = event.target.value;
		console.log(bno);
		console.log("modify called..");
		$("<form action='boardmodify' method='get'><input type='hidden' name='bno' value='"+bno+"'></form>").appendTo("body").submit();
		
	});
	$(".deleteBtn").on("click" , function (event) {
		event.preventDefault();
		var bno = event.target.value;
		console.log(bno);
		console.log("delete called..");
		$("<form action='boarddelete' method='post'><input type='hidden' name='bno' value='"+bno+"'></form>").appendTo("body").submit();
	});
	
	
	
});

</script>
</body>
</html>