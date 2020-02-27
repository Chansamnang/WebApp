<%--
  Created by IntelliJ IDEA.
  User: limch
  Date: 2/5/2020
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="NextServlet" method="post">
      Name: <input type="text" name="user"> <br>
      <select name="option">
        <option value="admin">admin</option>
        <option value="supervisor">supervisor</option>
        <option value="teacher">teacher</option>
      </select> <br>
      <input type="submit" value="Submit">
    </form>
  </body>
</html>
