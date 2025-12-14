import java.util.Scanner;
public class main8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit=Math.abs(n%10);
        if(lastdigit % 3==0){
            System.out.printf("lastdigit is divisible by 3");
        }
        else{
            System.out.printf("lastdigit is not divisible by 3");

        }
        }
    }