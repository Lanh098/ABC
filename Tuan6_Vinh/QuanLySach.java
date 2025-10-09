import java.util.ArrayList;

public class QuanLySach {
    private final ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void xoaSach(String maSach) {
        danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy mã sách để cập nhật!");
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
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
