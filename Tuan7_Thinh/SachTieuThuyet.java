package th_t7;

public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    // Trien khai phuong thuc truu tuong
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    // Trien khai giao dien IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + getTieuDe() + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Sach Tieu Thuyet [" +
                "Ma: " + getMaSach() +
                ", Tieu de: " + getTieuDe() +
                ", Tac gia: " + getTacGia() +
                ", Nam XB: " + getNamXuatBan() +
                ", So luong: " + getSoLuong() +
                ", The loai: " + theLoai +
                ", Series: " + (laSachSeries ? "Co" : "Khong") +
                ", Gia co ban: " + getGiaCoBan() +
                ", Gia ban uoc tinh: " + tinhGiaBan() + " VND" +
                "]";
    }
}
