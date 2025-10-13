/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package huynhngocanh_tuan6;
import java.util.Scanner;
import Sach.*;

/**
 *
 * @author HNgAnh
 */
public class HuynhNgocAnh_Tuan6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach muon quan ly: ");
        int n = Integer.parseInt(sc.nextLine());
        QuanLySach ql = new QuanLySach(n);

        int luaChon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach moi");
            System.out.println("2. Xoa sach");
            System.out.println("3. Tim kiem");
            System.out.println("4. Cap nhap");
            System.out.println("5. Hien thi");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1 -> {
                    System.out.println("\n--- Them sach ---");
                    ql.nhapSachMoi(sc);
                }

                case 2 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                }

                case 3 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach sach = ql.timKiemSach(maTim);
                    if (sach != null) {
                        System.out.println("Da tim thay sach:");
                        System.out.println(sach.toString());
                    } else {
                        System.out.println("Khong tim thay sach " + maTim);
                    }
                }
                case 4 -> { // Cập nhật
                    System.out.print("Nhap ma sach can cap nhap: ");
                    String maCapNhat = sc.nextLine();
                    Sach sachCu = ql.timKiemSach(maCapNhat);

                    if (sachCu != null) {
                        System.out.println("Nhap thong tin moi cho sach:");
                        Sach sachMoi = ql.nhapMotSach(sc); // không thêm, chỉ nhập
                        ql.capNhatSach(maCapNhat, sachMoi);
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                }

                case 5 -> ql.hienThiDanhSach();

                case 0 -> System.out.println("Thoat!");

                default -> System.out.println("Lua chon khong hop le!");
            }

        } while (luaChon != 0);
    }
}
