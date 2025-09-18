import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Tuan4_Cau258_Lanh {
    public static void timSoNhoNhat(Scanner sc) {
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap so c: ");
        int c = sc.nextInt();
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("So nho nhat la: " + min);
    }

    public static void kiemTraSoNguyenTo(Scanner sc) {
        System.out.print("Nhap so nguyen: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " khong phai la so nguyen to.");
            return;
        }
        boolean laNguyenTo = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                laNguyenTo = false;
                break;
            }
        }
        if (laNguyenTo) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }
    public static void timPhanTuXuatHienNhieuNhat(Scanner sc) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> tanSuat = new HashMap<>();
        for (int num : arr) {
            tanSuat.put(num, tanSuat.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int phanTuNhieuNhat = arr[0];
        for (Map.Entry<Integer, Integer> entry : tanSuat.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                phanTuNhieuNhat = entry.getKey();
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la: " + phanTuNhieuNhat + " (xuat hien " + maxCount + " lan)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tim so nho nhat trong 3 so");
            System.out.println("2. Kiem tra so nguyen to");
            System.out.println("3. Tim phan tu xuat hien nhieu nhat trong mang");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    timSoNhoNhat(sc);
                    break;
                case 2:
                    kiemTraSoNguyenTo(sc);
                    break;
                case 3:
                    timPhanTuXuatHienNhieuNhat(sc);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
        sc.close();
    }
}
