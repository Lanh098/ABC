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

public class QuanLySachImpl implements IQuanLySach {
    private Sach[] danhSachSach;
    private int soLuongSach;
    private int gioiHan;

    public QuanLySachImpl(int gioiHan) {
        this.gioiHan = gioiHan;
        this.danhSachSach = new Sach[gioiHan];
        this.soLuongSach = 0;
    }
    
    @Override
    public void themSach(Scanner sc) {
        if (soLuongSach >= gioiHan) {
            System.out.println("Danh sach da day, khong the them sach moi.");
            return;
        }

        System.out.print("Nhap loai sach (1 - Giao trinh, 2 - Tieu thuyet): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia co ban: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        Sach sachMoi;
        if (loai == 1) {
            System.out.print("Nhap mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.print("Nhap cap do: ");
            String capDo = sc.nextLine();
            sachMoi = new SachGiaoTrinh(ma, tieuDe, tacGia, nam, soLuong, giaCoBan, monHoc, capDo);
        } else if (loai == 2) {
            System.out.print("Nhap the loai: ");
            String theLoai = sc.nextLine();
            System.out.print("Sach co phai series (true/false): ");
            boolean laSeries = Boolean.parseBoolean(sc.nextLine());
            sachMoi = new SachTieuThuyet(ma, tieuDe, tacGia, nam, soLuong, giaCoBan, theLoai, laSeries);
        } else {
            System.out.println("Loai sach khong hop le.");
            return;
        }

        danhSachSach[soLuongSach++] = sachMoi;
        System.out.println("Them sach moi thanh cong!");
    }

    @Override
    public void xoaSach(String maSach) {
        boolean timThay = false;
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equals(maSach)) {
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

    @Override
    public Sach timSach(String maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equals(maSach)) {
                return danhSachSach[i];
            }
        }
        return null;
    }

    @Override
    public void hienThiTatCaSach() {
        if (soLuongSach == 0) {
            System.out.println("Danh sach sach trong.");
        } else {
            for (int i = 0; i < soLuongSach; i++) {
                System.out.println(danhSachSach[i].toString());
            }
        }
    }

    @Override
    public void capNhatSach(String maSach, Scanner sc) {
        Sach sach = timSach(maSach);
        if (sach == null) {
            System.out.println("Khong tim thay sach co ma nay.");
            return;
        }

        System.out.print("Nhap tieu de moi: ");
        sach.setTieuDe(sc.nextLine());
        System.out.print("Nhap tac gia moi: ");
        sach.setTacGia(sc.nextLine());
        //... Các phần cập nhật khác
        System.out.println("Da cap nhat thong tin sach thanh cong.");
    }
}
