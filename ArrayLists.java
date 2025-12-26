import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
       
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        // nums.add("5");
        
         // System.out.println(nums);

         System.out.println(nums.get(2));

         System.out.println(nums.indexOf(5));

        // for (int n : nums){
        //     int num = (Integer)n;
        //     System.out.println(num*2);
        // }

    }
}
