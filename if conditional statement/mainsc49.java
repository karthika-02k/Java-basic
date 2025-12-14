 import java.util.Scanner;
public class mainsc49{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        int storedpin=sc.nextInt();
        if(enterpin==storedpin){
            System.out.println("pin matched");
      }
        else{
            System.out.println("unmatched");
        }
    }
}