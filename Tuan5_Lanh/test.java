import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap tieu de sach: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        Sach sach = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        System.out.println("\n===== Thong tin sach vua nhap =====");
        sach.hienThiThongTin();
        sc.close();
    }
}
