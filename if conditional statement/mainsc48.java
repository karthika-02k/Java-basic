import java.util.Scanner;
public class mainsc48{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        int bill=0;
        if(unit<=100){
            bill=bill+(Math.min(unit,300)-100)*5;
         }
        if(unit>300){
            bill=bill+(bill*10/100);
        }
        if(unit>500){
            bill=bill+(bill*10/100);
        }
        else{
            System.out.println("bill");
        }
        }
    }