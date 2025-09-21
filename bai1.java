import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số: ");
        double so = scanner.nextDouble();

        if (so > 0) {
            System.out.println(so + " là số dương.");
        } else if (so < 0) {
            System.out.println(so + " là số âm.");
        } else {
            System.out.println("Số nhập vào bằng 0.");
        }

        scanner.close();
    }
}
