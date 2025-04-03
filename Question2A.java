// Abstract class
abstract class Appliance {
    // Abstract method
    public abstract void turnOn();
}

// Subclass Fan
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning now!");
    }
}

// Subclass TV
class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is showing programs now!");
    }
}

// Demonstration
public class Main {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        Appliance myTV = new TV();
        
        myFan.turnOn();
        myTV.turnOn();
    }
}
