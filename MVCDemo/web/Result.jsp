<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: limch
  Date: 2/18/2020
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello World</h1>
    <%
        Object obj = request.getAttribute("student");
        if(obj==null){
            out.println("Null");
        }
        else{
            out.println("Not Null");
            student s = (student)obj;

            out.println("Id : "+s.getId());
            out.println("Id : "+s.getName());
        }
    %>
</body>
</html>
