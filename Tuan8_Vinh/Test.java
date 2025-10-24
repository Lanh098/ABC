/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan8_vinh;
    import java.util.Scanner;
/**
 *
 * @author vinh
 */
public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem theo ma sach");
            System.out.println("5. Cap nhat so luong");
            System.out.println("6. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Mon hoc: ");
                    String mon = sc.nextLine();
                    System.out.print("Cap do: ");
                    String cap = sc.nextLine();

                    SachGiaoTrinh sg = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mon, cap);
                    quanLy.themSach(sg);
                }
                case 2 -> {
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("The loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La series? (true/false): ");
                    boolean series = Boolean.parseBoolean(sc.nextLine());

                    SachTieuThuyet st = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, series);
                    quanLy.themSach(st);
                }
                case 3 -> {
                    System.out.println("\n===== DANH SACH SACH =====");
                    for (Sach s : quanLy.hienThiDanhSach()) {
                        System.out.println(s);
                        System.out.println("---------------------------");
                    }
                }
                case 4 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemTheoMa(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay sach ca ma: " + ma);
                }
                case 5 -> {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    quanLy.capNhatSoLuong(ma, sl);
                }
                case 6 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    quanLy.xoaSach(ma);
                }
                case 0 -> System.out.println("Thoat chuong trinh...");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } 
        while (chon != 0);
        sc.close();
    }
}

