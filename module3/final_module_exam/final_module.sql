create database final_module_exam;
use final_module_exam;


-- ma_mb,
--                         dien_tich,
--                         trang_thai,
--                         so_tang,
--                         loai_vp,
--                         mo_ta,
--                         gia,
--                         ngay_bat_dau,
--                         ngay_ket_thuc
create table mat_bang (
	ma_mb int not null primary key,
    dien_tich varchar(45),
    trang_thai varchar(45),
    so_tang int,
    loai_vp varchar(45),
    mo_ta varchar (45),
    gia varchar(45),
    ngay_bat_dau varchar(45),
    ngay_ket_thuc varchar(45));
    
    insert into mat_bang (ma_mb,
                        dien_tich,
                        trang_thai,
                        so_tang,
                        loai_vp,
                        mo_ta,
                        gia,
                        ngay_bat_dau,
                        ngay_ket_thuc) values (
                        1,"30","Trống",15,"Văn phòng chia sẻ","Abc","2000000","2022-01-26","2022-07-26");
insert into mat_bang (ma_mb,
                        dien_tich,
                        trang_thai,
                        so_tang,
                        loai_vp,
                        mo_ta,
                        gia,
                        ngay_bat_dau,
                        ngay_ket_thuc) values (
                        2,"50","Hạ tầng",7,"Văn phòng trọn gói","Abc","5000000","2022-06-26","2022-12-26");
insert into mat_bang (ma_mb,
                        dien_tich,
                        trang_thai,
                        so_tang,
                        loai_vp,
                        mo_ta,
                        gia,
                        ngay_bat_dau,
                        ngay_ket_thuc) values (
                        3,"90","Đầy đủ",4,"Văn phòng trọn gói","Abc","10000000","2023-01-26","2023-12-26");
                        
                        select * from mat_bang;
