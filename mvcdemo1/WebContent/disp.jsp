<%@ page import="com.student.model.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <%
           Student student=(Student)request.getAttribute("studentdetails");  
           out.print(student.getRoll());
           out.print(student.getName());
           out.print(student.getMarks());
       %>
</body>
</html>