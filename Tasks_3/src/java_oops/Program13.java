class LivingThing {
    String name;
    int age;

    LivingThing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Animal extends LivingThing {
    String species;

    Animal(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    void move() {
        System.out.println(name + " is moving");
    }
}

class Bird extends Animal {
    String featherColor;

    Bird(String name, int age, String species, String featherColor) {
        super(name, age, species);
        this.featherColor = featherColor;
    }

    void fly() {
        System.out.println(name + " is flying");
    }
}

class Reptile extends Animal {
    String scaleColor;

    Reptile(String name, int age, String species, String scaleColor) {
        super(name, age, species);
        this.scaleColor = scaleColor;
    }

    void crawl() {
        System.out.println(name + " is crawling");
    }
}

public class Program13 {
    public static void main(String[] args) {
        Bird bird = new Bird("Eagle", 2, "Bird", "Brown");
        System.out.println("It is Details of a bird");
        bird.eat();
        bird.sleep();
        bird.move();
        bird.fly();

        System.out.println(); 
         
        Reptile reptile = new Reptile("KingCobra", 5, "Reptile", "Black");
        System.out.println("It is Details of a reptile");
        reptile.eat();
        reptile.sleep();
        reptile.move();
        reptile.crawl();
    }
}
