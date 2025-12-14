 import java.util.Scanner;
public class main4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a%2==0&&b%2==0){
            System.out.printf("even");
        }
        else{
            System.out.printf("odd");
        }
    }
}
