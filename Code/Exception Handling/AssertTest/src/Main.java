import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter intger between 0 to 10");
        int n = in.nextInt();

        assert (n >= 0 && n <= 10) : "bad number: " + n;
        System.out.println("You entered: " + n);
    }
}