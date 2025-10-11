/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bùi Tá Lanh
 */
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int chon;

        do {
            System.out.println("\n=== MENU QUAN LY SACH ===");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Cap nhat sach");
            System.out.println("5. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("\n1. Sach giao trinh\n2. Sach tieu thuyet");
                    System.out.print("Chon loai sach: ");
                    int loai = Integer.parseInt(sc.nextLine());

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

                    if (loai == 1) {
                        System.out.print("Mon hoc: ");
                        String mh = sc.nextLine();
                        System.out.print("Cap do: ");
                        String cd = sc.nextLine();
                        ql.themSach(new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd));
                    } else {
                        System.out.print("The loai: ");
                        String tl = sc.nextLine();
                        System.out.print("La series (true/false): ");
                        boolean ls = Boolean.parseBoolean(sc.nextLine());
                        ql.themSach(new SachTieuThuyet(ma, td, tg, nam, sl, tl, ls));
                    }
                    break;

                case 2:
                    ql.hienThiSach();
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = ql.timSachTheoMa(maTim);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay!");
                    break;

                case 4:
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String maSua = sc.nextLine();
                    if (ql.capNhatSach(maSua, sc))
                        System.out.println("Cap nhat thanh cong!");
                    else
                        System.out.println("Khong tim thay sach!");
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa))
                        System.out.println("Da xoa thanh cong!");
                    else
                        System.out.println("Khong tim thay sach!");
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}

