import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien gui (VND): ");
        double soTienGui = scanner.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = scanner.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThang = scanner.nextInt();

        double laiSuatThang = laiSuatNam / 100 / 12;
        double tienLai = soTienGui * laiSuatThang * soThang;
        double tongTien = soTienGui + tienLai;

        System.out.println("So tien lai: " + tienLai + " VND");
        System.out.println("So tien goc cuoi ky: " + tongTien + " VND");

        scanner.close();
    }
}
