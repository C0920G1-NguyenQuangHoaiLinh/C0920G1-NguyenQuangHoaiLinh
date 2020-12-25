<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 16/12/2020
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="customer.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%
  List<Customer> customerList = new ArrayList<>();
  customerList.add(new Customer("An","10/10/2000","da nang","luffy.jpg"));
  customerList.add(new Customer("Binh","17/09/2003","quang nam","chopper.jpg"));
  customerList.add(new Customer("Duong","06/12/1998","hue","zoro.jpg"));
  customerList.add(new Customer("Chien","27/03/1999","da nang","luffy2.jpg"));
//  pageContext.setAttribute("myCustomer", customerList);
  request.setAttribute("myCustomer", customerList);
%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <head>
    <title>Customer List</title>
    <style>
      table {
        border-collapse: collapse;
        width: 90%;
        height: 60%;
      }
      table,th,td {
        border: 1px solid black;
        text-align: center;
      }
      img {
        height: 75px;
        width: 75px;
      }
    </style>
  </head>
  <body>
  <table>
    <caption><h1>Danh sách khách hàng</h1></caption>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="tempCustomer" items="${myCustomer}">
    <tr>
      <td>${tempCustomer.name}</td>
      <td>${tempCustomer.dateOfBirth}</td>
      <td>${tempCustomer.address}</td>
      <td><img src=${tempCustomer.graphics}></td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
