import java.util.Scanner;
public class maing26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){
            System.out.printf("equilateral");
        }
        else if(a==b||b==c||a==c){
            System.out.printf("isosceles");
        }
        else{
            System.out.printf("scalene");
        }
        }
    }

