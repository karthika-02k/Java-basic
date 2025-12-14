import java.util.Scanner;
public class maing28 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0&&y>0){
            System.out.println("quadrant 1");
        }
        else if(x<0&&y>0){
            System.out.println("quadrant 2");
        }
        else if(x<0&&y<0){
            System.out.println("quadrant 3");
        }
        else if(x>0&&y<0){
            System.out.println("quadrant 4");
        }
        else if(x==0&&y==0){
            System.out.println("origin");
        }
        else if(x==y){
            System.out.println("x axis");
        }
        else{
            System.out.println("y axis");
        }
    }
}