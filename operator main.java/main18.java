import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = (n >= 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
