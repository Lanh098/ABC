/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sach;
import java.util.Scanner;
/**
 *
 * @author HNgAnh
 */
public interface IQuanLySach {
    void themSach(Scanner sc);
    void xoaSach(String maSach);
    Sach timSach(String maSach);
    void hienThiTatCaSach();
    void capNhatSach(String maSach, Scanner sc);
}
