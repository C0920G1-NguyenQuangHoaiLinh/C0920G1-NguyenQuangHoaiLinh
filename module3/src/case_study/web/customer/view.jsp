<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 18/12/2020
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Case Study</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap413/css/bootstrap.min.css">
    <%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"--%>
    <%--          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css"/>
    <style>
        body {
            overflow-x: hidden;
        }

        img {
            display: block;
            width: 100%;
            height: auto;
        }

        footer {
            background-color: #20c997;
        }

        header {
            background-color: #20c997;
        }

        h6 {
            font-family: "Times New Roman";
        }

        nav {
            background-color: #046056;
        }
        .row {
            margin-right: 0;
            margin-left: 0;
        }
        .radius {
            border-radius: 2px;
        }
    </style>
</head>
<body>
<div>
    <div class="header" style="background-color: #20c997">
        <div class="container radius">
            <div class="row">
                <div class="col-auto col-sm-5 col-lg-3 d-flex align-items-center bestel-logo">
                    <a href="https://furamavietnam.com/vi/" class="header-logo"><img
                            src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png" alt="logo "
                            class="img-fluid"></a>
                </div>
                <div class="col col-md-auto col-lg-3 d-flex">
                    <div class="catalog-widget d-none d-sm-block">
                        <div class="catalog-widget-inside" style="visibility: visible;">
                            <a href="https://www.tripadvisor.com/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang_Quang_Nam_Province.html"
                               target="_blank">
                                <div class="widget-tripadvisor" style="margin-top: 10px; background-color: white; border-radius: 5%;padding: 5px">
                                    <div class="inside">
                                        <div class="widget-tripadvisor-logo"><img
                                                src="https://smartdata.tonytemplates.com/bestel/wp-content/uploads/2018/05/widget-tripadvisor-logo.png"
                                                alt=""></div>
                                        <div class="widget-tripadvisor-rating"><img
                                                src="https://furamavietnam.com/wp-content/uploads/2018/08/widget-tripadvisor-rating.png"
                                                alt=""></div>
                                        <div class="widget-tripadvisor-text">2,746 Reviews</div>
                                    </div>
                                </div>
                            </a>
                            <span class="catalog-widget-toggle js-catalog-widget-toggle"></span></div>
                    </div>
                    <div class="catalog-widget-mobile d-flex d-sm-none align-items-center mx-auto">
                    </div>
                </div>

                <div class="col-sm-3 d-none d-lg-block">
                    <div class="header-contact d-flex" style="margin-top: 10px;background-color: wheat ;border-radius: 5%; padding: 5px">
                        <div class="header-contact-icon"><i class="icon-placeholder"></i></div>
                        <div class="header-contact-txt">
                            <h6>103 – 105 Đường Võ Nguyên Giáp, Phường Khuê Mỹ, Quận Ngũ hành Sơn, Tp. Đà Nẵng, Việt
                                Nam</h6>
                            <h6 class="txt-sm"><span style="color: #046056; font-weight: bold">7.0 km</span> từ Sân bay
                                Quốc tế Đà Nẵng</h6>
                        </div>
                    </div>
                </div>

                <div class="col-sm-3 d-none d-lg-block">
                    <div class="header-contact d-flex" style="margin-top: 3px">
                        <div class="header-contact-icon"><i class="icon-telephone"></i></div>
                        <div class="header-contact-txt">
                            <h2>Nguyen Quang Hoai Linh</h2>
                            <h4>C0920G1</h4>
                        </div>
                    </div>
                    <div class="header-contact d-flex">
                        <div class="header-contact-icon"><i class="icon-closed-envelope"></i></div>
                        <div class="header-contact-txt">
                            <a href="mailto:reservation@furamavietnam.com">
                                reservation@furamavietnam.com </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark radius">
        <a class="navbar-brand mr-5" href="http://localhost:8080/" style="margin-left: 100px">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active mr-5">
                    <a class="nav-link" href="#">Employee</a>
                </li>
                <li class="nav-item mr-5">
                    <a class="nav-link" href="/customer">Customer</a>
                </li>
                <li class="nav-item mr-5">
                    <a class="nav-link" href="#">Service</a>
                </li>
                <li class="nav-item mr-5">
                    <a class="nav-link" href="#">Contract</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <span class="fas fa-search"></span>
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <div class="row">
        <div class="col-sm-3 radius" style="padding-right: 0; padding-left: 0; background-color: #0c5460">
            <h2 style="color: white;text-align: center">Welcome to Furama</h2>
            <div><img src="left.jpg"></div>
            <h3 style="color: white; text-align: center">List Menu</h3>
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link btn btn-primary" data-toggle="modal" data-target="#myModal">Create Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link btn btn-success" data-toggle="modal" data-target="#myModal2">Edit Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link btn btn-warning" data-toggle="modal" data-target="#myModal4">Search Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled btn btn-danger" href="#">Vô hiệu hóa</a>
                </li>
            </ul>
            <div><img src="left2.jpg" style="height: 11.3rem"></div>
        </div>
        <div class="col-sm-9 radius" style="padding-left: 0; padding-right: 0;background-color: gainsboro">
            <div>
                <h2 class="text-center">List of Customer</h2>
                <table class="table table-striped table-bordered" style="width: 95%" id="tableCustomer">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Birth</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Id Card</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Email</th>
                        <th scope="col">Customer Type</th>
                        <th scope="col">Address</th>
                        <th scope="col">Function</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="customer" items="${listCustomer}">
                        <tr>
                            <td><c:out value="${customer.id}"/></td>
                            <td><c:out value="${customer.customer_name}"/></td>
                            <td><c:out value="${customer.customer_birth}"/></td>
                            <td><c:out value="${customer.customer_gender}"/></td>
                            <td><c:out value="${customer.customer_id_card}"/></td>
                            <td><c:out value="${customer.customer_phone}"/></td>
                            <td><c:out value="${customer.customer_email}"/></td>
                            <td>
                                <c:forEach var="typeCustomer" items="${customerTypeList}">
                                    <c:if test="${typeCustomer.getCustomer_type_id().equals(customer.getCustomer_type_id())}">
                                        <c:out value="${typeCustomer.getCustomer_type_name()}"/></c:if>
                                </c:forEach>
                            </td>
                            <td><c:out value="${customer.customer_address}"/></td>
                            <td>
                                <a class="btn btn-danger" data-toggle="modal" data-target="#myModal3" href="#"
                                   onclick="deleteCustomerId('${customer.id}','${customer.customer_name}')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <footer class="container-fluid radius">
        <div class="row">
            <div class="col-lg-4 col-light">
                <h2 class="mb-1">Hướng Dẫn Di Chuyển</h2>
                <div class="d-flex flex-column flex-md-row flex-lg-column">
                    <p>Khu nghỉ dưỡng Furama là cơ sở hàng đầu để khám phá một trong những điểm đến hấp dẫn nhất Châu Á.
                        Chỉ cách Đà Nẵng một quãng lái xe ngắn là bốn Di sản Văn hóa Thế giới được UNESCO công nhận:</p>
                </div>
                <div class="mt-3 mt-md-1 mt-lg-3"></div>
                <h4 class="mb-1 mb-md-2">Địa Điểm</h4>
                <table class="place-table">
                    <tbody>
                    <tr>
                        <td>1.</td>
                        <td>Cố đô Huế</td>
                        <td class="text-right"><span>2 tiếng</span></td>
                    </tr>
                    <tr>
                        <td>2.</td>
                        <td>Phố cổ Hội An</td>
                        <td class="text-right"><span>30 phút</span></td>
                    </tr>
                    <tr>
                        <td>3.</td>
                        <td>Thánh địa Mỹ Sơn</td>
                        <td class="text-right"><span>90 phút</span></td>
                    </tr>
                    <tr>
                        <td>4.</td>
                        <td>Động Phong Nha</td>
                        <td class="text-right"><span>3 tiếng</span></td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-7 ml-lg-auto d-flex flex-column position-static">
                <div class="row">
                    <div class="col-sm mt-2 mt-sm-0">
                        <h4>
                            Liên hệ </h4>
                        <ul class="icn-list">
                            <li><i class="icon-placeholder"></i><span style="color: #707070;font-size: 12px">103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam</span><br
                                    style="margin: 0px;padding: 0px;color: #707070;font-size: 12px"><span
                                    style="color: #707070;font-size: 12px">Tel.: 84-236-3847 333/888 *
