public class Animal {
    public void makeSound() {
        System.out.println(" This is animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println(" The Dog Says Bow Bow!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println(" The Cat Says Meow!");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println(" The Cow Says Ambaa Ambaa!");
    }
}
 class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        Animal cow = new Cow();
        a.makeSound();
        d.makeSound();
        c.makeSound();
        cow.makeSound();
    }
}