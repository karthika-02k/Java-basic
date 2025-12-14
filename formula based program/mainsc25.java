import java.util.Scanner;
public class mainsc25{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        int hour=sc.nextInt();
        int day=sc.nextInt();
        int totalsalary=basic*hour*day;
        System.out.println(totalsalary);
    }
}
