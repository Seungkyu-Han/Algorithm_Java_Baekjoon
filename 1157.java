import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i)-97]++;
        }

        int max = 0, ouch = 0, toIndex = 0;
        for (int ints : arr){
            if (ints > max)
                max = ints;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                ouch++;
                toIndex = i;
            }
        }

        if(ouch >= 2)
            System.out.println("?");
        else
            System.out.println((char)(toIndex + 65));


        sc.close();
    }
}
