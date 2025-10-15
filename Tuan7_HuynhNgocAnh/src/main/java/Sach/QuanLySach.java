package Sach;

import java.util.Scanner;

public class QuanLySach {
    private Sach[] danhSachSach;
    private int soLuongSach;
    private int gioiHan;
    private Scanner sc;

    public Sach[] getDanhSachSach() {
        return danhSachSach;
    }

    public void setDanhSachSach(Sach[] danhSachSach) {
        this.danhSachSach = danhSachSach;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }

    public int getGioiHan() {
        return gioiHan;
    }

    public void setGioiHan(int gioiHan) {
        this.gioiHan = gioiHan;
    }

    public QuanLySach(int gioiHan) {
        this.gioiHan = gioiHan;
        this.danhSachSach = new Sach[gioiHan];
        this.soLuongSach = 0;
    }

    public QuanLySach() {
    }
    
    // Them sach
   public void themSach(Scanner sc) {
    if (soLuongSach >= gioiHan) {
        System.out.println("Danh sach da day, khong the them sach moi.");
        return;
    }

    System.out.print("Nhap loai sach (1 - Giao trinh, 2 - Tieu thuyet): ");
    int loai = sc.nextInt();
    sc.nextLine(); // bỏ dòng thừa

    System.out.print("Nhap ma sach: ");
    String ma = sc.nextLine();
    System.out.print("Nhap tieu de: ");
    String tieuDe = sc.nextLine();
    System.out.print("Nhap tac gia: ");
    String tacGia = sc.nextLine();
    System.out.print("Nhap nam xuat ban: ");
    int nam = sc.nextInt();
    System.out.print("Nhap so luong: ");
    int soLuong = sc.nextInt();
    System.out.print("Nhap gia co ban: ");
    double giaCoBan = sc.nextDouble();
    sc.nextLine(); // bỏ dòng thừa

    Sach sachMoi = null;
        switch (loai) {
            case 1:
                System.out.print("Nhap mon hoc: ");
                String monHoc = sc.nextLine();
                System.out.print("Nhap cap do: ");
                String capDo = sc.nextLine();
                sachMoi = new SachGiaoTrinh(ma, tieuDe, tacGia, nam, soLuong, giaCoBan, monHoc, capDo);
                break;
            case 2:
                System.out.print("Nhap the loai: ");
                String theLoai = sc.nextLine();
                System.out.print("Sach co phai series (true/false): ");
                boolean laSeries = Boolean.parseBoolean(sc.nextLine());
                sachMoi = new SachTieuThuyet(ma, tieuDe, tacGia, nam, soLuong, giaCoBan, theLoai, laSeries);
                break;
            default:
                System.out.println("Loai sach khong hop le.");
                return;
        }

    danhSachSach[soLuongSach++] = sachMoi;
    System.out.println("Them sach moi thanh cong!");
    }


    // Xoa sach theo ma
    public void xoaSach(String maSach) {
        boolean timThay = false;
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
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

    // Tim sach theo ma
    public Sach timSach(String maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                return danhSachSach[i];
            }
        }
        return null;
    }

    // Hien thi tat ca sach
    public void hienThiTatCaSach() {
        if (soLuongSach == 0) {
            System.out.println("Danh sach sach trong.");
        } else {
            for (int i = 0; i < soLuongSach; i++) {
                System.out.println(danhSachSach[i].toString());
            }
        }
    }

    // Cap nhat thong tin sach
    public void capNhatSach(String maSach, Scanner sc) {
        Sach sach = timSach(maSach);
        if (sach == null) {
            System.out.println("Khong tim thay sach co ma nay.");
            return;
        }

        System.out.print("Nhap tieu de moi: ");
        sc.nextLine();
        sach.setTieuDe(sc.nextLine());
        System.out.print("Nhap tac gia moi: ");
        sach.setTacGia(sc.nextLine());
        System.out.print("Nhap nam xuat ban moi: ");
        sach.setNamXuatBan(sc.nextInt());
        System.out.print("Nhap so luong moi: ");
        sach.setSoLuong(sc.nextInt());
        System.out.print("Nhap gia co ban moi: ");
        sach.setGiaCoBan(sc.nextDouble());

        System.out.println("Da cap nhat thong tin sach thanh cong.");
    }
}
