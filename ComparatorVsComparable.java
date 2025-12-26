import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stundent implements Comparable<Stundent>{
    int age;
    String name;

    public Stundent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Stundent [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Stundent that) {
       if(this.age > that.age)
            return 1;
        else
            return -1;
    }
    
}

public class ComparatorVsComparable {
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j){
        //         if(i%10 > j%10)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };
        
        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        // Comparator<Stundent> com = (Stundent i, Stundent j) -> {
        //         // if(i.age > j.age)
        //         //     return 1;
        //         // else
        //         //     return -1;

        //         return i.age > j.age ? 1: -1;
        //     };

        Comparator<Stundent> com = (i, j) ->  i.age > j.age ? 1: -1;

        List<Stundent> studs = new ArrayList<>();
        studs.add(new Stundent(23, "Hari"));
        studs.add(new Stundent(21, "John"));
        studs.add(new Stundent(18, "Parul"));
        studs.add(new Stundent(20, "Kiran"));

        // Collections.sort(nums, com);
        // System.out.println(nums);

        // Collections.sort(studs);
        Collections.sort(studs, com);

        for (Stundent s : studs)
            System.out.println(s);
    }
}
