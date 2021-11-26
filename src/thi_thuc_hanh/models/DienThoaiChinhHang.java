package thi_thuc_hanh.models;

public class DienThoaiChinhHang extends DienThoai {
    private float thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang(float thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang(int id,
                              String tenDienThoai,
                              long giaBan,
                              int soLuong,
                              String nhaSanXuat,
                              float thoiGianBaoHanh,
                              String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "dienThoaiChinhHang{" + super.toString() +
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
}
