class A{
    int age;

    public void show(){
        System.out.println("in show");
    }

    // class B{ // inner class - a class insider another class
    static  class B{ // static class - only for inner class
        public void config(){
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B(); // concrete inner class syntax
        A.B obj1 = new A.B(); // static class syntax
        obj1.config();
    }
}
