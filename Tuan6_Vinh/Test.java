import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem theo ma sach");
            System.out.println("5. Cap nhat so luong sach");
            System.out.println("6. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    System.out.println("== Them sach giao trinh ==");
                    System.out.print("Ma sach: ");
                    String maGT = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String tdGT = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tgGT = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int namGT = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int slGT = Integer.parseInt(sc.nextLine());
                    System.out.print("Mon hoc: ");
                    String mon = sc.nextLine();
                    System.out.print("Cap do: ");
                    String capDo = sc.nextLine();

                    SachGiaoTrinh sg = new SachGiaoTrinh(maGT, tdGT, tgGT, namGT, slGT, mon, capDo);
                    ql.themSach(sg);
                    System.out.println("Da them sach giapo trinh!");
                }

                case 2 -> {
                    System.out.println("== Them sach tieu thuyet ==");
                    System.out.print("Ma sach: ");
                    String maTT = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String tdTT = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tgTT = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int namTT = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int slTT = Integer.parseInt(sc.nextLine());
                    System.out.print("The loai: ");
                    String tl = sc.nextLine();
                    System.out.print("Co phai sach series khong (true/false): ");
                    boolean series = Boolean.parseBoolean(sc.nextLine());

                    SachTieuThuyet st = new SachTieuThuyet(maTT, tdTT, tgTT, namTT, slTT, tl, series);
                    ql.themSach(st);
                    System.out.println("Da them sach tieu thuyet!");
                }

                case 3 -> {
                    System.out.println("== Danh Sach sach ==");
                    ql.hienThiDanhSach();
                }

                case 4 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach kq = ql.timKiemTheoMa(maTim);
                    if (kq != null) System.out.println(kq);
                    else System.out.println("Khong tim thay sach!");
                }

                case 5 -> {
                    System.out.print("Nhap ma sach can nhap: ");
                    String maCN = sc.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int slMoi = Integer.parseInt(sc.nextLine());
                    ql.capNhatSoLuong(maCN, slMoi);
                }

                case 6 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                    System.out.println("Da xoa (neu ton tai).");
                }

                case 0 -> System.out.println("Thoat chuong trinh...");

                default -> System.out.println("❗ Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
