import java.util.Scanner;
public class main20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
         int ascii=(int) ch;
         if (ascii%2==0) {
            System.out.printf("even");
        }
        else{
            System.out.printf("odd");
        }
    }
}
