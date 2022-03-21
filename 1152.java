import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine().trim();
        if (str1.isEmpty())
            System.out.println(0);
        else
            System.out.println(str1.split(" ").length);

        sc.close();
    }
}
