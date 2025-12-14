import java.util.Scanner;
public class mainsc28{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tm=sc.nextInt();
        int price=sc.nextInt();
        int free=tm/4;
        int toPay=(tm-free)*price;
        System.out.println(toPay);
    }
}
