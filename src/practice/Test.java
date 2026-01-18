package practice;

class Animal {
    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");  // Calls parent constructor
        System.out.println("Dog created");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
