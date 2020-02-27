<%--
  Created by IntelliJ IDEA.
  User: limch
  Date: 2/12/2020
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello World</h1>
    <%! String user; %>
    <%
        user = request.getParameter("user");
        out.println(user);
    %>
    <%= "This is the Expression tags."%>
</body>
</html>
