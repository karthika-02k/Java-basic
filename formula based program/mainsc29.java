import java.util.Scanner;
public class mainsc29{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tp=sc.nextInt();
        int price=sc.nextInt();
        int free=(tp/5)*2;
        int toPay=(tp-free)*price;
        System.out.println(toPay);
    }
}
