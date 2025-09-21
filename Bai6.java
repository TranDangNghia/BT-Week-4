import java.util.Scanner;
public class Bai6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen duong b: ");
        int b = sc.nextInt();
        int c = a;
        int d = b;
        int BCNN;
        while(a != b)
            if(a>b)
                a = a - b;
            else
                b = b - a;
        BCNN = c*d/(a);
        System.out.println("Uoc chung lon nhat la: "+ a);
        System.out.println("Boi chung nho nhat la: "+ BCNN);
        sc.close();
    }
}