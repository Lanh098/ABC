package th_t8;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * (laSachSeries ? 1.5 : 1.3);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen tieu thuyet [" + tieuDe + "] den vi tri: " + viTriMoi + ".");
    }

    @Override
    public String toString() {
        return "Sach tieu thuyet [" +
                "Ma: " + maSach +
                ", Tieu de: " + tieuDe +
                ", Tac gia: " + tacGia +
                ", Nam XB: " + namXuatBan +
                ", So luong: " + soLuong +
                ", Gia co ban: " + giaCoBan +
                ", The loai: " + theLoai +
                ", Thuoc series: " + (laSachSeries ? "Co" : "Khong") +
                ", Gia ban: " + tinhGiaBan() +
                "]";
    }
}
