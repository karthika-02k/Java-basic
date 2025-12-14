import java.util.Scanner;
public class main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
         double surfaceArea = 6 * a * a;
        double volume = a * a * a;
        double perimeter = 12 * a;
        System.out.println( surfaceArea);
        System.out.println( volume);
        System.out.println( perimeter);
    }
}
