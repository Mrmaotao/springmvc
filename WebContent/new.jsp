<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<h1>我很好的</h1>
	</div>
	<form action="add1" method="post">
 
    产品名称 ：<input type="text" name="name" value=""><br />
    产品价格： <input type="text" name="age" value=""><br />
 
    <input type="submit" value="增加商品">
</form>
<form action="uploadImage" method="post" enctype="multipart/form-data">
	  选择图片:<input type="file" name="image" accept="image/*" /> <br> 
	<input type="submit" value="上传" />
	
</form>
</body>
</html>