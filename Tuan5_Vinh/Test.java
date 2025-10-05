import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            
            System.out.print("Nhap ma sach: ");
            String maSach = sc.nextLine();
            
            System.out.print("Nhap tieu de: ");
            String tieuDe = sc.nextLine();
            
            System.out.print("Nhap tac gia: ");
            String tacGia = sc.nextLine();
            
            System.out.print("Nhap nam xuat ban: ");
            int namXuatBan = sc.nextInt();
            
            System.out.print("Nhap so luong: ");
            int soLuong = sc.nextInt();
            Sach sach = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            
            System.out.println("\nThong tin sach vua nhap:");
            sach.hienThiThongTin();
        }
    }
}
