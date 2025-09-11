package btm;   

import java.util.Scanner;

public class BTM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close(); // đóng scanner
    }
}