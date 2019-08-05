<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <table>
         <form action="StudentServlet" method="get">
          <tr>
             <td>ROLL</td><td><input type="text" name="roll" id="roll"/></td>
          </tr>
          <tr>
             <td>NAME</td><td><input type="text" name="name" id="name"/></td>
          </tr>
          <tr>
             <td>MARKS</td><td><input type="text" name="marks" id="marks"/></td>
          </tr>
          <tr>
              <td>  <input type="submit" value="show"/> </td>
          </tr>
         </form>         
     </table>
</body>
</html>