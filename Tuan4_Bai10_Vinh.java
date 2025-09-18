package th_tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuan4_Bai10_Vinh 
{
    private final ArrayList<Integer> list;
    public Tuan4_Bai10_Vinh() 
    {
        list = new ArrayList<>();
    }

    public void them(int value, int index) 
    {
        if (index < 0 || index > list.size()) 
        {
            System.out.println("Vi tri khong hop !");
        } 
        else 
        {
            list.add(index, value);
            System.out.println(value + "Da them " + " tai vi tri " + index);
        }
    }
    
    public void xoa(int index) 
    {
        if (index < 0 || index >= list.size()) 
        {
            System.out.println("Vi tri khong hop le!");
        } 
        else 
        {
            int removed = list.remove(index);
            System.out.println("Da xoa " + removed + " tai vi tri " + index);
        }
    }
    public void hienThi() {
        System.out.println("Danh sach hien tai: " + list);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Tuan4_Bai10_Vinh ds = new Tuan4_Bai10_Vinh();

        while (true) 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them phan tu");
            System.out.println("2.Xoa phan tu");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1 -> {
                    System.out.print("Nhap gia tri: ");
                    int value = sc.nextInt();
                    System.out.print("Nhap vi tri: ");
                    int indexAdd = sc.nextInt();
                    ds.them(value, indexAdd);
                }
                case 2 -> {
                    System.out.print("Nhap vi tri muon xoa: ");
                    int indexRemove = sc.nextInt();
                    ds.xoa(indexRemove);
                }
                case 3 -> ds.hienThi();
                case 4 -> 
                {
                    System.out.println("Ket thuc chuong trinh.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
