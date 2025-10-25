package Tuan8_HuynhNgocAnh; 
import java.util.Scanner;
import Sach.*;

public class HuynhNgocAnh_Tuan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach muon quan ly: ");
        int n = Integer.parseInt(sc.nextLine());
        IQuanLySach quanLy = new QuanLySachImpl(n);
        int luaChon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH (TUAN 8) ====="); // [cite: 30]
            System.out.println("1. Them sach moi");
            System.out.println("2. Xoa sach");
            System.out.println("3. Tim kiem");
            System.out.println("4. Cap nhap");
            System.out.println("5. Hien thi");
            System.out.println("0. Thoat chuong trinh");
            while (true) {
                try {
                    System.out.print("Nhap lua chon: ");
                    luaChon = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhap sai dinh dang, vui long nhap so!");
                }
            }

            switch (luaChon) {
                case 1 -> quanLy.themSach(sc);
                case 2 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                }
                case 3 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach sach = quanLy.timSach(maTim);
                    if (sach != null) {
                        System.out.println("Da tim thay sach:");
                        System.out.println(sach.toString());
                    } else {
                        System.out.println("Khong tim thay sach " + maTim);
                    }
                }
                case 4 -> {
                    System.out.print("Nhap ma sach can cap nhap: ");
                    String maCapNhat = sc.nextLine();
                    quanLy.capNhatSach(maCapNhat, sc);
                }
                case 5 -> quanLy.hienThiTatCaSach();
                case 0 -> System.out.println("Thoat!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);
    }
}