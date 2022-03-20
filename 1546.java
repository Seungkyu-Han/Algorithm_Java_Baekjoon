import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int total = 0, max = 0;
        for (int i = 0; i < num; i++){
            int a = sc.nextInt();
            total += a;
            if (a > max)
                max = a;
        }

        System.out.printf("%f", (((float)total/num)/max) * 100);

        sc.close();
    }
}
