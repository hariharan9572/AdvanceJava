import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        System.out.println("Original List: " + products);
        
        List<String> filteredProducts = products.stream()
                                                .filter(name -> name.length() > 5)
                                                .map(String::toUpperCase)
                                                .sorted()
                                                .collect(Collectors.toList());

        System.out.println("Filtered Products: " + filteredProducts);
    }
}
