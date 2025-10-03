package th_t4;
import java.util.Scanner;

public class Tuan4_Bai7_Thinh
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int tong = 0;
        for (int i = 0; i < n; i++) 
            tong += a[i];
        System.out.println("Tong cac han tu trong mang = " + tong);
    }
}
