package th_t8;

public interface IQuanLySach {
    void themSach(Sach s);
    Sach timKiemSach(String maSach);
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
    boolean capNhatSach(String maSach, Sach sachMoi);
}
