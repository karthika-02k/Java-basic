import java.util.Scanner;
public class mainsc22{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int totalcandies=sc.nextInt();
        int people=sc.nextInt();
        int person=totalcandies/people;
        int another=totalcandies%people;
        System.out.println(person);
        System.out.println(another);
    }
}