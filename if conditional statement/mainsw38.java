import java.util.Scanner;
public class mainsw38{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int grade=sc.nextInt();
        switch(grade){
            case 10,9:
                System.out.println("grade A");
                break;
        case 8:
        System.out.println("grade B");
        break;
        case 7:
            System.out.println("grade C");
            break;
        default:
            System.out.println("fail");    
        }
    }
}