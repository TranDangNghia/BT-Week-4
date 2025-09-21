 import java.util.Scanner;

public class code7 {
    public static void main (String args[]) {
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int [] m = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            m[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu trong mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            tong = tong + m[i];
        }
        System.out.printf("tong cac phan tu trong mang la: %d", tong);
        sc.close();

    }
}