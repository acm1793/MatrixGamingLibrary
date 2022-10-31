<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<form action="login" method="post">
		<h2 style="margin-left: 370px; color: Green; margin-top: 190px">Welcome
			to your Gaming Library!</h2>
		<div style="margin-left: 370px; margin-right: 350px">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Email
				address</label> <input type="text" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp" name="username">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" class="form-control"
				id="exampleInputPassword1" name="password">
		</div>
		<button style="margin-left: 120px" type="submit" class="btn btn-primary">Login</button> <br>
		<br>
		<a style="margin-left: 50px; margin-top: 100px" href="registration">New User? Register here!</a>
		</div>
		
	</form>
</body>
</html>