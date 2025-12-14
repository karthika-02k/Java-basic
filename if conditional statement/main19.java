import java.util.Scanner;
public class main19{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        int product=a*b;
        if(product>a){
            System.out.printf("a is positive");
        }
        else if(product>b){
            System.out.printf("b is negative");
        }
    }
}