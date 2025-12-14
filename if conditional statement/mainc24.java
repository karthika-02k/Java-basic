import java.util.Scanner;
public class mainc24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='0'&&ch<='9'){
            System.out.printf("digit");
        }
        else{
            System.out.printf("not digit");
        }
    }
}