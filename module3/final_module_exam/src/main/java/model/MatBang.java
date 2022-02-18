package model;

public class MatBang {
    private int ma_mb;
    private String dien_tich;
    private String trang_thai;
    private int so_tang;
    private String loai_vp;
    private String mo_ta;
    private String gia;
    private String ngay_bat_dau;
    private String ngay_ket_thuc;

    public MatBang(int ma_mb,
                   String dien_tich,
                   String trang_thai,
                   int so_tang,
                   String loai_vp,
                   String mo_ta,
                   String gia,
                   String ngay_bat_dau,
                   String ngay_ket_thuc) {
        this.ma_mb = ma_mb;
        this.dien_tich = dien_tich;
        this.trang_thai = trang_thai;
        this.so_tang = so_tang;
        this.loai_vp = loai_vp;
        this.mo_ta = mo_ta;
        this.gia = gia;
        this.ngay_bat_dau = ngay_bat_dau;
        this.ngay_ket_thuc = ngay_ket_thuc;
    }

    public MatBang() {
    }

    public int getMa_mb() {
        return ma_mb;
    }

    public void setMa_mb(int ma_mb) {
        this.ma_mb = ma_mb;
    }

    public String getDien_tich() {
        return dien_tich;
    }

    public void setDien_tich(String dien_tich) {
        this.dien_tich = dien_tich;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    public int getSo_tang() {
        return so_tang;
    }

    public void setSo_tang(int so_tang) {
        this.so_tang = so_tang;
    }

    public String getLoai_vp() {
        return loai_vp;
    }

    public void setLoai_vp(String loai_vp) {
        this.loai_vp = loai_vp;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getNgay_bat_dau() {
        return ngay_bat_dau;
    }

    public void setNgay_bat_dau(String ngay_bat_dau) {
        this.ngay_bat_dau = ngay_bat_dau;
    }

    public String getNgay_ket_thuc() {
        return ngay_ket_thuc;
    }

    public void setNgay_ket_thuc(String ngay_ket_thuc) {
        this.ngay_ket_thuc = ngay_ket_thuc;
    }
}
