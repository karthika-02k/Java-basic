import java.util.Scanner;
public class main15{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%7==0){
            System.out.printf("its divisible by either 3 and 7");
        }
        else{
            System.out.printf("its not divisible by either 3 and 7");
        }
    }
}