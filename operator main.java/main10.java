import java.util.Scanner;
public class main10 {
    public static void main(String[]args){
        int a;
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         int b=a/100;
         int c=a%10;
         System.out.println(b+c);
    }
}
