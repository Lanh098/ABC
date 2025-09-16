import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tuan4_Bai369_NgAnh {

    // Ham tinh toan co ban
    public static void basicCalculator(Scanner sc) {
        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();
        System.out.print("Chon phep tinh (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        boolean valid = true;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) result = a / b;
                else {
                    System.out.println("Khong the chia cho 0!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Phep tinh khong hop le!");
                valid = false;
        }
        if (valid) System.out.println("Ket qua: " + result);
    }

    // Ham tim UCLN va BCNN
    public static void gcdLcm(Scanner sc) {
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("UCLN cua " + a + " va " + b + " la: " + gcd);
        System.out.println("BCNN cua " + a + " va " + b + " la: " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Ham tao va in danh sach so nguyen
    public static void integerList(Scanner sc) {
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }
        System.out.println("Danh sach cac so nguyen:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thuc hien phep tinh co ban (+, -, *, /)");
            System.out.println("2. Tim UCLN va BCNN cua hai so nguyen");
            System.out.println("3. Tao va in danh sach cac so nguyen");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    basicCalculator(sc);
                    break;
                case 2:
                    gcdLcm(sc);
                    break;
                case 3:
                    integerList(sc);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
            System.out.println();
        } while (choice != 0);
        sc.close();
    }
}
