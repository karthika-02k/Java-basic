import java.util.Scanner;
public class mainsc60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();

        if (u<20)
            System.out.println("Low Data");
        else if (u<80)
            System.out.println("Half Consumed");
        else
            System.out.println("Data Over");
    }
}
