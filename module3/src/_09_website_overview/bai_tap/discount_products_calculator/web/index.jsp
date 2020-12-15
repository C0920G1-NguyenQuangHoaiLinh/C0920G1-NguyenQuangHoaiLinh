<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 15/12/2020
  Time: 8:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount Products</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
    <h2>Discount Products</h2>
  <form method="post" action="/discount">
    <label>Product Description : </label><br>
    <input type="text" name="description"/><br>
    <label>List Price : </label><br>
    <input type="text" name="listPrice"><br>
    <label>Discount Percent % : </label><br>
    <input type="text" name="discount"><br>
    <input type="submit" value="Discount">
  </form>
  </body>
</html>
