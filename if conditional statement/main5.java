import java.util.Scanner;
public class main5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num>=100&&num<=999)||(num<=-100&&num<=-999)){
            System.out.println(num+"3 is a digit");
        }
        else{
            System.out.println(num+"3 is not a digit");
        }
    }
}
        