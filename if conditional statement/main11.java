import java.util.Scanner;
public class main11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int firstdigit;
        firstdigit=sc.nextInt();
        firstdigit=firstdigit/100;
        if(firstdigit%2==0){
            System.out.printf("even");
        }
        else{
            System.out.printf("odd");
        }
    }
}
