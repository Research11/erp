<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示页面</title>
</head>
<body>
<table>
<tr><td>学生编号</td><td>学生姓名</td><td>学生邮箱</td><td>出生日期</td></tr>
<c:forEach var="i" items="${list}" varStatus="Status">
<tr>
<td>${i.id}</td>
<td>${i.name}</td>
<td>${i.email}</td>
<td>${i.birthday}</td>
</tr>
</c:forEach>
</table>
</body>
</html>