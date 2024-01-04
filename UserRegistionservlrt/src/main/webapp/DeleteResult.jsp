<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${result==1 }">

<h1>Data Delete Successfully....<%=request.getParameter("mobile") %></h1>

</c:if>

<c:if test="${result==0 }">

<h1>Data Not Available with given mobile<%=request.getParameter("mobile") %></h1>

</c:if>

<jsp:include page="deleteuser.html"></jsp:include>



</body>
</html>