import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public void printElements() {
        List<String> list = Arrays.asList(suits);

        System.out.printf("UnSorted array \n%s\n", list);

        Collections.sort(list);

        System.out.printf("Sorted array \n%s\n", list);
    }

    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        sort1.printElements();
    }
}
