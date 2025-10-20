package Sach;

// Triển khai giao diện IKiemKe 
public class SachGiaoTrinh extends Sach implements IKiemKe {
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

    // Getters and Setters
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        // Giá bán = giaCoBan + (Số năm đã xuất bản × 5.000 VNĐ) 
        // (Số năm đã xuất bản = 2025 - namXuatBan) 
        double gia = giaCoBan + ((2025 - this.namXuatBan) * 5000);
        return Math.max(gia, 0);
    }

    @Override
    public String toString() {
        // Cập nhật toString() để hiển thị cả Gia Bán 
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

    // Triển khai phương thức từ Interface IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // Trả về true nếu soLuong của sách ≥ soLuongToiThieu 
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        // In ra thông báo theo định dạng yêu cầu 
        System.out.println("Đã chuyển sách [" + this.tieuDe + "] đến khu vực: [" + viTriMoi + "].");
    }
}