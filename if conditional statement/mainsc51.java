import java.util.Scanner;
public class mainsc51{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         char color=sc.next().charAt(0);
         if(color=='R'||color=='r') {
            System.out.println("Stop");
        }
        else if(color=='Y'||color=='y') {
            System.out.println("Ready");
        }
        else if (color=='G'||color=='g') {
            System.out.println("Go");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
       