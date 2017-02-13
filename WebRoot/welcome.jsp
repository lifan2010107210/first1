<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="1">
			<tr>
				<td>人员编号</td>
				<td>登录名</td>
				<td>密码</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${ulist}" var="u">
				<tr>
					<td>${u.userId}</td>
					<td>${u.userName}</td>
					<td>${u.userPwd}</td>
					<td>
						<a href="userAction?flag=delete&userId=${u.userId}">删除</a>
						<!-- 去修改的路上，要把查询的内容查出放到request中带到下一个页面 -->
						<a href="userAction?flag=toUpdate&userId=${u.userId}">修改</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="add.jsp">新增用户</a>
	</center>
</body>
</html>