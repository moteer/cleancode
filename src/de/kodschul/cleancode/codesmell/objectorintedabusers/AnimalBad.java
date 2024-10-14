package de.kodschul.cleancode.codesmell.objectorintedabusers;

class AnimalBad {

        String makeSound(String type) {
            switch (type) {
                case "cat":
                    return "meow";
                case "dog":
                    return "woof";
                default:
                    throw new IllegalStateException();
            }
        }
}
