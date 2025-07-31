package week1.assignment;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches stick");
    }
}

public class Casting {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); 

        Dog d = (Dog) a;
        d.fetch(); 

        Animal animal = new Animal();
    }
}
