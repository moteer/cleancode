package codesmell.bloaters.largeclass;

public class CarBetter {
    private String make;
    private String model;
    private int year;
    private String color;
    private Engine engine;
    private Transmission transmission;
    private Brakes brakes;
    private Suspension suspension;

    public CarBetter(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.brakes = new Brakes();
        this.suspension = new Suspension();
    }


    public void start() {
        this.engine.start();
    }

    public void paint(String newColor) {
        color = newColor;
        System.out.println("The car has been painted {newColor}.");
    }

    // ...other methods related to the car's appearance or overall state

    public void PerformMaintenance() {
        engine.tuneUp();
        transmission.changeFluid();
        brakes.replacePads();
        suspension.replaceShocks();
    }

    private class Engine {
        public void tuneUp() {
        }

        public void start() {
        }
    }

    private class Transmission {
        public void changeFluid() {

        }
    }

    private class Brakes {
        public void replacePads() {

        }
    }

    private class Suspension {
        public void replaceShocks() {
        }
    }

    // ...other methods related to car maintenance or repairs

}
