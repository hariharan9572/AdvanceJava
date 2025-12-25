public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        } catch(Exception e){  // e is object like obj or e
            System.out.println("Something went wrong.");
        }
        

        System.out.println(j);
        System.out.println("Bye");
    }
}
