import java.util.Scanner;
public class mainsc42{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int bill=sc.nextInt();
        int finalAmount;
         if (bill>=5000) {
            finalAmount=bill-(bill*20/100);
        } else if (bill>=3000) {
            finalAmount=bill-(bill*15/100);
        } else if (bill>=1000) {
            finalAmount=bill-(bill*10/100);
        } else {
            finalAmount=bill;   
        }
        System.out.println(finalAmount);



    }
}