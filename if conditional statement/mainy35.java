import java.util.Scanner;
public class mainy35 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int year1=sc.nextInt();
        int year2=sc.nextInt();
        if(year1%10==year2%10){
            System.out.println("same last digit");
        }
        else{
            System.out.println("different last digit");
        }
    }
}