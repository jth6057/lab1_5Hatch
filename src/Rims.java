/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents motorcycle rims and stores their
 * diameter, material, and color.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */
public class Rims {
    private int diameterInches;
    private Material material;
    private Color color;

    // Sets the rim information.
    public Rims(int diameterInches, Material material, Color color) {
        this.diameterInches = diameterInches;
        this.material = material;
        this.color = color;
    }

    // Returns the rim diameter.
    public int getDiameterInches() {
        return diameterInches;
    }

    // Changes the rim diameter.
    public void setDiameterInches(int diameterInches) {
        this.diameterInches = diameterInches;
    }

    // Returns the rim material.
    public Material getMaterial() {
        return material;
    }

    // Changes the rim material.
    public void setMaterial(Material material) {
        this.material = material;
    }

    // Returns the rim color.
    public Color getColor() {
        return color;
    }

    // Changes the rim color.
    public void setColor(Color color) {
        this.color = color;
    }
}