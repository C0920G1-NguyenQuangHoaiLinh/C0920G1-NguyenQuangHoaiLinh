<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 05/01/2021
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Sandwich Condiment</title>
  <style>
    input {
      font-weight: bold;
    }
  </style>
</head>
<body>
<h1>Sandwich Condiment</h1><br>
<form id="sandwich" action="save" method="post">
  <input type="checkbox" name="condiment" value="Lettuce">Lettuce
  <input type="checkbox" name="condiment" value="Tomato">Tomato
  <input type="checkbox" name="condiment" value="Mustard">Mustard
  <input type="checkbox" name="condiment" value="Sprouts">Sprouts
  <br><br>
  <input type="submit" value="Save">
</form>
<table>
  <h3>${msg}</h3>
  <c:forEach items="${condiment}" var="condiment">
    <h3>${condiment}</h3>
  </c:forEach>
</table>
</body>
</html>
