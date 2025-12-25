public class Exercise2 {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
        int result = 0;

        try{
            result = numerator / denominator;
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program completed");
    }
}
