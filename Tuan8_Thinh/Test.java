package th_t8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon = -1;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Cap nhat thong tin sach");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("6. Cap nhat vi tri sach");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhap khong hop le!");
                continue;
            }

            switch (chon) {
                case 1 -> {
                    System.out.println("Chon loai sach:");
                    System.out.println("1. Sach giao trinh");
                    System.out.println("2. Sach tieu thuyet");
                    System.out.print("Lua chon: ");
                    int loai = Integer.parseInt(sc.nextLine());

                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam XB: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());

                    Sach s = null;
                    if (loai == 1) {
                        System.out.print("Mon hoc: ");
                        String mh = sc.nextLine();
                        System.out.print("Cap do: ");
                        String cd = sc.nextLine();
                        s = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mh, cd);
                    } else if (loai == 2) {
                        System.out.print("The loai: ");
                        String tl = sc.nextLine();
                        System.out.print("La series (true/false): ");
                        boolean series = Boolean.parseBoolean(sc.nextLine());
                        s = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, series);
                    }

                    if (s != null) {
                        ql.themSach(s);
                        System.out.println("Da them sach thanh cong!");
                    }
                }

                case 2 -> {
                    System.out.println("\n-- Danh sach sach --");
                    ql.hienThiDanhSach();
                }

                case 3 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = ql.timKiemSach(maTim);
                    if (s != null)
                        System.out.println("Thong tin sach:\n" + s);
                    else
                        System.out.println("Khong tim thay sach!");
                }

                case 4 -> {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String maSua = sc.nextLine();
                    Sach sachCu = ql.timKiemSach(maSua);

                    if (sachCu == null) {
                        System.out.println("Khong tim thay sach co ma nay!");
                    } else {
                        System.out.println("Nhap thong tin moi cho sach:");
                        System.out.print("Tieu de moi: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia moi: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam XB moi: ");
                        int nam = Integer.parseInt(sc.nextLine());
                        System.out.print("So luong moi: ");
                        int sl = Integer.parseInt(sc.nextLine());
                        System.out.print("Gia moi: ");
                        double gia = Double.parseDouble(sc.nextLine());

                        Sach sachMoi = null;
                        if (sachCu instanceof SachGiaoTrinh) {
                            System.out.print("Mon hoc moi: ");
                            String mh = sc.nextLine();
                            System.out.print("Cap do moi: ");
                            String cd = sc.nextLine();
                            sachMoi = new SachGiaoTrinh(maSua, td, tg, nam, sl, gia, mh, cd);
                        } else if (sachCu instanceof SachTieuThuyet) {
                            System.out.print("The loai moi: ");
                            String tl = sc.nextLine();
                            System.out.print("La series moi (true/false): ");
                            boolean series = Boolean.parseBoolean(sc.nextLine());
                            sachMoi = new SachTieuThuyet(maSua, td, tg, nam, sl, gia, tl, series);
                        }

                        if (ql.capNhatSach(maSua, sachMoi))
                            System.out.println("Cap nhat thanh cong!");
                        else
                            System.out.println("Loi cap nhat!");
                    }
                }

                case 5 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa))
                        System.out.println("Da xoa sach!");
                    else
                        System.out.println("Khong tim thay sach de xoa!");
                }

                // 🆕 CHỨC NĂNG MỚI: CẬP NHẬT VỊ TRÍ SÁCH
                case 6 -> {
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String maSach = sc.nextLine();
                    Sach s = ql.timKiemSach(maSach);

                    if (s == null) {
                        System.out.println("Khong tim thay sach co ma nay!");
                    } else if (s instanceof IKiemKe) {
                        System.out.print("Nhap vi tri moi: ");
                        String viTriMoi = sc.nextLine();
                        ((IKiemKe) s).capNhatViTri(viTriMoi);
                    } else {
                        System.out.println("Sach nay khong ho tro cap nhat vi tri!");
                    }
                }

                case 0 -> System.out.println("Tam biet!");

                default -> System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }
}
