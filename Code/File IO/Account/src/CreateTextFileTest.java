public class CreateTextFileTest {
    public static void main(String[] args) {
        CreateTextFile createTextFile=new CreateTextFile();
        createTextFile.openFile();
        createTextFile.addRecord();
        createTextFile.closeFile();

    }
}