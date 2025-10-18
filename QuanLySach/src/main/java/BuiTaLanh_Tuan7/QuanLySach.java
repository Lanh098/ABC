/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BuiTaLanh_Tuan7;
import java.util.Scanner;
/**
 *
 * @author Bùi Tá Lanh
 */
public class QuanLySach {
    private Sach[] danhSach;
    private int soLuong;
    private int gioiHan;

    public QuanLySach(int gioiHan) {
        this.gioiHan = gioiHan;
        this.danhSach = new Sach[gioiHan];
        this.soLuong = 0;
    }

    // Thêm sách từ Scanner
    public void themSach(Scanner sc) {
        if (soLuong >= gioiHan) {
            System.out.println("Danh sach da day!");
            return;
        }

        System.out.print("Loai sach (1-GT, 2-TT): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Tac gia: ");
        String tg = sc.nextLine();
        System.out.print("Nam XB: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("So luong: ");
        int sl = Integer.parseInt(sc.nextLine());
        System.out.print("Gia co ban: ");
        double gia = Double.parseDouble(sc.nextLine());

        Sach s;
        if (loai == 1) {
            System.out.print("Mon hoc: ");
            String mon = sc.nextLine();
            System.out.print("Trinh do: ");
            String trinh = sc.nextLine();
            s = new SachGiaoTrinh(ma, ten, tg, nam, sl, gia, mon, trinh);
        } else {
            System.out.print("The loai: ");
            String tl = sc.nextLine();
            System.out.print("Co phai series khong (true/false): ");
            boolean ser = Boolean.parseBoolean(sc.nextLine());
            s = new SachTieuThuyet(ma, ten, tg, nam, sl, gia, tl, ser);
        }

        danhSach[soLuong++] = s;
        System.out.println("Them thanh cong!");
    }

    public void hienThi() {
        if (soLuong == 0) {
            System.out.println("Khong co sach nao!");
            return;
        }
        for (int i = 0; i < soLuong; i++) {
            danhSach[i].hienThiThongTin();
        }
    }

    public void timSach(String ma) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMa().equalsIgnoreCase(ma)) {
                danhSach[i].hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay sach co ma: " + ma);
    }

    public void xoaSach(String ma) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMa().equalsIgnoreCase(ma)) {
                for (int j = i; j < soLuong - 1; j++) {
                    danhSach[j] = danhSach[j + 1];
                }
                danhSach[--soLuong] = null;
                System.out.println("Da xoa sach " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay de xoa!");
    }

    public void capNhat(String ma, Scanner sc) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMa().equalsIgnoreCase(ma)) {
                System.out.print("Ten moi: ");
                danhSach[i].setTenSach(sc.nextLine());
                System.out.print("Tac gia moi: ");
                danhSach[i].setTacGia(sc.nextLine());
                System.out.print("Nam XB moi: ");
                danhSach[i].setNamXB(Integer.parseInt(sc.nextLine()));
                System.out.print("So luong moi: ");
                danhSach[i].setSoLuong(Integer.parseInt(sc.nextLine()));
                System.out.print("Gia goc moi: ");
                danhSach[i].setGiaGoc(Double.parseDouble(sc.nextLine()));
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat!");
    }
    public void themSach(Sach s) {
    if (soLuong >= gioiHan) {
        System.out.println("Danh sach da day!");
        return;
    }
    danhSach[soLuong++] = s;
    System.out.println("Them thanh cong!");
}
}
