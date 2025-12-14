import java.util.Scanner;
public class main9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if((a&1)==0){
            System.out.printf("even");
        }
        else{
            System.out.printf("odd");
        }
    }
}
