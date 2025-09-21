import java.util.Scanner;
public class Bai8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai mang");
        int l = sc.nextInt();
        int a[] = new int[l];
        int i,j;
        for(i=0;i<l;i++)
        {
            System.out.print("Nhap a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        int dem, max = 0, so = a[0];
        for(i=0;i<l;i++)
        {
            dem = 0;
            for(j=0;j<l;j++)
            {
                if(a[i]==a[j])
                    dem++;
            }
            if(dem>max)
            {
                max = dem;
                so = a[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la "+so+"\nSo lan xuat hien la "+max);
        sc.close();
    }
}