package th_t4;
import java.util.Scanner;

public class Tuan4_Bai147_Thinh{
    public static void bai1(Scanner sc) {
        System.out.print("Nhap vao mot so: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " la so duong");
        } else if (n < 0) {
            System.out.println(n + " la so am");
        } else {
            System.out.println("So vua nhap bang 0");
        }
    }

    public static void bai4(Scanner sc) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong tu 1 den " + n + " = " + tong);
    }

    public static void bai7(Scanner sc) {
        System.out.print("Nhap so han tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }

        System.out.println("Tong cac phan tu trong mang = " + tong);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Bai 1: Kiem tra so am, duong hoac bang 0");
            System.out.println("2. Bai 4: Tinh tong cac so tu 1 den n");
            System.out.println("3. Bai 7: Tinh tong cac phan tu trong mang");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bai1(sc);
                    break;
                case 2:
                    bai4(sc);
                    break;
                case 3:
                    bai7(sc);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        } while (choice != 0);
    }
}

