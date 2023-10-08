public class ReadTextFileTest {
    public static void main(String[] args) {
        ReadTextFile app=new ReadTextFile();
        app.openFile();
        app.readRecord();
        app.closeFile();
    }
}
