/**
 * Project: lab1_5Hatch
 * Purpose Details: Creates three motorcycle objects and prints their
 * properties using getter methods.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/26/2026
 * Revision: 2.0
 */

public class Main {

    // Creates three motorcycles and prints their details.
    public static void main(String[] args) {

        Motorcycle bike1 = new Motorcycle(
                "Honda", "CBR600RR", 2024,
                new Color("Red"),
                new Engine(599, 120, 4, "Inline-four"),
                new Frame("Sport",
                        new Material("Aluminum", "Lightweight")),
                new Wheel("Sport",
                        new Rims(17,
                                new Material("Aluminum", "Lightweight"),
                                new Color("Black"))),
                new Wheel("Sport",
                        new Rims(17,
                                new Material("Aluminum", "Lightweight"),
                                new Color("Black")))
        );

        Motorcycle bike2 = new Motorcycle(
                "Yamaha", "MT-07", 2023,
                new Color("Blue"),
                new Engine(689, 73, 2, "Parallel-twin"),
                new Frame("Naked",
                        new Material("Steel", "Durable")),
                new Wheel("Street",
                        new Rims(17,
                                new Material("Aluminum", "Lightweight"),
                                new Color("Silver"))),
                new Wheel("Street",
                        new Rims(17,
                                new Material("Aluminum", "Lightweight"),
                                new Color("Silver")))
        );

        Motorcycle bike3 = new Motorcycle(
                "Kawasaki", "Ninja 400", 2024,
                new Color("Green"),
                new Engine(399, 45, 2, "Parallel-twin"),
                new Frame("Sport",
                        new Material("Steel", "Durable")),
                new Wheel("Sport",
                        new Rims(17,
                                new Material("Aluminum", "Lightweight"),
                                new Color("Black"))),
                new Wheel("Sport",
                        new Rims(17,
                                new Material("Aluminum", "Lightweight"),
                                new Color("Black")))
        );

        // Print all three motorcycles.
        printMotorcycle(bike1);
        printMotorcycle(bike2);
        printMotorcycle(bike3);
    }

    // Prints the motorcycle details using getter methods.
    public static void printMotorcycle(Motorcycle bike) {
        System.out.println("================================");
        System.out.println("Motorcycle Details");
        System.out.println("================================");

        System.out.println("Make: " + bike.getMake());
        System.out.println("Model: " + bike.getModel());
        System.out.println("Year: " + bike.getYear());
        System.out.println("Color: " + bike.getColor().getName());

        System.out.println("\nEngine");
        System.out.println("Displacement: " + bike.getEngine().getDisplacementCC() + " cc");
        System.out.println("Horsepower: " + bike.getEngine().getHorsepower());
        System.out.println("Cylinders: " + bike.getEngine().getCylinders());
        System.out.println("Type: " + bike.getEngine().getType());

        System.out.println("\nFrame");
        System.out.println("Type: " + bike.getFrame().getType());
        System.out.println("Material: " + bike.getFrame().getMaterial().getName());
        System.out.println("Material properties: " + bike.getFrame().getMaterial().getProperties());

        System.out.println("\nFront Wheel");
        printWheel(bike.getFrontWheel());

        System.out.println("\nRear Wheel");
        printWheel(bike.getRearWheel());

        System.out.println();
    }

    // Prints the wheel and rim information.
    public static void printWheel(Wheel wheel) {
        System.out.println("Tire type: " + wheel.getTireType());
        System.out.println("Rim diameter: " + wheel.getRims().getDiameterInches() + " inches");
        System.out.println("Rim material: " + wheel.getRims().getMaterial().getName());
        System.out.println("Rim material properties: " + wheel.getRims().getMaterial().getProperties());
        System.out.println("Rim color: " + wheel.getRims().getColor().getName());
    }
}