import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Nhập số lượng phần tử
        System.out.print("Nhap so luong phan tu (toi da 20): ");
        int n = sc.nextInt();
        
        // Kiểm tra n không vượt quá 20
        if (n > 20) {
            System.out.println("So luong phan tu khong duoc vuot qua 20!");
            return;
        }
        
        // Tạo n số ngẫu nhiên không trùng lặp
        while (numbers.size() < n) {
            int randomNum = rand.nextInt(20) + 1; // Sinh số từ 1-20
            if (!numbers.contains(randomNum)) {
                numbers.add(randomNum);
            }
        }
        
        // In danh sách
        System.out.println("Danh sach " + n + " so ngau nhien khong trung lap tu 1-20:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}

