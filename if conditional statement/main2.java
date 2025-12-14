import java.util.Scanner;
public class main2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>0&&b<0)
            System.out.println(a);
        else
            System.out.println(b);
    }
    
}
