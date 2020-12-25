<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 20/12/2020
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new customer</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
            integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
            crossorigin="anonymous"></script>
</head>
<body>
<%--<div align="center">--%>
<%--    <form method="post">--%>
<%--        <table border="1" cellpadding="5">--%>
<%--            <caption>--%>
<%--                <h2>Add New Customer</h2>--%>
<%--            </caption>--%>
<%--            <tr>--%>
<%--                <th>Name:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_name" id="customer_name" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Birthday:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_birth" id="customer_birth" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Gender:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_gender" id="customer_gender" size="15"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Id Card:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_id_card" id="customer_id_card" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Phone:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_phone" id="customer_phone" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Email:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_email" id="customer_email" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Type id:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_type_id" id="customer_type_id" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Address:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customer_address" id="customer_address" size="45"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td colspan="2" align="center">--%>
<%--                    <input type="submit" value="Add"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </form>--%>
<%--</div>--%>
<div class="modal-dialog">
    <div class="modal-content">
        <form method="post">
            <div class="modal-body" id="myModalBody">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">Create Customer</h4>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="customer_id" id="customer_id" disabled/>
                </div>
                <div class="form-group">
                    <label>Customer Name</label>
                    <input type="text" placeholder="Enter Name" class="form-control" name="customer_name"
                           id="customer_name"/>
                </div>
                <div class="form-group">
                    <label>Birthday</label>
                    <input type="text" placeholder="Customer Birth" class="form-control" name="customer_birth"
                           id="customer_birth"/>
                </div>
                <div class="form-group">
                    <label>Gender</label>
                    <input type="text" placeholder="Customer Gender" class="form-control" name="customer_gender"
                           id="customer_gender"/>
                </div>
                <div class="form-group">
                    <label>Id Card</label>
                    <input type="text" placeholder="Id Card" class="form-control" name="customer_id_card"
                           id="customer_id_card">
                </div>
                <div class="form-group">
                    <label>Phone</label>
                    <input type="text" placeholder="Phone" class="form-control" name="customer_phone"
                           id="customer_phone">
                </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="text" placeholder="Email" class="form-control" name="customer_email"
                           id="customer_email">
                </div>
                <div class="form-group">
                    <label>Type ID</label>
                    <input type="text" placeholder="Type Id" class="form-control" name="customer_type_id"
                           id="customer_type_id">
                </div>
                <div class="form-group">
                    <label>Address</label>
                    <input type="text" placeholder="Address" class="form-control" name="customer_address"
                           id="customer_address">
                </div>
            </div>
            <div class="modal-footer">
                <input type="hidden" name="action" value="create">
                <button type="submit" class="btn btn-success">Add</button>
                <input type="button" class="btn btn-default" value="Cancel" href="view.jsp">
            </div>
        </form>
    </div>
</div>
</body>
</html>
