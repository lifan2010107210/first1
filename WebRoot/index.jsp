<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userAction" method="post">
		<input type="hidden" name="flag" value="login"/>
		<input type="text" name="userName"/>
		<input type="text" name="userPwd"/>
		<input type="submit" value="提交"/>
	</form>
	
	
</body>
</html>