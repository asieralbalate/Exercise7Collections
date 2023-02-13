import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void shuffle(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }

    public static void main(String[] args) {
        String[] s = {"hello", "holi", "7", "5"};
        shuffle(s);
        for (String st : s) {
            System.out.println(st);
        }
    }
}
