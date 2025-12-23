// class - class -> extends
// class - interface -> implements
// interface - interface -> extends 

interface  A // interface is not a class and always public abstract
{   // every variable in interface final and static
    int age = 23;
    String area = "Chennai";

    void show();
    void config();
} // interface show you the design we need to implement

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("running...");
    }
}

public class MoreOnInterface {
    public static void main(String[] args) {
         A obj;
        obj = new B();
        obj.show();
        obj.config();
       
        X obj1 = new B();
        obj1.run();

        System.out.println(A.area);
    }
}
