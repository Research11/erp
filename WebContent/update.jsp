<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function back(){
		window.history.go(-1);
	}
</script>
</head>
<body>
	<form action="saveupdate" method="post">
		<input type="text" name="stu.id" value="${student.id}" readonly="readonly"/>
		<input type="text" name="stu.name" value="${student.name}"/>
		<input type="text" name="stu.email" value="${student.email}"/>
		<input type="text" name="stu.birthday" value="${student.birthday}"/>
		<input type="submit" value="保存"/>
		<!-- <input type="button" onclick="javascript:history.back(-1);" value="返回"/> -->
		<input type="button" onclick="back()" value="返回"/>
	</form>
</body>
</html>