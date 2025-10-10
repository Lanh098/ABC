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

    public void themSach(Sach sach) {
        if (soLuongSach < gioiHan) {
            danhSachSach[soLuongSach++] = sach;
            System.out.println("Da them sach!");
        } else {
            System.out.println("Danh sach sach da day, khong the them!");
        }
    }

public Sach timKiemSach(String maSach) {
    for (int i = 0; i < soLuongSach; i++) {
        if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
            return danhSachSach[i]; // Tìm thấy, trả về sách
        }
    }
    return null; // Không tìm thấy
}

public void xoaSach(String maSach) {
    boolean timThay = false;

    for (int i = 0; i < soLuongSach; i++) {
        if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
            // Dịch các phần tử còn lại lên trước
            for (int j = i; j < soLuongSach - 1; j++) {
                danhSachSach[j] = danhSachSach[j + 1];
            }
            danhSachSach[--soLuongSach] = null; // Xóa phần tử cuối
            timThay = true;
            System.out.println("✅ Đã xóa sách có mã: " + maSach);
            break; // Dừng vòng lặp
        }
    }

    if (!timThay) {
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
    }
}

    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equals(maSach)) {
                danhSachSach[i] = sachMoi;
                System.out.println("Da cap nhap sach co ma: " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay sach can cap nhap!");
    }
    
    public Sach nhapSachMoi(Scanner sc) {
        System.out.print("Nhap loai sach (1- Sach giao trinh, 2- Sach tieu thuyet): ");
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

        if (loai == 1) {
            System.out.print("Mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.print("Cap do: ");
            String capDo = sc.nextLine();
            return new SachGiaoTrinh(ma, tieuDe, tacGia, nam, sl, monHoc, capDo);
        } else if (loai == 2) {
            System.out.print("The loai: ");
            String theLoai = sc.nextLine();
            System.out.print("Co phai series: ");
            boolean laSeries = Boolean.parseBoolean(sc.nextLine());
            return new SachTieuThuyet(ma, tieuDe, tacGia, nam, sl, theLoai, laSeries);
        } else {
            System.out.println("Loai sach khong hop le!");
            return new Sach(ma, tieuDe, tacGia, nam, sl);
        }
    }
    
    public void hienThiDanhSach() {
        if (soLuongSach == 0) {
            System.out.println("Dach sach sach trong!");
            return;
        }
        System.out.println("\n===== DANH SACH SACH =====");
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println((i + 1) + ". " + danhSachSach[i]);
        }
       }
}

