import java.util.Scanner;
public class mainsc27{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sellingprice=sc.nextInt();
        int loss=sc.nextInt();
        int costprice=sellingprice+loss;
        System.out.println(costprice);
    }
}
