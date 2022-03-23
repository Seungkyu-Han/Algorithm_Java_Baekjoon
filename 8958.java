import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i ++){
            String str1 = sc.next();
            int total = 0, plus = 1;
            for (int j = 0; j < str1.length(); j++){
                if (str1.charAt(j) == 'O'){
                    total += plus;
                    plus++;
                }
                else
                    plus = 1;
            }
            System.out.println(total);
        }
    }
}
