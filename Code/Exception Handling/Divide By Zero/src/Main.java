import java.util.Scanner;

public class Main {
    public static int quotient(int num, int den) {
        return num / den;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numerator");
        int num = in.nextInt();
        System.out.println("Enter denominator");
        int den = in.nextInt();
        int div = quotient(num, den);
        System.out.println(num + " / " + den + " = " + div);
//        System.out.println("Hello world!");
    }
}