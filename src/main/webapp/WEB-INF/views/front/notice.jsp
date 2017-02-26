<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NOtice</title>
</head>
<body>

<ul>
									<c:forEach items="${list}"  var = "list" >
												<li>
														<a href = "/front/noticeview?nno=${list.nno}">${list.nno},  ${list.title}, ${list.id}, ${list.views}, ${list.regdate}, ${list.updatedate}</a>
												</li>
									</c:forEach>
</ul>

<form  action="/front/noticeregister"  mehtod="get">
<input type="button"  value = "클릭" id="goregister"></input>
</form>

</body>

<script>
$(document).ready(function (){
	 
		$("#goregister").on("click", function(event){
				console.log(event);
		});
	
});

</script>


</html>