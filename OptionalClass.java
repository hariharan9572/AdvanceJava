
import java.util.Arrays;
import java.util.List;

public class OptionalClass {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Hari", "Laxmi", "Jhon", "Kishor");

        // Optional<String> name = names.stream()
        //                     .filter(str -> str.contains("x"))
        //                     .findFirst();

        String name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not found");

        // System.out.println(name.get());
        System.out.println(name);
    }
}
