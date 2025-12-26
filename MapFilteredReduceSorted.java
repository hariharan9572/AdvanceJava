import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilteredReduceSorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Predicate<Integer> p = n -> n%2==0;

        // Function<Integer, Integer> fun = n -> n*2;

        // int result = nums.stream()
        //                 .filter(n -> n%2==0)
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> (c+e));

        Stream<Integer> sortedValues = nums.stream()
                                            .filter(n -> n%2==0)
                                            .sorted();

        // System.out.println(result);
        // System.out.println(sortedValues);

        sortedValues.forEach(n -> System.out.println(n));

    }
}
