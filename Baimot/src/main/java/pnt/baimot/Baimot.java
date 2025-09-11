/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pnt.baimot;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Baimot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close(); // đóng scanner
    }
}
