package HW5;

public class Animal {
    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail;
    int paw;

    public Pet(String name) {
        super();
        System.out.println("I am pet");
        this.name = name;
        eyes = 2;
        tail = 1;
        paw = 4;
    }
    public void run() {
        System.out.println("Pet runs");
    }
    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + name);
    }
    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
        System.out.println("I am cat and my name is: " + name);
    }
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Barbos");
        System.out.println("Number of paws: " + dog.paw);

        Cat cat = new Cat("Murlo");
        cat.sleep();
    }
}