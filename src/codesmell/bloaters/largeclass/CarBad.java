package codesmell.bloaters.largeclass;

public class CarBad {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;
    private boolean isParked;

    public CarBad(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
        this.isParked = true;
    }

    public void Start() {
        if (isParked) {
            isRunning = true;
            isParked = false;
            System.out.println("The car has started.");
        } else {
            System.out.println("You can't start the car while it's already running or not parked.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            isParked = true;
            System.out.println("The car has stopped.");
        } else {
            System.out.println("You can't stop the car while it's not running or already parked.");
        }
    }

    public void accelerate(int speed) {
        if (isRunning && !isParked) {
            System.out.println("The car is accelerating to {speed} mph.");
        } else {
            System.out.println("You can't accelerate while the car is not running or parked.");
        }
    }

    public void brake() {
        if (isRunning && !isParked) {
            System.out.println("The car is braking.");
        } else {
            System.out.println("You can't brake while the car is not running or parked.");
        }
    }

    public void paint(String newColor) {
        color = newColor;
        System.out.println("The car has been painted {newColor}.");
    }

    public void tuneUp() {
        System.out.println("The car has had a tune-up.");
    }

    public void repairEngine() {
        System.out.println("The engine has been repaired.");
    }

    public void replaceTires() {
        System.out.println("The tires have been replaced.");
    }

    // ...many more methods for various car-related tasks
}
