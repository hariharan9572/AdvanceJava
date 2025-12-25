// Functional Interface or SAM - Single Abstract Method Interface

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("in Show");
//     }
// }

public class FunctionalInterfaceNew {
    public static void main(String[] args) {
        A obj = new A(){ // Ananymous inner class
            public void show(){
                System.out.println("in Show");
            }
        };
    }
}
