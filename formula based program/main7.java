import java.util.Scanner;
public class main7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double fahrenheit=sc.nextDouble();
        double celsius=(fahrenheit*9/5)+32;
        System.out.println(celsius);
    }
}