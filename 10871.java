import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), upNum = sc.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++)
            numArr[i] = sc.nextInt();
        for (int i : numArr){
            if (i < upNum)
                System.out.printf("%d ", i);
        }

        sc.close();
    }
}
