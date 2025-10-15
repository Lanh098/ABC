package Sach;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        // Ví dụ: sách càng cũ thì giá giảm 5000/năm
        double gia = giaCoBan + ((2025 - this.namXuatBan) * 5000);
        return Math.max(gia, 0); // tránh giá âm nếu năm XB > 2025
    }

    @Override
    public String toString() {
        return "SachGiaoTrinh {" +
                "maSach='" + maSach + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", giaCoBan=" + giaCoBan +
                ", monHoc='" + monHoc + '\'' +
                ", capDo='" + capDo + '\'' +
                ", giaBan=" + tinhGiaBan() +
                '}';
    }
}
