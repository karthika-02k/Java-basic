import java.util.Scanner;
public class mainy33 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%100==0){
            System.out.println("century year");
        }
        else{
            System.out.println("not century year");
        }
    }
}