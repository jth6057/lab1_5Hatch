/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents a motorcycle engine and stores its
 * displacement, horsepower, cylinder count, and engine type.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Engine {
    private int displacementCC;
    private int horsepower;
    private int cylinders;
    private String type;

    // Sets all the engine information.
    public Engine(int displacementCC, int horsepower,
                  int cylinders, String type) {
        this.displacementCC = displacementCC;
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.type = type;
    }

    // Returns the engine displacement.
    public int getDisplacementCC() {
        return displacementCC;
    }

    // Changes the engine displacement.
    public void setDisplacementCC(int displacementCC) {
        this.displacementCC = displacementCC;
    }

    // Returns the horsepower.
    public int getHorsepower() {
        return horsepower;
    }

    // Changes the horsepower.
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Returns the number of cylinders.
    public int getCylinders() {
        return cylinders;
    }

    // Changes the number of cylinders.
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    // Returns the engine type.
    public String getType() {
        return type;
    }

    // Changes the engine type.
    public void setType(String type) {
        this.type = type;
    }
}