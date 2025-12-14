import java.util.Scanner;
public class mainsc56{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        if(speed>100){
            System.out.println("speed extend");
        }
        else{
             System.out.println("limit");
        }
    }
}
