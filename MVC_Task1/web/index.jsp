<%--
  Created by IntelliJ IDEA.
  User: limch
  Date: 2/19/2020
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>MVC_Task</title>
  </head>
  <body>
    <select id="option" onchange="change()">
      <option></option>
      <option value="insert">Insert</option>
      <option value="delete">Delete</option>
      <option value="select">Select</option>
      <option value="selectAll">Select All</option>
    </select>
    <form id="formInsert" style="display: none" method="post" action="NextServlet">
      <input type="text" placeholder="id" name="id"> <br>
      <input type="text" placeholder="name" name="name"> <br>
      <input type="submit" value="insert"> <br>
    </form>
    <form id="formDelete" style="display: none" method="post" action="NextServlet">
      <input type="text" placeholder="id" name="id"> <br>
      <input type="submit" value="Delete"> <br>
    </form>
    <form id="formSelect" style="display: none" method="post" action="NextServlet">
      <input type="text" placeholder="id"> <br>
      <input type="submit" value="Select"> <br>
    </form>
    <form id="formSelectAll" style="display: none" method="post" action="NextServlet">
      <input type="submit" value="SelectAll">
    </form>
  <script>
    function change() {
      const choice = document.getElementById("option").value
      if (choice == "insert" ) {
        document.getElementById("formInsert").style.display = "block"
        document.getElementById("formDelete").style.display = "none"
        document.getElementById("formSelect").style.display = "none"
        document.getElementById("formSelectAll").style.display = "none"
      } else if (choice == "delete"){
        document.getElementById("formInsert").style.display = "none"
        document.getElementById("formDelete").style.display = "block"
        document.getElementById("formSelect").style.display = "none"
        document.getElementById("formSelectAll").style.display = "none"
      } else if (choice == "select"){
        document.getElementById("formInsert").style.display = "none"
        document.getElementById("formDelete").style.display = "none"
        document.getElementById("formSelect").style.display = "block"
        document.getElementById("formSelectAll").style.display = "none"
      } else{
        document.getElementById("formInsert").style.display = "none"
        document.getElementById("formDelete").style.display = "none"
        document.getElementById("formSelect").style.display = "none"
        document.getElementById("formSelectAll").style.display = "block"
      }
    }
  </script>
  </body>
</html>
