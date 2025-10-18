package th_t7;


import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }

    public void hienThiTatCa() {
    for (Sach s : danhSach) {
        System.out.println(s.toString());
    }
    }
}