</span><span style="color: #707070;font-size: 12px">Fax: 84-236-3847 666</span><br
                                    style="margin: 0px;padding: 0px;color: #707070;font-size: 12px"><span
                                    style="color: #707070;font-size: 12px">Email:&nbsp;</span><a class="link"
                                                                                                 style="margin: 0px;padding: 0px;color: #707070;font-size: 12px"
                                                                                                 href="mailto:reservation@furamavietnam.com">reservation@furamavietnam.com</a><span
                                    style="color: #707070;font-size: 12px">&nbsp;*&nbsp;</span><a class="link"
                                                                                                  style="margin: 0px;padding: 0px;color: #707070;font-size: 12px"
                                                                                                  href="https://www.furamavietnam.com/undefined/">www.furamavietnam.com</a>

                                <span style="color: #707070;font-size: 12px"><img class="alignnone wp-image-9957"
                                                                                  src="https://furamavietnam.com/wp-content/uploads/2020/02/world-hotel-F-new.png"
                                                                                  alt="" width="340" height="71">
GDS-Codes: Amadeus-WWDADFUR, Apollo/Galileo-WW16236,&nbsp;</span><span style="color: #707070;font-size: 12px">SabreWW32771, Worldspan-WWDADFU</span>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="row mt-5 mb-1 mt-lg-auto mb-md-0 align-items-center">
                    <div>
                        <div class="footer-copyright text-left">
                            <img src="https://furamavietnam.com/wp-content/uploads/2019/02/Ariyana-Tourism-Complex-02-2.png"
                                 alt="Ariyana Tourism Complex" width="500px;">
                            <div class="clearfix d-md-none"></div>
                            © 2020 Furama Resort Danang.
                        </div>
                    </div>
                    <div class="col-sm mt-2 mt-sm-0 mt-md-1 mt-xl-0">
                        <div class="footer-social text-left text-sm-right text-lg-left text-xl-right">
                            <a href="https://www.facebook.com/furamaresort/"><i class="icon-facebook-logo"></i></a>
                            <a href="https://www.instagram.com/furama_resort_danang/?hl=vi"><i
                                    class="icon-instagram-logo"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</div>
