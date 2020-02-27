<%--
  Created by IntelliJ IDEA.
  User: limch
  Date: 2/14/2020
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        Cookie ck[] = request.getCookies();
//        for (Cookie cookie:ck){
//            out.println(cookie.getName() + " : " + cookie.getValue());
//            out.println("<br>");
//        }
//        String user = (String)session.getAttribute("user");
        String user = (String) pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
        out.println(user);
    %>
</body>
</html>
