import java.util.Scanner;

public class FileDemonstrationTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        FileDemonstration app = new FileDemonstration();

        System.out.print("Enter file or directory name: ");
//        String path = "E:\\3rd Semester\\SE 306\\Code\\File IO\\src";
        app.analyzePath(input.nextLine());
    }
}
