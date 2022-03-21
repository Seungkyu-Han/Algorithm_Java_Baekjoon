import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int total = a * b * c;
        int[] arr = new int[10];
        while (total > 0){
            arr[total%10]++;
            total /= 10;
        }

        for (int ints : arr){
            System.out.println(ints);
        }
        sc.close();
    }
}
