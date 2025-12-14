import java.util.Scanner;
public class mainsc23{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int tray=sc.nextInt();
        int cakes=sc.nextInt();
        int totalcakes=tray*cakes;
        System.out.println(totalcakes);
    }
}