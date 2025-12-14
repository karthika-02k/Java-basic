import java.util.Scanner;
public class mainsc16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int discount=sc.nextInt();
        int discountamount=(price*discount)/100;
        int finalprice=price-discountamount;
        System.out.println(finalprice);


    }
}