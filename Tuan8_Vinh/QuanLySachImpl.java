/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan8_vinh;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vinh
 */

public class QuanLySachImpl implements IQuanLySach {
    private final ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    @Override
    public void xoaSach(String maSach) {
        boolean removed = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
        System.out.println(removed ? "Da xoa sach co ma: " + maSach : "Khong tim thay sach co ma: " + maSach);
    }

    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong cho ma sach: " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay ma sach de cap nhat!");
    }

    @Override
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public List<Sach> hienThiDanhSach() {
        return new ArrayList<>(danhSach);
    }
}