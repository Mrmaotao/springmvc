<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<h1>${message}</h1>
	<table>
		<tr>
			<td>\${1.2 + 2.3}</td>
			<td>${1.2 + 2.3}</td>
		</tr>
		<tr><td>session中记录访问次数：${count1}</td></tr>
		<tr><td>session的id：${sessionid}</td>
		</tr>
		<tr>
		<td>session的maxTime：${time}</td>
		</tr>
		<tr>
		<td>学生名字：${student.name}</td>
		</tr>
		<tr>
		<td>学生年龄：${student.age}</td>
		</tr>
	</table>
	<hr>
	<div>
		
		
	</div>
	
	</div>
</body>
</html>