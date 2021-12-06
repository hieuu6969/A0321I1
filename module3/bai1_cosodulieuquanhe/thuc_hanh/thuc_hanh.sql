-- yeu cau 1: tao database
create database thuc_hanh;
-- su dung database thuc_hanh de thuc hien truy van
use thuc_hanh;

-- yeu cau 2: tao table sinh viên có các thuộc tính: mã sinh viên, tên sinh viên, ngày sinh
create table sinh_vien( ma_sinh_vien int, ten_sinh_vien varchar(70),ngay_sinh date, primary key(ma_sinh_vien));

--  hiển thị tất cả thông tin
select * from sinh_vien;

-- yeu cau 3: xoa bang va xoa db
drop table sinh_vien;
drop database thuc_hanh;

-- yeu cau 4: them du lieu
insert into sinh_vien values(1, "Dinh Van Hieu", "1998-01-01");
insert into sinh_vien(ma_sinh_vien, ten_sinh_vien) values(2,"TrungDC");
insert into sinh_vien(ma_sinh_vien, ten_sinh_vien) values(3,"TrungDC")
,(4,"TienNVT"),(5,"ChienTM");

select * from sinh_vien;

-- yeu cau 5: thay doi cau truc bang
alter table sinh_vien add mo_ta text after ngay_sinh;
select * from sinh_vien;
-- yeu cau 6: cap nhat thong tin cuar 1 anh ten la TrungDC -> Ngay sinh
-- Cập nhật/xóa 1 bản ghi dựa theo 1 điều kiện mà không phải là khóa chính -> lỗi không cập nhật được
set SQL_SAFE_UPDATES = 0;
update sinh_vien set ngay_sinh = "1995-01-01" where ten_sinh_vien = "TrungDC";
select * from sinh_vien;

delete from sinh_vien where ten_sinh_vien = "TrungDC";
set SQL_SAFE_UPDATES = 1;
select * from sinh_vien;