 import java.util.Scanner;
public class mainsc52{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int fa;
        if(amount>=5000){
            fa=amount-amount*20/100;
         }
         else if(amount>=3000){
            fa=amount-amount*15/100;
         }
         else if(amount>=1000){
            fa=amount-amount*10/100;
         }
         else{
            fa=amount;
         }
         System.out.println(fa);
        }
    }