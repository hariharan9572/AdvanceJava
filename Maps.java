
import java.util.Hashtable;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();

        students.put("Hari", 56);
        students.put("Divya", 23);
        students.put("Viji", 67);
        students.put("Latha", 92);
        students.put("Divya", 45);

        // System.out.println(students);
        // System.out.println(students.get("Hari"));
        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

    }
}
