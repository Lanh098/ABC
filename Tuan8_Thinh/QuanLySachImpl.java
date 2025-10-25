package th_t8;

import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s);
                System.out.println("-----------------------------------");
            }
        }
    }

    @Override
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }
}
