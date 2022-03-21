import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean[] myArr = new boolean[42];
        for (int i = 0; i < 10; i++){
            int a = sc.nextInt();
            myArr[a%42] = true;
        }
        int total = 0;

        for (boolean bool : myArr){
            if (bool)
                total++;
        }

        System.out.println(total);
        sc.close();
    }
}
