import javax.xml.parsers.SAXParser;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }

    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s\n\n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.println("\nStack trace from getStackTrace:");
            System.out.println("Class\t\tFile\t\tLine\tMethod");
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t\t\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }
}