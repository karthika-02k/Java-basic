import java.util.Scanner;
public class mainsw41{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=10000,choice,amount;
        choice=sc.nextInt();
        amount=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("balance");
                break;
            case 2:
                balance+=amount;
                System.out.println("balance"); 
                break;  
            case 3:
                System.out.println("withdrawal");
                break;
            default:
                System.out.println("invalid choice");             
        }
    }
}
