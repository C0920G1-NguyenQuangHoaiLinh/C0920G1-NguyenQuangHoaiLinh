<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/12/2020
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" type="text/css" href="/bootstrap413/css/bootstrap.min.css">
  <link rel="stylesheet" href="/bootstrap413/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css"/>
</head>
<body>
<div>
  <table>
    <thead>
    <tr>
      <th>Ma benh an</th>
      <th>Ma benh nhan</th>
      <th>Ten benh nhan</th>
      <th>ngay nhap vien</th>
      <th>ngay ra vien</th>
      <th>ly do nhap vien</th>
      <th>tac vu</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="benhAn" items="${benhAnList}">
      <tr>
        <td><c:out value="${benhAn.ma_benh_an}"/></td>
        <td><c:out value="${benhAn.ma_benh_nhan}"/></td>
        <td>
          <c:forEach var="benhNhan" items="benhNhanList">
            <c:if test="${benhAn.getMa_benh_nhan().equal(benhNhan.getMa_benh_nhan())}">
              <c:out value="${benhNhan.getTen_benh_nhan}"/>
              <c:out value="${benhNhan.getNgay_nhap_vien}"/>
              <c:out value="${benhNhan.getNgay_ra_vien}"/>
              <c:out value="${benhNhan.getLy_do_nhap_vien}"/>
            </c:if>
          </c:forEach>
        </td>
        <td>
          <a class="btn btn-warning" href="#">Edit</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
<script src="/jquery/jquery-3.5.1.min.js"></script>
<script src="/datatables/js/jquery.dataTables.js"></script>
<script src="/datatables/js/dataTables.bootstrap4.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js"></script>
</html>
