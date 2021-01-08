<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 31/12/2020
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Exchange</title>
</head>
<body>
<form action="/currency" method="get">
    <div>
        <table>
            <caption>Currency Exchange</caption>
            <tr>
                <td>USD :</td>
                <td><input type="text" name="usd"></td>
            </tr>
<%--            <tr>--%>
<%--                <td>VND : </td>--%>
<%--                <td><input type="text" name="vnd"></td>--%>
<%--            </tr>--%>
            <tr>
                <td><input type="submit" name="currency" value="Submit"></td>
            </tr>
        </table>
    </div>
</form>
<h3>= ${vnd} VND</h3>
</body>
</html>
