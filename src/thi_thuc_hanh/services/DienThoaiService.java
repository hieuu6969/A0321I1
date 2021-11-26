package thi_thuc_hanh.services;

import thi_thuc_hanh.utils.NotFoundProductException;

public interface DienThoaiService {
    public void themMoi();
    public void xoa() throws NotFoundProductException;
    public void hienThi();
    public String timKiem();
}
