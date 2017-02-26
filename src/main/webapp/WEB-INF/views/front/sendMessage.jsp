<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" id="messageForm" action="/front/sendMseesage">
	
	<div><input type="hidden" name="cto" id="cto" value="1"></div>
	<div>보내는 사람<input type="text" name="mno" id="mno" value="${mno }"readonly="readonly"></div>
	<div>제목<input type="text" name="subject" id="subject"/></div>
	<div>내용<input type="textarea" name="content" id="content"/></div>
	<div>파일<input type="file" name="file" id="file"></div>
	
	</form>
	<input type="button" value="버튼" id="regBtn">
	
	<script src="https://www.gstatic.com/firebasejs/3.6.10/firebase.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script>
	$(document).ready(function(){
		var config = {
			    apiKey: "AIzaSyBDo2iK5q3Wpib_qAx7UFAmaw0wGjM3Yt4",
			    authDomain: "teamjly-9b77b.firebaseapp.com",
			    databaseURL: "https://teamjly-9b77b.firebaseio.com",
			    storageBucket: "teamjly-9b77b.appspot.com",
			    messagingSenderId: "566441035787"
			  };
			  firebase.initializeApp(config);
   		    var storage = firebase.storage();
   		    var downloadRef =  storage.refFromURL("gs://kb141-17d6a.appspot.com/ContactFile/");
   		    var uploadRef = storage.ref();

   		    // login
   		    firebase.auth().signInWithEmailAndPassword("teamjly@gmail.com", "teamjly").catch(function(error) {
   		        // Handle Errors here.
   		        console.log('error sign');
   		        var errorCode = error.code;
   		        var errorMessage = error.message;
   		    });
   		    
   		    // checked login
   		    firebase.auth().onAuthStateChanged(function(user) {
   		        var currentUser = firebase.auth().currentUser;
   		        if (currentUser) {
   		            console.log(currentUser.uid);
   		        } else {
   		            console.log("no user");
   		        }
   		    });
   			
		 	$("#regBtn").on("click", function () {
 	   		$("#content").val($("#content").val().replace(/\n/g, "<br>"));
 	   		
 	   		var image = $("#file")[0].files;
 	   		console.log(image);
			for(var i = 0 ; i < image.length ; i ++){
				/* $("<input type='hidden' name='imagenames' value='"+ image[i].name+"'>").appendTo("#sending"); */ 
				var uploadURL = uploadRef.child("ContactFile/" + image[i].name);
			    var uploadTask = uploadURL.put(image[i]); 
			    
			    uploadTask.on('state_changed', function(snapshot){
			            // Observe state change events such as progress, pause, and resume
			            // See below for more detail
			        }, function(error) {
			            // Handle unsuccessful uploads
			        }, function() {
			            // Handle successful uploads on complete
			            // For instance, get the download URL: https://firebasestorage.googleapis.com/...
			            var downloadURL = uploadTask.snapshot.downloadURL;
			            $("#messageForm").attr("method","post").submit();
			       });
			}
			
			
			
		 	});
		
		 	
		
		

	});
	</script>
</body>
</html>