package service;

import model.MatBang;

import java.sql.SQLException;
import java.util.List;

public interface IMatBangService {
    List<MatBang> findAll();

    MatBang findById(int ma_mb);

    void save(int ma_mb,
              String dien_tich,
              String trang_thai,
              int so_tang,
              String loai_vp,
              String mo_ta,
              String gia,
              String ngay_bat_dau,
              String ngay_ket_thuc);

    boolean taoMatBang(MatBang matBang);

    boolean xoaMatBang(int ma_mb) throws SQLException;

}
