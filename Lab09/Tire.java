//Copyright 2024 Justin Schlag 

public class Tire extends PartGroup {
    public enum Type { P, LT, ST }
    public enum Construction { R, D }
    public enum SpeedRating { M, N, P, Q, R, S, H }

    private Type type;
    private int width; 
    private int aspectRatio; 
    private Construction construction;
    private int diameter; 
    private int loadIndex; 
    private SpeedRating speedRating;

    public Tire(int id, String partNo, double price, int count, Type type, int width, int aspectRatio,
                Construction construction, int diameter, int loadIndex, SpeedRating speed) {
        super(id, partNo, price, count); // Call PartGroup constructor
        this.type = type;
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.construction = construction;
        this.diameter = diameter;
        this.loadIndex = loadIndex;
        this.speedRating = speed;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, %s %d/%d %s %d %d %s",
            super.toString(), // Includes count from PartGroup
            type,
            width,
            aspectRatio,
            construction,
            diameter,
            loadIndex,
            speedRating
        );
    }
}
