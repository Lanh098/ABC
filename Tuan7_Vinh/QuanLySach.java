import java.util.ArrayList;

public class QuanLySach {
    private final ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }
    
    public void xoaSach(String maSach) {
        boolean removed = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
        if (removed) {
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

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

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach hien dang trong!");
        } else {
            System.out.println("\n===== DANH SACH CAC SACH =====");
            for (Sach s : danhSach) {
                System.out.println(s.toString());
                System.out.println("----------------------------------------");
            }
        }
    }
}
