package practice;

class Animalia {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dogesh extends Animalia {
    @Override
    void sound() {
        super.sound();      // Calls Animal's sound()
        System.out.println("Bark"); // Adds new behavior
    }
}

public class Test1 {
    public static void main(String[] args) {
        Dogesh d = new Dogesh();
        d.sound();
    }
}