<%--modal edit & delete--%>
<div class="modal" tabindex="-1" role="dialog" id="myModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="customer?action=create">
                <div class="modal-header">
                    <h5 class="modal-title">Create Customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
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
                    <button type="submit" class="btn btn-primary">Save changes</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>

<div class="modal" tabindex="-1" role="dialog" id="myModal2">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="customer?action=edit">
                <div class="modal-header">
                    <h5 class="modal-title">Edit Customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Customer Id</label>
                        <input type="text" placeholder="Enter Id" class="form-control" name="id"
                               id="id"/>
                    </div>
                    <div class="form-group">
                        <label>Customer Name</label>
                        <input type="text" placeholder="Enter Name" class="form-control" name="customer_name"
                               id="customer_name2"/>
                    </div>
                    <div class="form-group">
                        <label>Birthday</label>
                        <input type="text" placeholder="Customer Birth" class="form-control" name="customer_birth"
                               id="customer_birth2"/>
                    </div>
                    <div class="form-group">
                        <label>Gender</label>
                        <input type="text" placeholder="Customer Gender" class="form-control" name="customer_gender"
                               id="customer_gender2"/>
                    </div>
                    <div class="form-group">
                        <label>Id Card</label>
                        <input type="text" placeholder="Id Card" class="form-control" name="customer_id_card"
                               id="customer_id_card2">
                    </div>
                    <div class="form-group">
                        <label>Phone</label>
                        <input type="text" placeholder="Phone" class="form-control" name="customer_phone"
                               id="customer_phone2">
                    </div>
                    <div class="form-group">
                        <label>Email</label>
                        <input type="text" placeholder="Email" class="form-control" name="customer_email"
                               id="customer_email2">
                    </div>
                    <div class="form-group">
                        <label>Type ID</label>
                        <input type="text" placeholder="Type Id" class="form-control" name="customer_type_id"
                               id="customer_type_id2">
                    </div>
                    <div class="form-group">
                        <label>Address</label>
                        <input type="text" placeholder="Address" class="form-control" name="customer_address"
                               id="customer_address2">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Save changes</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
<%--                    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal3">--%>
<%--                        Delete Customer</button>--%>
<div class="modal" tabindex="-1" role="dialog" id="myModal3">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Delete Customer</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <input type="text" id="modelId" size="50" disabled style="border: none;background: white">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" onclick="submitDelete()">Save changes</button>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<form action="/customer" method="post" id="deleteCustomer">
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id_customer" id="idCustomer">
</form>

<%--search by name customer--%>
<div class="modal" tabindex="-1" role="dialog" id="myModal4">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="customer?action=search">
                <div class="modal-header">
                    <h5 class="modal-title">Search Customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Customer Name</label>
                        <input type="text" placeholder="Enter Name" class="form-control" name="customer_name"
                               id="customer_name3"/>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Save changes</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    function submitDelete() {
        document.getElementById("deleteCustomer").submit();
    }

    function deleteCustomerId(id, name) {
        document.getElementById("idCustomer").value = id;
        document.getElementById("modelId").value = "Do you want delete customer name : " + name;
    }
</script>
<%--<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>--%>
<%--<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>--%>
<%--<script src="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"></script>--%>

<script src="/jquery/jquery-3.5.1.min.js"></script>
<script src="/datatables/js/jquery.dataTables.js"></script>
<script src="/datatables/js/dataTables.bootstrap4.js"></script>
<%--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>--%>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>
