import javax.security.auth.login.AccountException;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private Scanner input;
    public void openFile()
    {
        try
        {
            input=new Scanner(new File("clients.txt"));
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("Error opening file.");
            System.exit(1);
        }
    }
    public void readRecord()
    {
        try
        {

        }
        catch ()
    }
}
