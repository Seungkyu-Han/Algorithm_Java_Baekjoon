import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max_num = 0, max_index = 0;

        for (int i = 1; i < 10; i++){
            int num = sc.nextInt();
            if (num > max_num){
                max_num = num;
                max_index = i;
            }
        }
        System.out.println(max_num + "\n" + max_index);

    }
}
