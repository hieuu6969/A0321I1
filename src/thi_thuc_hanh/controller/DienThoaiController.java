package thi_thuc_hanh.controller;

import thi_thuc_hanh.ipmpl.DienThoaiServiceImpl;
import thi_thuc_hanh.utils.NotFoundProductException;

import java.io.IOException;
import java.util.Scanner;

public class DienThoaiController {
    public static void main(String[] args) throws IOException {
        hienThiMenu();
    }

    public static void hienThiMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("--CHUONG TRINH QUAN LY DIEN THOAI--");
            System.out.println("Chon chuc nang theo so (de tiep tuc): ");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach dien thoai");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap dung so tu menu");
            }
            switch (choice) {
                case 1:
                    themMoiMenu();
                    break;
                case 2:
                    xoaMenu();
                    break;
                case 3:
                    hienThiMenu();
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void xoaMenu() {
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Yes");
            System.out.println("2. No");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap dung so tu menu");
            }
            switch (choice) {
                case 1:
                    try {
                        dienThoaiService.xoa();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    hienThiMenu();
                    break;
            }
        }
    }

    public static void themMoiMenu() {
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Chinh Hang");
            System.out.println("2. Xach Tay");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap dung so tu menu");
            }
            switch (choice) {
                case 1:
                    dienThoaiService.themMoi();
                    break;
                case 2:
                    dienThoaiService.themMoiXachTay();
                    break;
            }
        }
    }
}
