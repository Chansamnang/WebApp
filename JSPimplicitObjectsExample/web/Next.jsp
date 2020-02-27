<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="Error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String user = request.getParameter("user");
//        out.println(user);
//        String color = config.getInitParameter("color");
//        if(color.equals("Blue")){
//            out.println("You are not KITian");
//            String school = application.getInitParameter("school");
//            out.println("You are from " + school);
//        } else {
//            out.println("You are KITian");
//        }
//        Cookie ck = new Cookie("user", user);
//        response.addCookie(ck);
//        out.println("<a href='ViewDetail.jsp'>View Detail</a>");

//        session.setAttribute("user",user);
        pageContext.setAttribute("user",user, PageContext.SESSION_SCOPE);
        out.println("<a href='ViewDetail.jsp'>View Detail</a>");

        int c = 10/0;
    %>
</body>
</html>
