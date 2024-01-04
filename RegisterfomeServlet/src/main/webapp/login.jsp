<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login services</title>
</head>
<body>
<c:if test="${status==true}">

valid users....<%=request.getParameter("username") %>

</c:if>

<c:if test="${status==false}">

invalid users<%=request.getParameter("username") %>

</c:if>

</body>
</html>