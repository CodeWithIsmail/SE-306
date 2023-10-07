public class Main {
    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception();
        } catch (RuntimeException runtimeException) {
            System.err.println("Exception handled in method throwException.");
        } finally {
            System.out.println("Finally executed in throwException.");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            throwException();
        } catch (Exception exception) {
            System.err.println("Exception handled in main.");
        }
    }
}