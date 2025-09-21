import java.util.Scanner;
public class Tuan4_Cau5_Lanh
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so : ");
        int n = sc.nextInt();
        if (n <= 1) 
            System.out.println(n + " khong phai so nguyen to.");
        else 
        {
            boolean laNguyenTo = true;
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    laNguyenTo = false;
                    break;
                }
            }
            if (laNguyenTo)
                System.out.println(n + " la so nguyen to.");
            else
                System.out.println(n + " khong phai so nguyen to.");
        }
    }
}
