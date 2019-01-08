<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Tobi
  Date: 07.01.2019
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web-Application</title>
  </head>
  <body>
  <h1> Hello World! </h1>
  <p> Body text. This is y first web app  JSP page.
    Feel free to try to
    <a href="login.jsp">Login</a>
    or
    Sign-Up.
  </p>

  <%
      Date date = new Date();
      out.print("<h2>" + date.toString() + "</h2>");
  %>
  </body>
</html>
