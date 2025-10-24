/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tuan8_vinh;

import java.util.List;

/**
 *
 * @author vinh
 */
public interface IQuanLySach {
    void themSach(Sach s);
    void xoaSach(String maSach);
    void capNhatSoLuong(String maSach, int soLuongMoi);
    Sach timKiemTheoMa(String maSach);
    List<Sach> hienThiDanhSach();
}
