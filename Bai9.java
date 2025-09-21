import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    public static void main (String[] args)  {
        Scanner Scanner = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Scanner.nextInt();
        for (int  i=0; i<n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            int x = Scanner.nextInt();
            list.add(x);
        }
        System.out.println("\nDanh các số nguyên: ");
        for  (int x : list) {
            System.out.print(x + " ");
        }
        Scanner.close();
    }
}
