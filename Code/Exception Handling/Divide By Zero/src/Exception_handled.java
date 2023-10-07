import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handled {
    public static int quotient(int num, int den) throws ArithmeticException {
        return num / den;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = false;

        while (!loop) {
            try {
                System.out.println("Enter numerator");
                int num = in.nextInt();
                System.out.println("Enter denominator");
                int den = in.nextInt();
                int div = quotient(num, den);
                System.out.println(num + " / " + den + " = " + div);
                loop = true;
            } catch (ArithmeticException arithmeticException) {
                System.err.println("Exception: " + arithmeticException);
                System.out.println("You can't divide by zero");
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Exception: " + inputMismatchException);
                System.out.println("You must enter integers!");
                in.nextLine();
            }
        }
    }
}
