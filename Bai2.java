import java.util.Scanner;
public class Bai2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        if (a>b)
            if (b>c)
                System.out.print("So nho nhat la c");
            else
                System.out.print("SO nho nhat la b");
        else
           if (a>c)
            System.out.print("So nho nhat la c");
           else
            System.out.print("So nho nhat la a");
        sc.close();
    }
}