package Sach;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() { super(); }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() { // [cite: 16]
        double gia = giaCoBan + ((2025 - this.namXuatBan) * 5000);
        return Math.max(gia, 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) { 
        return this.soLuong >= soLuongToiThieu; 
    }

    @Override
    public void capNhatViTri(String viTriMoi) { 
        System.out.println("Đã chuyển sách [" + this.tieuDe + "] đến khu vực: [" + viTriMoi + "]."); // [cite: 19]
    }

    @Override
    public String toString() { // [cite: 20]
        return "SachGiaoTrinh {" +
                "maSach='" + maSach + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", monHoc='" + monHoc + '\'' +
                ", capDo='" + capDo + '\'' +
                ", giaBan=" + tinhGiaBan() +
                '}';
    }
}