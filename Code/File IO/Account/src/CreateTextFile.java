import com.sun.source.tree.WhileLoopTree;

import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.*;

public class CreateTextFile {
    private Formatter output;

    public void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("You have not write access.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error in creating file");
            System.exit(1);
        }
    }

    public void addRecord() {
        AccountRecord record = new AccountRecord();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter account number, first name, last name, balance:");
        System.out.println("To terminate , ctrl d press enter");

        while (scn.hasNext()) {
            try {
                record.setAccount(scn.nextInt());
                record.setFirstName(scn.next());
                record.setLastName(scn.next());
                record.setBalance(scn.nextDouble());

                if (record.getAccount() > 0) {
                    output.format("%d %s %s %.2f\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
                } else {
                    System.out.println("Account number must be greater than 0");
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error in writing in file.");
                return;
            } catch (NoSuchElementException noSuchElementException) {
                System.err.println("Invalid input. Try again");
                scn.nextLine();
            }
            System.out.println("Enter account number, first name, last name, balance:");
        }
    }

    public void closeFile() {
        if (output != null) output.close();
    }
}
