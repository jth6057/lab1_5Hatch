/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents a motorcycle and stores its make, model,
 * year, color, engine, frame, and front and rear wheels.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/26/2026
 * Revision: 2.0
 */

public class Motorcycle {
    private String make;
    private String model;
    private int year;
    private Color color;
    private Engine engine;
    private Frame frame;
    private Wheel frontWheel;
    private Wheel rearWheel;

    // Sets all the motorcycle information.
    public Motorcycle(String make, String model, int year, Color color, Engine engine, Frame frame, Wheel frontWheel, Wheel rearWheel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.frame = frame;
        this.frontWheel = frontWheel;
        this.rearWheel = rearWheel;
    }

    // Returns the motorcycle make.
    public String getMake() {
        return make;
    }

    // Changes the motorcycle make.
    public void setMake(String make) {
        this.make = make;
    }

    // Returns the motorcycle model.
    public String getModel() {
        return model;
    }

    // Changes the motorcycle model.
    public void setModel(String model) {
        this.model = model;
    }

    // Returns the motorcycle year.
    public int getYear() {
        return year;
    }

    // Changes the motorcycle year.
    public void setYear(int year) {
        this.year = year;
    }

    // Returns the motorcycle color.
    public Color getColor() {
        return color;
    }

    // Changes the motorcycle color.
    public void setColor(Color color) {
        this.color = color;
    }

    // Returns the engine.
    public Engine getEngine() {
        return engine;
    }

    // Changes the engine.
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Returns the frame.
    public Frame getFrame() {
        return frame;
    }

    // Changes the frame.
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    // Returns the front wheel.
    public Wheel getFrontWheel() {
        return frontWheel;
    }

    // Changes the front wheel.
    public void setFrontWheel(Wheel frontWheel) {this.frontWheel = frontWheel;}

    // Returns the rear wheel.
    public Wheel getRearWheel() {
        return rearWheel;
    }

    // Changes the rear wheel.
    public void setRearWheel(Wheel rearWheel) {
        this.rearWheel = rearWheel;
    }
}