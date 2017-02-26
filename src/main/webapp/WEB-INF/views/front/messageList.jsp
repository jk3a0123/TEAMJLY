<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
		
		<div class="row">
		<div > 번호 / 누가 / 제목 / 내용 / 파일</div><br>
		<c:forEach var="contactVO" items="${contactVO }">
		<div><a href="messageView?cno=${contactVO.cno }">${contactVO.cno } / ${contactVO.mno } / ${contactVO.subject } / ${contactVO.content } /  ${contactVO.file }</a></div>
		
		</c:forEach>
		</div>
		<a href="sendMessage?mno=${contactVO.mno}"><input type="button" value="건의"></a>
		
		
		
</body>
</html>