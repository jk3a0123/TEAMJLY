<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>	
	<h1> 회원 가입</h1>
	<form method="post" id="memberRegisterForm">
		아이디(이메일)<input type="email" name="id" id="id">
		비밀번호<input type="password" name="password" id="password">
		닉네임<input type="text" name="nickname" id="nickname">
		<!-- <input type="text" name="authority" id="authority"> -->
		파일<input type="file" name="profile_image" id="profile_image">
		
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
   		    var downloadRef =  storage.refFromURL("gs://kb141-17d6a.appspot.com/MemberFile/");
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
 	   		
 	   		var image = $("#profile_image")[0].files;
 	   		console.log(image);
			for(var i = 0 ; i < image.length ; i ++){
				/* $("<input type='hidden' name='imagenames' value='"+ image[i].name+"'>").appendTo("#sending"); */ 
				var uploadURL = uploadRef.child("MemberFile/" + image[i].name);
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
			            $("#memberRegisterForm").attr("method","post").submit();
			       });
			}
			
			
			
		 	});
		
		 	
		
		

	});
	</script>
</body>
</html>