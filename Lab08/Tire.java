// Copyright 2024 Justin Schlag

/**
 * Enumeration of common tire types.
 */
enum TireType {
    P, LT, ST
}

/**
 * Enumeration of common tire construction types.
 */
enum ConstructionType {
    R, D
}

/**
 * Enumeration of common tire speed ratings.
 */
enum SpeedRating {
    M, N, P, Q, R, S, H
}

/**
 * Tire
 *
 * Class used to describe the tire type used by a street-legal consumer
 * or light-commercial vehicle.
 */
public class Tire {
    // Private attributes
    private TireType type;
    private int width;          // Three-digit width
    private int aspectRatio;    // Two-digit aspect ratio
    private ConstructionType construction;
    private int diameter;       // Two-digit diameter
    private int loadIndex;      // Two- or three-digit load index
    private SpeedRating speed;

    /**
     * FULL constructor METHOD (no default required)
     *
     * @param type : TireType
     * @param width : int (must be three digits and > 0)
     * @param aspectRatio : int (must be two digits and > 0)
     * @param construction : ConstructionType
     * @param diameter : int (must be two digits and > 0)
     * @param loadIndex : int (must be two or three digits and > 0)
     * @param speed : SpeedRating
     */
    public Tire(TireType type, int width, int aspectRatio, ConstructionType construction, int diameter, int loadIndex, SpeedRating speed) {
        if (width < 100 || width > 999) {
            throw new IllegalArgumentException("Width must be a three-digit integer.");
        }
        if (aspectRatio < 10 || aspectRatio > 99) {
            throw new IllegalArgumentException("Aspect ratio must be a two-digit integer.");
        }
        if (diameter < 10 || diameter > 99) {
            throw new IllegalArgumentException("Diameter must be a two-digit integer.");
        }
        if (loadIndex < 10 || loadIndex > 999) {
            throw new IllegalArgumentException("Load index must be a two- or three-digit integer.");
        }
        
        this.type = type;
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.construction = construction;
        this.diameter = diameter;
        this.loadIndex = loadIndex;
        this.speed = speed;
    }

    /**
     * toString METHOD
     *
     * @return String representation of the tire (as seen in tire specifications)
     */
    public String toString() {
        return String.format("%s %d/%d %s %d %d %s",
                type, width, aspectRatio, construction, diameter, loadIndex, speed);
    }
}
