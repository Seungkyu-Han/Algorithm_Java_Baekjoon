import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        do{
            a = sc.nextInt(); b = sc.nextInt();

            if (a + b > 0)
                System.out.println(a+b);

        }while(!((a == 0) && (b==0)));



        sc.close();
    }
}
