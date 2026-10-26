/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents a color by storing its name.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Color {
    private String name;

    // Sets the color name.
    public Color(String name) {
        this.name = name;
    }

    // Returns the color name.
    public String getName() {
        return name;
    }

    // Changes the color name.
    public void setName(String name) {
        this.name = name;
    }
}