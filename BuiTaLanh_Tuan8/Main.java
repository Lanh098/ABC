/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuiTaLanh_Tuan8;
import java.util.Scanner;
/**
 *
 * @author Bùi Tá Lanh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach toi da: ");
        int n = Integer.parseInt(sc.nextLine());
        QuanLySach ql = new QuanLySach(n);

        int chon;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Them sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Cap nhat");
            System.out.println("5. Hien thi tat ca");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> ql.themSach(sc);
                case 2 -> {
                    System.out.print("Nhap ma can xoa: ");
                    ql.xoaSach(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Nhap ma can tim: ");
                    ql.timSach(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Nhap ma can cap nhat: ");
                    ql.capNhat(sc.nextLine(), sc);
                }
                case 5 -> ql.hienThi();
                case 6 -> {
                    System.out.print("Test : ");
                    SachGiaoTrinh sgt = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A",
                                                          2020, 120, 50000, "CNTT", "DH");
                    SachTieuThuyet stt = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling",
                                                            2015, 50, 80000, "Fantasy", true);

                    ql.themSach(sgt);
                    ql.themSach(stt);

                    System.out.println("\n=== Danh sach sach sau khi them ===");
                    ql.hienThi();

                    IKiemKe kiemKe = sgt;
                    System.out.println("\n=== Test IKiemKe ===");
                    System.out.println("Ton kho >= 100? " + kiemKe.kiemTraTonKho(100));
                    kiemKe.capNhatViTri("Kho A1 - Ke 5");
                }
               
                case 0 -> System.out.println("Tam biet!");
                default -> System.out.println("Lua chon sai!");
            }
        } while (chon != 0);
    }
}

