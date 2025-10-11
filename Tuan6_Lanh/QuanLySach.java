/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bùi Tá Lanh
 */
import java.util.*;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            for (Sach s : danhSach) {
                System.out.println("-----------------");
                System.out.println(s);
            }
        }
    }

    public Sach timSachTheoMa(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) return s;
        }
        return null;
    }

    public boolean xoaSach(String ma) {
        Sach s = timSachTheoMa(ma);
        if (s != null) {
            danhSach.remove(s);
            return true;
        }
        return false;
    }

    public boolean capNhatSach(String ma, Scanner sc) {
        Sach s = timSachTheoMa(ma);
        if (s == null) return false;

        System.out.print("Nhap tieu de moi: ");
        String td = sc.nextLine();
        System.out.print("Nhap tac gia moi: ");
        String tg = sc.nextLine();
        System.out.print("Nhap nam xuat ban moi: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong moi: ");
        int sl = Integer.parseInt(sc.nextLine());

        s.tieuDe = td;
        s.tacGia = tg;
        s.namXuatBan = nam;
        s.soLuong = sl;
        return true;
    }
}



