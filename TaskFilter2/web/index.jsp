<%--
  Created by IntelliJ IDEA.
  User: limch
  Date: 2/5/2020
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="NextServlet" method="post">
      USD : <input type="number" name="usd">
      <select name="currency">
        <option></option>
        <option value="KHR">KHR</option>
        <option value="YUAN">YUAN</option>
      </select>
      <input type="submit"/>
    </form>
  </body>
</html>
