<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form name="login" action="/DipendencyInjectionSpring/spring-mvc/login" method="post"
		accept-charset="utf-8">
		<label for="usermail">Email</label> 
			<input type="email" name="usermail" placeholder="yourname@email.com" required> 
		<label for="password">Password</label> 
			<input type="password" name="password" placeholder="password" required>
			
			<input type="submit" value="Login">
	</form>

</body>
</html>