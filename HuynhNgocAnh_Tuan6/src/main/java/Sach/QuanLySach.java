/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sach;

import java.util.Scanner;

/**
 *
 * @author HNgAnh
 */
public class QuanLySach {
    private Sach[] danhSachSach;
    private int soLuongSach;
    private int gioiHan; 

    public QuanLySach(int gioiHan) {
        this.gioiHan = gioiHan;
        this.danhSachSach = new Sach[gioiHan];
        this.soLuongSach = 0;
    }

    // === Thêm sách trực tiếp vào danh sách ===
    public void themSach(Sach sach) {
        if (soLuongSach < gioiHan) {
            danhSachSach[soLuongSach++] = sach;
            System.out.println("Da them sach!");
        } else {
            System.out.println("Danh sach da day!");
        }
    }

    // === Tìm kiếm theo mã ===
    public Sach timKiemSach(String maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                return danhSachSach[i];
            }
        }
        return null;
    }

    // === Xóa sách theo mã ===
    public void xoaSach(String maSach) {
        boolean timThay = false;
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                // Dịch trái các phần tử còn lại
                for (int j = i; j < soLuongSach - 1; j++) {
                    danhSachSach[j] = danhSachSach[j + 1];
                }
                danhSachSach[--soLuongSach] = null;
                timThay = true;
                System.out.println("Da xoa sach co ma: " + maSach);
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    // === Cập nhật sách theo mã ===
    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach[i] = sachMoi;
                System.out.println("Da cap nhap sach co ma: " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay sach da nhap!");
    }

    // === Hàm chỉ nhập 1 sách, trả về đối tượng Sach ===
    public Sach nhapMotSach(Scanner sc) {
        System.out.print("Nhap loai sach (1- Giao trinh, 2- Tieu thuyet): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.print("Tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("So luong: ");
        int sl = Integer.parseInt(sc.nextLine());

        Sach sachMoi;
        switch (loai) {
            case 1 -> {
                System.out.print("Mon hoc: ");
                String monHoc = sc.nextLine();
                System.out.print("Cap do: ");
                String capDo = sc.nextLine();
                sachMoi = new SachGiaoTrinh(ma, tieuDe, tacGia, nam, sl, monHoc, capDo);
            }
            case 2 -> {
                System.out.print("The loai: ");
                String theLoai = sc.nextLine();
                System.out.print("Co phai series (true/false): ");
                boolean laSeries = Boolean.parseBoolean(sc.nextLine());
                sachMoi = new SachTieuThuyet(ma, tieuDe, tacGia, nam, sl, theLoai, laSeries);
            }
            default -> {
                System.out.println("Loai sach khong hop le! Tao sach thuong.");
                sachMoi = new Sach(ma, tieuDe, tacGia, nam, sl);
            }
        }
        return sachMoi;
    }

    // === Hàm thêm sách mới (gọi hàm nhập sách và thêm vào danh sách) ===
    public void nhapSachMoi(Scanner sc) {
        if (soLuongSach >= gioiHan) {
            System.out.println("Dach sach da day!");
            return;
        }
        Sach s = nhapMotSach(sc);
        danhSachSach[soLuongSach++] = s;
        System.out.println("Da them sach moi!");
    }

    // === Hiển thị danh sách sách ===
    public void hienThiDanhSach() {
        if (soLuongSach == 0) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("\n===== Danh Sach Sach =====");
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println((i + 1) + ". " + danhSachSach[i]);
        }
    }
}

