import java.util.Scanner;

public class Cau2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap chieu cao: ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.next();

        System.out.print("Ban co thich lap trinh khong? (True hoac False)  ");
        boolean thichLapTrinh = sc.nextBoolean();

        System.out.println("\n Thong tin ca nhan");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieuCao);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Thich lap trinh: " + thichLapTrinh);

        sc.close();
    }
}
