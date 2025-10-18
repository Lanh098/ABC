package th_t7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int chon = -1;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Cap nhat thong tin sach");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("6. Kiem ke sach"); // ✅ Thêm chức năng mới
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang so!");
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
                    System.out.print("Gia co ban: ");
                    double giaCoBan = Double.parseDouble(sc.nextLine());

                    if (loai == 1) {
                        System.out.print("Mon hoc: ");
                        String mh = sc.nextLine();
                        System.out.print("Cap do: ");
                        String cd = sc.nextLine();
                        ql.themSach(new SachGiaoTrinh(ma, td, tg, nam, sl, giaCoBan, mh, cd));
                    } else if (loai == 2) {
                        System.out.print("The loai: ");
                        String tl = sc.nextLine();
                        System.out.print("Thuoc series khong (true/false): ");
                        boolean ser = Boolean.parseBoolean(sc.nextLine());
                        ql.themSach(new SachTieuThuyet(ma, td, tg, nam, sl, giaCoBan, tl, ser));
                    } else {
                        System.out.println("Loai sach khong hop le!");
                    }
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
                        sachCu.setTieuDe(sc.nextLine());
                        System.out.print("Tac gia moi: ");
                        sachCu.setTacGia(sc.nextLine());
                        System.out.print("Nam xuat ban moi: ");
                        sachCu.setNamXuatBan(Integer.parseInt(sc.nextLine()));
                        System.out.print("So luong moi: ");
                        sachCu.setSoLuong(Integer.parseInt(sc.nextLine()));
                        System.out.print("Gia co ban moi: ");
                        sachCu.setGiaCoBan(Double.parseDouble(sc.nextLine()));
                        System.out.println("Cap nhat thanh cong!");
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

                case 6: {
                    System.out.println("\n-- KIEM KE SACH --");
                    System.out.print("Nhap ma sach can kiem ke: ");
                    String maKiem = sc.nextLine();
                    Sach s = ql.timKiemTheoMa(maKiem);

                    if (s == null) {
                        System.out.println("Khong tim thay sach co ma nay!");
                    } else {
                        // Ép kiểu sang IKiemKe 
                        IKiemKe kiemKe = (IKiemKe) s;

                        System.out.print("Nhap so luong toi thieu: ");
                        int min = Integer.parseInt(sc.nextLine());
                        boolean duHang = kiemKe.kiemTraTonKho(min);
                        System.out.println("Kiem tra ton kho: " + (duHang ? "Du hang" : "Khong du hang"));

                        System.out.print("Nhap vi tri moi de cap nhat: ");
                        String viTri = sc.nextLine();
                        kiemKe.capNhatViTri(viTri);
                    }
                    break;
                }

                case 0: {
                    System.out.println("Thoat chuong trinh, tam biet!");
                    break;
                }

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
