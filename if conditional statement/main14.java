import java.util.Scanner;
public class main14{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%5==0){
            System.out.printf("its divisible by both 3 and 5");
        }
        else{
            System.out.printf("its not divisible by both 3 and 5");
        }
    }
}