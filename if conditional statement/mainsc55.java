import java.util.Scanner;
public class mainsc55{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int ticketprice=sc.nextInt();
        if(ticketprice<12){
            System.out.println("child");
        }
        else if(ticketprice<=60){
            System.out.println("adult");
        }
        else{
            System.out.println("senior");
        }
    }
}