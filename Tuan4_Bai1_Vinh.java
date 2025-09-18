package th_tuan4;
import java.util.Scanner;

public class Tuan4_Bai1_Vinh 
{
    private final int number;
    public Tuan4_Bai1_Vinh(int number) 
    {
        this.number = number;
    }
    public String check() 
    {
        if (number > 0) 
        {
            return "So " + number + " la so duong.";
        } 
        else
            if (number < 0) 
            {
            return "So " + number + " la so am.";
            } 
            else 
            {
            return "So " + number + " bang 0.";
        }
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Nhap mot so nguyen: ");
            int num = sc.nextInt();
            
            Tuan4_Bai1_Vinh obj = new Tuan4_Bai1_Vinh(num);
            System.out.println(obj.check());
        }
    }
}
