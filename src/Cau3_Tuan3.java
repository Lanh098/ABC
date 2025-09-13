import java.util.Scanner;
public class Cau3_Tuan3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();
        
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        
        System.out.println("Tong cua a + b la " + tong);
        System.out.println("Hieu cua a - b la " + hieu);
        System.out.println("Tich cua a * b la " + tich);
        
        if (b != 0) 
        {
            double thuong = (double) 1.0 * a / b;
            int phanDu = a % b;
            System.out.println("Thuong cua a / b la " + thuong);
            System.out.println("Phan du cua a % b la " + phanDu);
        } 
        else 
        {
            System.out.println("Khong the chia cho 0!");
        }
        scanner.close();
    }
}