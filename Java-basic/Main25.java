import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        int h, m, s;
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt(); 

        System.out.printf("%02d/%02d/%02d", h, m, s);
    }
}
