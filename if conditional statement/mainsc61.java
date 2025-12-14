import java.util.Scanner;
public class mainsc61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();

        if (speed>100)
            System.out.println("Over-speed");
        else
            System.out.println("Speed limit");
    }
}
