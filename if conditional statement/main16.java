import java.util.Scanner;
public class main16{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0&&n%5==0&&8!=0){
            System.out.printf("its statisfied");
        }
        else{
            System.out.printf("its not statisfied");
        }
    }
}