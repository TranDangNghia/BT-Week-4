import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập một số nguyên: ");
        int n = scanner.nextInt();

        if (laSoNguyenTo(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        scanner.close();
    }

    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
