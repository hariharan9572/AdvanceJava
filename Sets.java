import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
       
        // Collection<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();  // Set is a collection unique value and doesn't have indev values
        // Set<Integer> nums = new TreeSet<Integer>(); // Sort list
        Collection<Integer> nums = new TreeSet<Integer>(); // Sort list
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        // nums.add("5");
        
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        // for (int n : nums){
        //    System.out.println(n);
        // }

    }
}
