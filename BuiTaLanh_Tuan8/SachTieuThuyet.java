/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuiTaLanh_Tuan8;

/**
 *
 * @author Bùi Tá Lanh
 */
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean coSeries;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String ma, String ten, String tg, int nam, int sl, double gia, String theLoai, boolean coSeries) {
        super(ma, ten, tg, nam, sl, gia);
        this.theLoai = theLoai;
        this.coSeries = coSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isCoSeries() {
        return coSeries;
    }

    public void setCoSeries(boolean coSeries) {
        this.coSeries = coSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaGoc() + (coSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return String.format("Tieu thuyet [ma=%s, ten='%s', tacGia='%s', namXB=%d, SL=%d, theLoai='%s', series=%b, giaBan=%.0f]",
                getMa(), getTenSach(), getTacGia(), getNamXB(), getSoLuong(), theLoai, coSeries, tinhGiaBan());
    }
        @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + getTenSach() + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Sach Tieu Thuyet ===");
        System.out.println("Ma: " + getMa() + ", Ten: " + getTenSach() + ", Tac gia: " + getTacGia() + ", Nam XB: " + getNamXB());
        System.out.println("So luong: " + getSoLuong() + ", The loai: " + theLoai + ", Series: " + coSeries);
        System.out.println("Gia ban uoc tinh: " + tinhGiaBan() + " VNĐ");
    }
}

