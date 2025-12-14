import java.util.Scanner;
public class mainsc45{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int percentage=sc.nextInt();
        if(percentage<20){
            System.out.println("low battery");
        }
         else if(percentage>=20&&percentage<80) {

            System.out.println("50%consumed");
        }
        else{
            System.out.println("battery full");
        }
    }
}