import java.util.Scanner;
public class mainsc43{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("elgible for voters");
        }
        else{
            System.out.println("not eligible for voters");
        }
    }
}
