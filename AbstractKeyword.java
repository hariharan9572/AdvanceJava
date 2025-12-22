abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("music playing...");
    }

}

abstract class WagnoR extends Car{ // abstract class

    // public void fly(){
    //     System.out.println("Flying...");
    // }
    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdatedWagnoR extends WagnoR{ // concerete class 
    public void fly(){
        System.out.println("Flying...");
    }
}

public class AbstractKeyword{
    public static void main(String[] args) {
        Car obj = new UpdatedWagnoR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}