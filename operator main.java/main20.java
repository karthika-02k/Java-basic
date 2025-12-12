import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = (n >= 40) ? "PASS" : "FAIL";
        System.out.println(result);
    }
}
