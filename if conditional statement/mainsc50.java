import java.util.Scanner;
public class mainsc50{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int withdrawamount=sc.nextInt();
        int balance=sc.nextInt();
        if(withdrawamount<=balance&&withdrawamount%100==0){
            System.out.println("withdraw successfully");
        }
        else{
            System.out.println("withdraw unsuccessfully");
        }
        }
    }