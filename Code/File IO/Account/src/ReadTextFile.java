import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private Scanner input;

    public void openFile() {
        try {
            input = new Scanner(new File("clients.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error opening file.");
            System.exit(1);
        }
    }

    public void readRecord() {
        AccountRecord record = new AccountRecord();
        System.out.printf("%-10s%-12s%-12s%10s\n", "Accpont", "First Name", "Last Name", "Balance");

        try {
            while (input.hasNext()) {
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());

                System.out.printf("%-10d%-12s%-12s%10.2f\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());

            }
        } catch (NoSuchElementException elementException) {
            System.err.println("file improperly formed.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException illegalStateException) {
            System.err.println("Error freading form file.");
            System.exit(1);

        }
    }

    public void closeFile() {
        if (input != null) input.close();
    }
}

