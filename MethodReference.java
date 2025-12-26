
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Hari", "Navin", "Jhon");

        List<String> uNames = names.stream()
                                    // .map(name -> name.toUpperCase())
                                    .map(String::toUpperCase) // :: -> method reference
                                    .toList();


        // System.out.println(uNames);

        uNames.forEach(System.out::println);

    }
}
