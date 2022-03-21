import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            int rep = sc.nextInt();
            String str1 = sc.next();
            char[] arr = str1.toCharArray();
            for(char ch : arr){
                for (int j = 0; j < rep; j++){
                    System.out.print(ch);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
