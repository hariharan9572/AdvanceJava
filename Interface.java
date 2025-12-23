interface  A // interface is not a class and always public abstract
{   // every variable in interface final and static
    int age = 23;
    String area = "Chennai";

    void show();
    void config();
} // interface show you the design we need to implement

class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        // A.area = "Banglore";

        System.out.println(A.area);
    }
}
