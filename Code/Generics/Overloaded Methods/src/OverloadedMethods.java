public class OverloadedMethods {
/*    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }

    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }

    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }*/

    public static void printArray(Object[] inputArray)
    {
        for(Object element:inputArray)
            System.out.printf("%s ",element);
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.2, 2.3, 3.4, 4.5, 5.6};
        Character[] characters = {'a', 's', 'd', 'f', 'j'};

        System.out.println("Print Integer array element:");
        printArray(integers);
        System.out.println("Print Double array elements:");
        printArray(doubles);
        System.out.println("Print Character array elements:");
        printArray(characters);
    }
}