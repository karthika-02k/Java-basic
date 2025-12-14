import java.util.Scanner;
public class mainsc54{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int battery=sc.nextInt();
        if(battery>=80){
            System.out.println("full");
        }
        else if(battery<=30){
            System.out.println("moderate");
        }
        else{
            System.out.println("low");
        }
    }
}