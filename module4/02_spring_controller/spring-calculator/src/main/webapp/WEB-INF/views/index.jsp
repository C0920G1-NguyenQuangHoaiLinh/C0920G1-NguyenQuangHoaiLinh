<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 05/01/2021
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form id="cal" action="calculator" method="post">
    <input type="text" name="number1">&nbsp;
    <input type="text" name="number2"><br><br>
    <button type="submit" name="calculator" value="+">Addition(+)</button>
    <button type="submit" name="calculator" value="-">Subtraction(-)</button>
    <button type="submit" name="calculator" value="*">Multiplication(X)</button>
    <button type="submit" name="calculator" value="/">Division(/)</button>
  </form>
  <h3>Result ${result}</h3>
  </body>
</html>
