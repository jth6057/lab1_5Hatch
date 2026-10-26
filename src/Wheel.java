/**
 * Project: lab1_5Hatch
 * Purpose Details: Represents a motorcycle wheel and stores its
 * tire type and rims.
 * Course: CMPSC 221
 * Author: Tanner Hatch
 * Date Developed: 10/25/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Wheel {
    private String tireType;
    private Rims rims;

    // Sets the wheel information.
    public Wheel(String tireType, Rims rims) {
        this.tireType = tireType;
        this.rims = rims;
    }

    // Returns the tire type.
    public String getTireType() {
        return tireType;
    }

    // Changes the tire type.
    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    // Returns the rims.
    public Rims getRims() {
        return rims;
    }

    // Changes the rims.
    public void setRims(Rims rims) {
        this.rims = rims;
    }
}