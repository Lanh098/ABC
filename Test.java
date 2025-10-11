package nhom1.th_t6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int chon = -1; // Khởi tạo giá trị mặc định để tránh lỗi "variable might not have been initialized"

        do {
            System.out.println();
            System.out.println("===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Cap nhat thong tin sach");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le!");
                continue;
            }

            switch (chon) {
                case 1: {
                    System.out.println("\n-- Them sach moi --");
                    System.out.println("1. Sach giao trinh");
                    System.out.println("2. Sach tieu thuyet");
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
                        System.out.print("Cap do (Vi du: Dai hoc, Pho thong): ");
                        String cd = sc.nextLine();
                        ql.themSach(new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd));
                    } else if (loai == 2) {
                        System.out.print("The loai: ");
                        String tl = sc.nextLine();
                        System.out.print("Thuoc series khong (true hoac false): ");
                        boolean ser = Boolean.parseBoolean(sc.nextLine());
                        ql.themSach(new SachTieuThuyet(ma, td, tg, nam, sl, tl, ser));
                    } else {
                        System.out.println("Loai sach khong hop le!");
                        break;
                    }

                    System.out.println("Da them sach thanh cong!");
                    break;
                }

                case 2: {
                    System.out.println("\n-- Danh sach tat ca sach --");
                    ql.hienThiTatCa();
                    break;
                }

                case 3: {
                    System.out.print("\nNhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = ql.timKiemTheoMa(maTim);

                    if (s != null) {
                        System.out.println("Thong tin sach tim duoc:");
                        System.out.println(s);
                    } else {
                        System.out.println("Khong tim thay sach co ma nay!");
                    }
                    break;
                }

                case 4: {
                    System.out.print("\nNhap ma sach can cap nhat: ");
                    String maSua = sc.nextLine();
                    Sach sachCu = ql.timKiemTheoMa(maSua);

                    if (sachCu == null) {
                        System.out.println("Khong tim thay sach co ma nay!");
                    } else {
                        System.out.print("Tieu de moi: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia moi: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam xuat ban moi: ");
                        int nam = Integer.parseInt(sc.nextLine());
                        System.out.print("So luong moi: ");
                        int sl = Integer.parseInt(sc.nextLine());

                        Sach sachMoi = new Sach(maSua, td, tg, nam, sl);

                        if (ql.capNhatSach(maSua, sachMoi))
                            System.out.println("Cap nhat thanh cong!");
                        else
                            System.out.println("Khong tim thay sach can cap nhat!");
                    }
                    break;
                }

                case 5: {
                    System.out.print("\nNhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa)) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can xoa!");
                    }
                    break;
                }

                case 0: {
                    System.out.println("Thoat chuong trinh, tam biet!");
                    break;
                }

                default: {
                    System.out.println("Lua chon khong hop le, vui long thu lai!");
                    break;
                }
            }

        } while (chon != 0);

        sc.close();
    }
}
