<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>noticeregister</title>
</head>
<body>

<form action ="/front/noticeregister"  method = "post" id="register">
	<input type="text"  name = "title"> 
	<input type="text"  name = "content"> 
	<input type="post"  name = "mno" > 
   <input type="button"  id="regbtn" value = "클릭"></button>
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
$(document).ready(function (){
	 
	$("#regbtn").on("click", function(event){
		console.log(event);
		$("#register").submit();
	});
	
});
	


</script>
</html>