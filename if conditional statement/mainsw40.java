import java.util.Scanner;
public class mainsw40{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 12,3,2:
                System.out.println("winter");
                break;
            case 1,5,8:
                System.out.println("summer");
                break;
            default:
                System.out.println("invalid month");        
        }
    }
}