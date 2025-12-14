import java.util.Scanner;
public class main18{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<=9){
            System.out.printf("single digit");
        }
        else if(b<=99){
            System.out.printf("double digit");
        }
        else if(c<=999){
            System.out.printf("three digit");
        }
        else{
            System.out.printf("no digit");
        }
    }
}