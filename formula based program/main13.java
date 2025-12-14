import java.util.Scanner;

public class main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double surfaceArea = 2*(l*b+b*h+h*l);
        double volume = l*b *h;
        System.out.println( surfaceArea);
        System.out.println( volume);
    }
}
