import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();
        String reStr1 = "", reStr2 = "";

        for (int i = str1.length() - 1; i >= 0; i--)
            reStr1 += str1.charAt(i);

        for (int i = str2.length() - 1; i >= 0; i--)
            reStr2 += str2.charAt(i);

        int a = Integer.parseInt(reStr1), b= Integer.parseInt(reStr2);

        System.out.println((a > b)? a : b);



        sc.close();
    }
}
