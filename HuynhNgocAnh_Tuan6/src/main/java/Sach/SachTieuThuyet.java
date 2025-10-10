/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sach;

/**
 *
 * @author HNgAnh
 */
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private Boolean laSachSeries;
    public SachTieuThuyet()
    {
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public Boolean getLaSachSeries() {
        return laSachSeries;
    }
    public void setLaSachSeries(Boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    @Override
    public String toString() {
        return "Sachtieuthuyet{" +
                "maSach='" + maSach + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", theLoai='" + theLoai + '\'' +
                ", laSachSeries=" + laSachSeries +
                '}';
    }
}
