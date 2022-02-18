package service;

import model.MatBang;
import repository.IMatBang;
import repository.MatBangRepository;

import java.sql.SQLException;
import java.util.List;

public class MatBangService implements IMatBangService {
    private IMatBang iMatBang = new MatBangRepository();

    @Override
    public List<MatBang> findAll() {
        return iMatBang.findAll();
    }

    @Override
    public MatBang findById(int ma_mb) {
        return iMatBang.findById(ma_mb);
    }

    @Override
    public void save(int ma_mb, String dien_tich, String trang_thai, int so_tang, String loai_vp, String mo_ta, String gia, String ngay_bat_dau, String ngay_ket_thuc) {
        iMatBang.save(ma_mb,
                dien_tich,
                trang_thai,
                so_tang,
                loai_vp,
                mo_ta,
                gia,
                ngay_bat_dau,
                ngay_ket_thuc);
    }

    @Override
    public boolean taoMatBang(MatBang matBang) {
        MatBang matBang1 = findById(matBang.getMa_mb());
        if (matBang1!=null) {
            return false;
        } else {
            iMatBang.taoMatBang(matBang);
            return true;
        }
    }

    @Override
    public boolean xoaMatBang(int ma_mb) throws SQLException {
        return iMatBang.xoaMatBang(ma_mb);
    }
}
