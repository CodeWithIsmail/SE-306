public class Main {
    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception();
        } catch (Exception exception) {
            System.err.println("Exception handled in method throwException.");
            throw exception;
        } finally {
            System.out.println("Finally executed in throwException.");
        }
    }

    public static void doesNotThrowException() throws Exception {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {
            System.err.println(exception);
        } finally {
            System.out.println("Finally executed in doesNotThrowException.");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            throwException();
        } catch (Exception exception) {
            System.err.println("Exception handled in main.");
        }
        doesNotThrowException();
    }
}