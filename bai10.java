import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Nhập danh sách ban đầu
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        // Thêm phần tử tại vị trí chỉ định
        System.out.print("Nhap gia tri can them: ");
        int valueAdd = sc.nextInt();
        System.out.print("Nhap vi tri can them (bat dau tu 0): ");
        int posAdd = sc.nextInt();
        if (posAdd >= 0 && posAdd <= list.size()) {
            list.add(posAdd, valueAdd);
            System.out.println("Danh sach sau khi them: " + list);
        } else {
            System.out.println("Vi tri them khong hop le.");
        }

        // Xóa phần tử tại vị trí chỉ định
        System.out.print("Nhap vi tri can xoa (bat dau tu 0): ");
        int posRemove = sc.nextInt();
        if (posRemove >= 0 && posRemove < list.size()) {
            list.remove(posRemove);
            System.out.println("Danh sach sau khi xoa: " + list);
        } else {
            System.out.println("Vi tri xoa khong hop le.");
        }

        sc.close();
    }
}