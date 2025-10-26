/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuiTaLanh_Tuan8;

/**
 *
 * @author Bùi Tá Lanh
 */
public abstract class Sach {
    private String ma;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private int soLuong;
    protected double giaGoc;
    public Sach() {}
    public Sach(String ma, String tenSach, String tacGia, int namXB, int soLuong, double giaGoc) {
        this.ma = ma;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.soLuong = soLuong;
        this.giaGoc = giaGoc;
    }
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }

    public void hienThi() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Sach [ma=%s, ten='%s', tacGia='%s', namXB=%d, soLuong=%d, giaGoc=%.0f]",
                ma, tenSach, tacGia, namXB, soLuong, giaGoc);
    }
    public abstract double tinhGiaBan();
    public abstract void hienThiThongTin();
}

