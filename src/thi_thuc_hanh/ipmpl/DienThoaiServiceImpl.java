package thi_thuc_hanh.ipmpl;

import module2.caseStudy.models.Employee;
import module2.caseStudy.utils.ReadAndWrite;
import thi_thuc_hanh.models.DienThoai;
import thi_thuc_hanh.models.DienThoaiChinhHang;
import thi_thuc_hanh.models.DienThoaiXachTay;
import thi_thuc_hanh.services.DienThoaiService;
import thi_thuc_hanh.utils.CSVHelper;
import thi_thuc_hanh.utils.NotFoundProductException;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DienThoaiServiceImpl implements DienThoaiService {
    private static List<DienThoai> dienThoaiList = new ArrayList<>();
    private CSVHelper<DienThoai>  csvHelper = new CSVHelper<>();
    private final String pathChinhHang = "D:\\A0721I1-DinhVanHieu\\src\\thi_thuc_hanh\\data\\mobiles_chinh_hang.csv";
    private final String pathXachTay = "D:\\A0721I1-DinhVanHieu\\src\\thi_thuc_hanh\\data\\mobiles_xach_tay.csv";
    private static Scanner scanner = new Scanner(System.in);

    public DienThoaiServiceImpl() {
        dienThoaiList = getAll();
    }
    List<DienThoai> getAll() {
        dienThoaiList.clear();
        List<String> lines1 = csvHelper.read(pathChinhHang);
        for (String line : lines1) {
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String tenDienThoai = tmp[1];
            long giaBan = Long.parseLong(tmp[2]);
            int soLuong = Integer.parseInt(tmp[3]);
            String nhaSanXuat = tmp[4];
            float thoiGianBaoHanh = Float.parseFloat(tmp[5]);
            String phamViBaoHanh = tmp[6];

            DienThoai dienThoai = new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
            dienThoaiList.add(dienThoai);
        }
        List<String> lines2 = csvHelper.read(pathXachTay);
        for (String line : lines2) {
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String tenDienThoai = tmp[1];
            long giaBan = Long.parseLong(tmp[2]);
            int soLuong = Integer.parseInt(tmp[3]);
            String nhaSanXuat = tmp[4];
            String quocGiaXachTay = tmp[5];
            String trangThai = tmp[6];

            DienThoai dienThoai = new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
            dienThoaiList.add(dienThoai);
        }
        return dienThoaiList;
    }

    @Override
    //mac dinh them dien thoai chinh hang
    public void themMoi() {
        int id;
        if (dienThoaiList.isEmpty()) {
            id = 1;
        } else {
            id = dienThoaiList.size() + 1;
        }
        System.out.println("ID dien thoai: " + id);
        System.out.println("Ten dien thoai: ");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Gia ban: ");
        long giaBan = Long.parseLong(scanner.nextLine());
        System.out.println("So luong: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nha san xuat: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Thoi gian bao hanh: ");
        float thoiGianBaoHanh = Float.parseFloat(scanner.nextLine());
        System.out.println("Pham vi bao hanh: ");
        String phamViBaoHanh = scanner.nextLine();

        DienThoai dienThoai = new DienThoaiChinhHang(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,thoiGianBaoHanh, phamViBaoHanh);
        dienThoaiList.add(dienThoai);
        System.out.println("Da them!");
        csvHelper.write(dienThoaiList,pathChinhHang);
    }
    //them dien thoai xach tay
    public void themMoiXachTay() {
        int id;
        if (dienThoaiList.isEmpty()) {
            id = 1;
        } else {
            id = dienThoaiList.size() + 1;
        }
        System.out.println("ID dien thoai: " + id);
        System.out.println("Ten dien thoai: ");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Gia ban: ");
        long giaBan = Long.parseLong(scanner.nextLine());
        System.out.println("So luong: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nha san xuat: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Quoc gia xach tay: ");
        String quocGiaXachTay = scanner.nextLine();
        System.out.println("Trang thai: ");
        String trangThai = scanner.nextLine();

        DienThoai dienThoai = new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
        dienThoaiList.add(dienThoai);
        System.out.println("Da them!");
        csvHelper.write(dienThoaiList,pathXachTay);
    }

    @Override
    public void xoa() throws NotFoundProductException {
            System.out.println("Nhap ID dien thoai can xoa: ");
            int id = Integer.parseInt(scanner.nextLine());
        int size = dienThoaiList.size();
        for (int i = 0; i< size; i++) {
            if (id == dienThoaiList.get(i).getId()) {
                dienThoaiList.remove(i);
            } else {
                throw new NotFoundProductException("ID dien thoai khong ton tai");
            }
        }
    }

    @Override
    public void hienThi() {
        List<DienThoai> dienThoaiList = getAll();
        for (DienThoai dienThoai  : dienThoaiList) {
            System.out.println(dienThoai.toString());
        }
    }

    @Override
    public String timKiem() {
        return null;
    }
}
