import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt(), minute = sc.nextInt();

        if (minute - 45 < 0){
            minute += 15;
            if (hour == 0)
                hour = 23;
            else
                hour -= 1;
        }
        else
            minute -= 45;

        System.out.println(hour + " " + minute);

        sc.close();
    }
}
