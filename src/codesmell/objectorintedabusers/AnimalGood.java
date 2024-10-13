package codesmell.objectorintedabusers;

abstract class AnimalGood {
    abstract String makeSound();
}

class Cat extends AnimalGood {
    @Override
    String makeSound() {
        return "meow";
    }
}

class Dog extends AnimalGood {
    @Override
    String makeSound() {
        return "woof";
    }
}
