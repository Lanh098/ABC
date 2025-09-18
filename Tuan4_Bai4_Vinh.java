package th_tuan4;
import java.util.Scanner;

public class Tuan4_Bai4_Vinh 
{
    private final int n;
    public Tuan4_Bai4_Vinh(int n) 
    {
        this.n = n;
    }
    public int tinhTong() 
    {
        int tong = 0;
        for (int i = 1; i <= n; i++) 
        {
            tong += i;
        }
        return tong;
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            
            var obj = new Tuan4_Bai4_Vinh(n);
            System.out.println("Tong tu 1 den " + n + " la: " + obj.tinhTong());
        }
    }
}
