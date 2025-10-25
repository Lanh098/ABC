package th_t8;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.2;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach giao trinh [" + tieuDe + "] den khu vuc: " + viTriMoi + ".");
    }

    @Override
    public String toString() {
        return "Sach giao trinh [" +
                "Ma: " + maSach +
                ", Tieu de: " + tieuDe +
                ", Tac gia: " + tacGia +
                ", Nam XB: " + namXuatBan +
                ", So luong: " + soLuong +
                ", Gia co ban: " + giaCoBan +
                ", Mon hoc: " + monHoc +
                ", Cap do: " + capDo +
                ", Gia ban: " + tinhGiaBan() +
                "]";
    }
}
