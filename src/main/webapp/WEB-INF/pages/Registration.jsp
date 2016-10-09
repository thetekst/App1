<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="register" method="post" commandName="userForm">
	   <table>
	   <tr>
	        <td><form:label path="login">Login</form:label></td>
	        <td><form:input path="login" /></td>
	    </tr>
	    <tr>
	        <td><form:label path="fio">FIO</form:label></td>
	        <td><form:input path="fio" /></td>
	    </tr>
	    <tr>
	        <td><form:label path="phone">Phone</form:label></td>
	        <td><form:input path="phone" /></td>
	    </tr>
	    <tr>
	        <td colspan="2">
	            <input type="submit" value="Add"/>
	        </td>
	    </tr>
	</table>  
	</form:form>
</body>
</html>