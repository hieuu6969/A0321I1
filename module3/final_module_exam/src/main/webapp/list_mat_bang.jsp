
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <div class="container">
        <a href="" class="navbar-brand">Nguyen Van A</a>
    </div>
</nav>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
    <div class="container-fluid">

        <button class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navmenu">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navmenu">
            <ul class="navbar-nav ms-left">
                <li class="nav-item">
                    <a href="#home" class="nav-link">Home</a>
                </li>
                <li class="nav-item">
                    <a href="#employee" class="nav-link">Employee</a>
                </li>
                <li class="nav-item">
                    <a href="#customer" class="nav-link">Customer</a>
                </li>
                <li class="nav-item">
                    <a href="#service" class="nav-link">Service</a>
                </li>
                <li class="nav-item">
                    <a href="#contract" class="nav-link">Contract</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div id="box1" class="container-sm" >
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="list-group list-group-flush">
                    <a href="#" class="list-group-item list-group-item-action">
                        Item One
                    </a>
                    <a href="#" class="list-group-item list-group-item-action">Item Two</a>
                    <a href="#" class="list-group-item list-group-item-action">Item Three</a>
                </div>
            </div>

            <div id="content" class="col-lg-9 col-md-9 col-sm-9">
                <table>
                    <h2>Danh sach mat bang</h2>
                    <p style="color: blue">${msg}</p>
                    <h3>
                        <a href="/matbang?action=tao">Tao Moi Mat Bang</a>
                    </h3>
                    <br>
                    <tr>
                        <th>Mã mặt bằng</th>
                        <th>Diện tích</th>
                        <th>Trạng thái</th>
                        <th>Tầng</th>
                        <th>Loại văn phòng</th>
                        <th>Mô tả</th>
                        <th>Giá</th>
                        <th>Ngày bắt đầu</th>
                        <th>Ngày kết thúc</th>
<%--                        ma_mb,--%>
<%--                        dien_tich,--%>
<%--                        trang_thai,--%>
<%--                        so_tang,--%>
<%--                        loai_vp,--%>
<%--                        mo_ta,--%>
<%--                        gia,--%>
<%--                        ngay_bat_dau,--%>
<%--                        ngay_ket_thuc--%>
                    </tr>
                    <c:forEach var="matBang" items="${matBangList}">
                        <tr>
                            <td><c:out value="${matBang.ma_mb}"/></td>
                            <td><c:out value="${matBang.dien_tich}"/></td>
                            <td><c:out value="${matBang.trang_thai}"/></td>
                            <td><c:out value="${matBang.so_tang}"/></td>
                            <td><c:out value="${matBang.loai_vp}"/></td>
                            <td><c:out value="${matBang.mo_ta}"/></td>
                            <td><c:out value="${matBang.gia}"/></td>
                            <td><c:out value="${matBang.ngay_bat_dau}"/></td>
                            <td><c:out value="${matBang.ngay_ket_thuc}"/></td>
                            <td>
                                <a href="/matbang?action=delete&ma_mb=${matBang.ma_mb}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
<footer class="p5 bg-dark text-white text-center
                 position-relative">
    <div class="container">
        <p class="lead">Footer...</p>
    </div>
</footer>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
</script>
</html>
