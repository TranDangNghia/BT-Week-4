import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so nguyen thu nhat:");
        int a = sc.nextInt();
        System.out.printf("nhap so nguyen thu hai:");
        int b = sc.nextInt();
        System.out.println("lua chon phep tinh:");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        int chon = sc.nextInt();

        if (chon == 1) {
            System.out.printf("Ket qua: %d", (a + b));
        }
        else if (chon== 2) {
            System.out.printf("Ket qua: %d", (a - b));
        }
        else if (chon == 3) {
            System.out.printf("Ket qua: %d", (a * b));
        }
        else if (chon == 4) {
            if (b != 0) {
                System.out.printf("Ket qua la: %.2f", ((double) a / b));
            } else {
                System.out.print("Khong the chia cho 0");
            }
        }
        else {
            System.out.print("Lua chon khong hop le");
        }
        sc.close();
    }
}