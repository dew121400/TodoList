<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method= "post" action="${pageContext.request.contextPath}/LoginPost">
<table>
<tr><td>Username: </td><td><input name ="username" type="text" /></td></tr> 
<tr><td>password: </td><td><input name ="password" type="text" /></td></tr> 
<tr><td> <input type= "submit" value= "submit"/> </td></tr>
</table>
</form>
</body>
</html>