package Sach;

public class SachTieuThuyet extends Sach {
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

    @Override
    public double tinhGiaBan() {
        // Nếu là sách series thì cộng thêm 15,000
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return String.format("Tieu thuyet {ma='%s', tieuDe='%s', tacGia='%s', namXB=%d, soLuong=%d, theLoai='%s', laSeries=%b, giaBan=%.0f}",
                maSach, tieuDe, tacGia, namXuatBan, soLuong, theLoai, laSachSeries, tinhGiaBan());
    }
}
