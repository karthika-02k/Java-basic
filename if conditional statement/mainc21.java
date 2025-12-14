import java.util.Scanner;
public class mainc21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.printf("vowels");
        }
        else if(ch >='a'||ch <='z'){
            System.out.printf("consonant");
        }
        else{
            System.out.printf("no alpahabet");
        }
        }
    }