package Sach;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() { super(); }

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
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) { 
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) { 
        System.out.println("Đã chuyển sách [" + this.tieuDe + "] đến khu vực: [" + viTriMoi + "]."); 
    }

    @Override
    public String toString() { 
        return String.format("Tieu thuyet {ma='%s', tieuDe='%s', tacGia='%s', namXB=%d, soLuong=%d, theLoai='%s', laSeries=%b, giaBan=%.0f}",
                maSach, tieuDe, tacGia, namXuatBan, soLuong, theLoai, laSachSeries, tinhGiaBan());
    }
}