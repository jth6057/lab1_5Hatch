/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents a material by storing its name and
 * describing its properties.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Material {
    private String name;
    private String properties;

    // Sets the material information.
    public Material(String name, String properties) {
        this.name = name;
        this.properties = properties;
    }

    // Returns the material name.
    public String getName() {
        return name;
    }

    // Changes the material name.
    public void setName(String name) {
        this.name = name;
    }

    // Returns the material properties.
    public String getProperties() {
        return properties;
    }

    // Changes the material properties.
    public void setProperties(String properties) {
        this.properties = properties;
    }
}