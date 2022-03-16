import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        String a = sc.next();
        sc.close();

        int total = 0;

        for (int i = 0; i < cnt; i++){
            total += a.charAt(i) -'0';
        }

        System.out.println(total);
    }
}
