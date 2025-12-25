// Functional Interface or SAM - Single Abstract Method Interface

@FunctionalInterface
interface A{
    void show(int i);
}


public class LambdaExpression {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in Show " + i); // single statement no {} need
        obj.show(5);
    }
}
