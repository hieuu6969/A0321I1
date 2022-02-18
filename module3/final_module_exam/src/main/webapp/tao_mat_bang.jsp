
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Customer Form</title>
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
                <h2>Tao Moi Mat Bang</h2>
                <p style="color: green">${msg}</p>
                <form class="row g-3" method="post">
                    <div class="col-md-4">
                        <label for="inputCustomerId" class="form-label">Mã mặt bằng (*)</label>
                        <input type="text" class="form-control" id="inputCustomerId" name="ma_mb">
                    </div>
                    <div class="col-md-8">
                        <label for="inputName" class="form-label">Diện tích (m2) (*)</label>
                        <input type="text" class="form-control" id="inputName" name = "dien_tich">
                    </div>
                    <div class="col-12">
                        <label for="inputState" class="form-label">Trạng thái</label>
                        <select id="inputState" class="form-select" name="trang_thai">
                                <option value="Trống">Trống</option>
                                <option value="Hạ tầng">Hạ tầng</option>
                                <option value="Đầy đủ">Đầy đủ</option>
                        </select>
                    </div>

                    <div class="col-12">
                        <label for="tang" class="form-label">Tầng</label>
                        <select id="tang" class="form-select" name="so_tang">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                    </div>

                    <div class="col-12">
                        <label for="inputvp" class="form-label">Loai van phong</label>
                        <select id="inputvp" class="form-select" name="loai_vp">
                            <option value="Văn phòng chia sẻ ">Văn phòng chia sẻ</option>
                            <option value="Văn phòng trọn gói">Văn phòng trọn gói</option>
                        </select>
                    </div>
                    <div class="col-12">
                        <label for="inputAddress2" class="form-label">Mô tả</label>
                        <input type="text" class="form-control" id="inputAddress2" name="mo_ta">
                    </div>
                    <div class="col-md-6">
                        <label for="inputCity" class="form-label">Giá cho thuê</label>
                        <input type="text" class="form-control" id="inputCity" name = "gia">
                        <p>VNĐ</p>
                    </div>
                    <div class="col-12">
                        <label for="inputdate1" class="form-label">Ngày bắt đầu</label>
                        <input type="text" class="form-control" id="inputdate1" name ="ngay_bat_dau">
                    </div>
                    <div class="col-12">
                        <label for="inputdate2" class="form-label">Ngày kết thúc</label>
                        <input type="text" class="form-control" id="inputdate2" name ="ngay_ket_thuc">
                    </div>
                    <div class="col-6">
                        <button type="submit" class="btn btn-primary">Lưu</button>
                    </div>
                    <div class="col-6">
                        <button type="button" class="btn btn-primary">Hủy</button>
                    </div>
                </form>
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
