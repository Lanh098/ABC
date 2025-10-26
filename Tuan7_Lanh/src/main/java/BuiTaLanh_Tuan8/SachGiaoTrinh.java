/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuiTaLanh_Tuan7;

/**
 *
 * @author Bùi Tá Lanh
 */
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String trinhDo;
    public SachGiaoTrinh() {}
    public SachGiaoTrinh(String ma, String ten, String tg, int nam, int sl, double gia,
                         String monHoc, String trinhDo) {
        super(ma, ten, tg, nam, sl, gia);
        this.monHoc = monHoc;
        this.trinhDo = trinhDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public double tinhGiaBan() {
        double gia = getGiaGoc() + (2025 - getNamXB()) * 5000;
        return (gia > 0) ? gia : 0;
    }

    @Override
    public String toString() {
        return String.format("Giao trinh [ma=%s, ten='%s', tacGia='%s', namXB=%d, SL=%d, monHoc='%s', trinhDo='%s', giaBan=%.0f]",
                getMa(), getTenSach(), getTacGia(), getNamXB(), getSoLuong(), monHoc, trinhDo, tinhGiaBan());
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
        System.out.println("=== Sach Giao Trinh ===");
        System.out.println("Ma: " + getMa() + ", Ten: " + getTenSach() + ", Tac gia: " + getTacGia() + ", Nam XB: " + getNamXB());
        System.out.println("So luong: " + getSoLuong() + ", Mon hoc: " + monHoc + ", Trinh do: " + trinhDo);
        System.out.println("Gia ban uoc tinh: " + tinhGiaBan() + " VNĐ");
    }
}

