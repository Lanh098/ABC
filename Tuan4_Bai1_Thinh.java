package th_t4;
import java.util.Scanner;

public class Tuan4_Bai1_Thinh {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println(n + " la so duong");
        else if (n < 0)
            System.out.println(n + " la so am");
        else
            System.out.println("So vua nhap bang 0");
    }
}


