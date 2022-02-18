package repository;

import model.MatBang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepository implements IMatBang {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<MatBang> findAll() {
        List<MatBang> matBangList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from mat_bang;");
            ResultSet resultSet = preparedStatement.executeQuery();
            MatBang matBang;
            while (resultSet.next()) {
                matBang = new MatBang();
                matBang.setMa_mb(resultSet.getInt("ma_mb"));
                matBang.setDien_tich(resultSet.getString("dien_tich"));
                matBang.setTrang_thai(resultSet.getString("trang_thai"));
                matBang.setSo_tang(resultSet.getInt("so_tang"));
                matBang.setLoai_vp(resultSet.getString("loai_vp"));
                matBang.setMo_ta(resultSet.getString("mo_ta"));
                matBang.setGia(resultSet.getString("gia"));
                matBang.setNgay_bat_dau(resultSet.getString("ngay_bat_dau"));
                matBang.setNgay_ket_thuc(resultSet.getString("ngay_ket_thuc"));
                matBangList.add(matBang);
//                int ma_mb,
//                String dien_tich,
//                String trang_thai,
//                int so_tang,
//                String loai_vp,
//                String mo_ta,
//                String gia,
//                String ngay_bat_dau,
//                String ngay_ket_thuc
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public MatBang findById(int ma_mb) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from mat_bang where ma_mb = ?");
            preparedStatement.setInt(1,ma_mb);
            ResultSet resultSet = preparedStatement.executeQuery();
            MatBang matBang = null;
            while (resultSet.next()) {
                matBang = new MatBang();
                matBang.setMa_mb(resultSet.getInt("ma_mb"));
                matBang.setDien_tich(resultSet.getString("dien_tich"));
                matBang.setTrang_thai(resultSet.getString("trang_thai"));
                matBang.setSo_tang(resultSet.getInt("so_tang"));
                matBang.setLoai_vp(resultSet.getString("loai_vp"));
                matBang.setMo_ta(resultSet.getString("mo_ta"));
                matBang.setGia(resultSet.getString("gia"));
                matBang.setNgay_bat_dau(resultSet.getString("ngay_bat_dau"));
                matBang.setNgay_ket_thuc(resultSet.getString("ngay_ket_thuc"));
                break;
            }
            return matBang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(int ma_mb, String dien_tich, String trang_thai, int so_tang, String loai_vp, String mo_ta, String gia, String ngay_bat_dau, String ngay_ket_thuc) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update mat_bang set ma_mb = ?, dien_tich = ?, trang_thai = ?, so_tang = ?, loai_vp = ?, mo_ta = ?,gia =?, ngay_bat_dau = ?, ngay_ket_thuc = ? where ma_mb = ?;");
            preparedStatement.setInt(1,ma_mb);
            preparedStatement.setString(2,dien_tich);
            preparedStatement.setString(3,trang_thai);
            preparedStatement.setInt(4,so_tang);
            preparedStatement.setString(5,loai_vp);
            preparedStatement.setString(6,mo_ta);
            preparedStatement.setString(7,gia);
            preparedStatement.setString(8,ngay_bat_dau);
            preparedStatement.setString(9,ngay_ket_thuc);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void taoMatBang(MatBang matBang) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into mat_bang(ma_mb,dien_tich,trang_thai,so_tang,loai_vp,mo_ta,gia,ngay_bat_dau,ngay_ket_thuc value (?,?,?,?,?,?,?,?,?));");
            preparedStatement.setInt(1,matBang.getMa_mb());
            preparedStatement.setString(2,matBang.getDien_tich());
            preparedStatement.setString(3,matBang.getTrang_thai());
            preparedStatement.setInt(4,matBang.getSo_tang());
            preparedStatement.setString(5,matBang.getLoai_vp());
            preparedStatement.setString(6,matBang.getMo_ta());
            preparedStatement.setString(7,matBang.getGia());
            preparedStatement.setString(8,matBang.getNgay_bat_dau());
            preparedStatement.setString(9,matBang.getNgay_ket_thuc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean xoaMatBang(int ma_mb) throws SQLException{
        boolean rowDeleted;
        try (PreparedStatement preparedStatement = this.baseRepository.getConnection()
                .prepareStatement("delete from mat_bang where ma_mb = ?;");) {
            preparedStatement.setInt(1,ma_mb);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}
