import java.util.Scanner;
public class mainc25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        if(ch1==ch2){
            System.out.printf("equal");
        }
        else{
            System.out.printf("not equal");
        }
    }
}
