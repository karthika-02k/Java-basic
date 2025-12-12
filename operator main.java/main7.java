import java.util.Scanner;
public class main7{
    public static void main(String[]args){
        int a,b;
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println(a);
    }
}