package Sach;

// Triển khai giao diện IKiemKe 
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {
        super();
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    // Getters and Setters
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        // Giá bán = giaCoBan + (Nếu laSachSeries là true thì cộng thêm 15.000 VNĐ, ngược lại cộng 0) 
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        // Cập nhật toString() để hiển thị cả Gia Bán 
        return String.format("Tieu thuyet {ma='%s', tieuDe='%s', tacGia='%s', namXB=%d, soLuong=%d, theLoai='%s', laSeries=%b, giaBan=%.0f}",
                maSach, tieuDe, tacGia, namXuatBan, soLuong, theLoai, laSachSeries, tinhGiaBan());
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