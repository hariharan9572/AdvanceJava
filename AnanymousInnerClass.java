class A{
    public void show(){
        System.out.println("in A show");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

public class AnanymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };  // Ananymous inner class
        obj.show();
        
    }
}
