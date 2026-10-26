/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents a motorcycle frame and stores its
 * frame type and material.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */
public class Frame {
    private String type;
    private Material material;

    // Sets the frame type and material.
    public Frame(String type, Material material) {
        this.type = type;
        this.material = material;
    }

    // Returns the frame type.
    public String getType() {
        return type;
    }

    // Changes the frame type.
    public void setType(String type) {
        this.type = type;
    }

    // Returns the frame material.
    public Material getMaterial() {
        return material;
    }

    // Changes the frame material.
    public void setMaterial(Material material) {
        this.material = material;
    }
}