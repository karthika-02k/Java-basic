import java.util.Scanner;
public class main12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int lastdigit;
        lastdigit=sc.nextInt();
        lastdigit=lastdigit%10;
        if(lastdigit %2==0){
            System.out.printf("even");
        }
        else{
            System.out.printf("odd");
        }
    }
}
