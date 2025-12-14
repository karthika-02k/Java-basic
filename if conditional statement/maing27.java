import java.util.Scanner;
public class maing27 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((c*c)==(a*a+b*b)){
            System.out.println("right triangle");
        }
        else{
            System.out.println("not a right traingle");
        }
    }
}