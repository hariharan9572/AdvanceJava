import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Exercise5 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        System.out.println("Original List: "+ name);

        Set<String> names = new LinkedHashSet<>(name);
        System.out.println("Unique Names: " + names);

    }
}
