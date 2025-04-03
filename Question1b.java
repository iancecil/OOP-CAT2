// Method overloading
class MathOperations {
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Multiply three integers (overloaded method)
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Method overriding and polymorphism
class Animal {
    public void makesSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makesSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makesSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

// Demonstration
public class Main {
    public static void main(String[] args) {
        // Method overloading demo
        MathOperations math = new MathOperations();
        System.out.println("2 * 3 = " + math.multiply(2, 3));
        System.out.println("2 * 3 * 4 = " + math.multiply(2, 3, 4));
        
        // Polymorphism demo
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myAnimal.makesSound();
        myDog.makesSound();
        myCat.makesSound();
    }
}
