import java.util.Scanner;
public class mainc23 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
         if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            System.out.printf("alphabet");
         }
         else{
            System.out.printf("not alphabet");
         }
        }
    }