/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BuiTaLanh_Tuan8;
import java.util.Scanner;
/**
 *
 * @author Bùi Tá Lanh
 */
public interface IQuanLySach {
    void themSach(Scanner sc);
    void themSach(Sach s);
    void hienThiDanhSach();
    Sach timKiemSach(String ma);
    void xoaSach(String ma);
}

