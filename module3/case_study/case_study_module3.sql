-- 1.Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thoả mãn các yêu cầu bên dưới.
create database Furama_Management;
use Furama_management;
create table vi_tri(
ma_vi_tri INT NOT NULL PRIMARY KEY,
ten_vi_tri VARCHAR(45))
;
select * from vi_tri;
create table trinh_do(
ma_trinh_do INT NOT NULL primary key,
ten_trinh_do VARCHAR(45))
;
create table bo_phan(
ma_bo_phan INT NOT null primary key,
ten_bo_phan VARCHAR(45))
;
create table nhan_vien(
ma_nhan_vien INT not null primary key,
ho_ten VARCHAR(45),
ngay_sinh DATE,
so_cmnd varchar(45),
luong double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key (ma_bo_phan) references bo_phan(ma_bo_phan))
;
 create table khach_hang(
 ma_khach_hang int not null primary key,
 ma_loai_khach int,
 foreign key (ma_loai_khach) references loai_khach(ma_loai_khach),
 ho_ten varchar(45),
 ngay_sinh date,
 gioi_tinh bit(1),
 so_cmnd varchar(45),
 so_dien_thoai varchar(45),
 email varchar(45),
 dia_chi varchar(45))
 ;
 create table loai_khach(
 ma_loai_khach int not null primary key,
 ten_loai_khach varchar(45))
 ;
 create table hop_dong(
 ma_hop_dong int not null primary key,
 ngay_lam_hop_dong datetime,
 ngay_ket_thuc datetime,
 tien_dat_coc double,
 ma_nhan_vien int,
 ma_khach_hang int,
 ma_dich_vu int,
 foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
 foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
 foreign key (ma_dich_vu) references dich_vu(ma_dich_vu))
 ;
 create table dich_vu(
 ma_dich_vu int not null primary key,
 tien_dich_vu varchar(45),
 dien_tich int,
 chi_phi_thue double,
 so_nguoi_toi_da int,
 ma_kieu_thue int,
 ma_loai_dich_vu int,
 foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
 foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
 tieu_chuan_phong varchar(45),
 mo_ta_tien_nghi_khac varchar(45),
 dien_tich_ho_boi double,
 so_tang int)
 ;
 create table loai_dich_vu(
 ma_loai_dich_vu int not null primary key,
 ten_loai_dich_vu varchar(45))
 ;
 create table kieu_thue(
 ma_kieu_thue int not null primary key,
 ten_kieu_thue varchar(45))
 ;
create table hop_dong_chi_tiet(
ma_ho_dong_chi_tiet INT not null primary key,
ma_hop_dong INT,
ma_dich_vu_di_kem INT,
so_luong INT)
;
create table dich_vu_di_kem(
ma_dich_vu_di_kem int not null primary key,
ten_dich_vu_di_kem VARCHAR(45),
gia double,
don_vi VARCHAR(10),
trang_thai VARCHAR(45))
;

-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where nhan_vien.ho_ten like "H&" or "T%" or "K%" having length(nhan_vien.ho_ten) <= 15;

