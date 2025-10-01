package HuynhNgocAnh_Tuan5;

public class Test {
    public static void main(String[] args) {
        // Tạo sách bằng constructor có tham số
        Sach sach1 = new Sach("B001", "Lap trinh java", "Huynh Ngoc Anh", 2022, 10);
        System.out.println("Thong tin sach 1:");
        sach1.hienThiThongTin(); // Hiển thị thông tin sách 1
        // Tạo sách bằng constructor rỗng rồi set dữ liệu
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cau truc du lieu va giai thuat");
        sach2.setTacGia("Bui Ta Lanh");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);
        System.out.println("Thong tin sach 2:");
        sach2.hienThiThongTin(); // Hiển thị thông tin sách 2 
    }
}
