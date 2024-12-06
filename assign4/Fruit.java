//Copyright 2024 Justin Schlag


// Extending the Food class
public class Fruit extends Food {
    private int units; // Number of fruit units

    // Constructor
    public Fruit(int id, String name, double price, double volume, int units) {
        super(id, name, price, volume); // Call the parent Food constructor
        this.units = units;
    }

    // Override price method to calculate total price for all units
    @Override
    public double price() {
        // Total price for all units: price per unit volume * volume * units
        return super.price() * units;
    }

    // Override toString method
    @Override
    public String toString() {
        // Match EXPECTED output: price for one volume, total for one volume
        return String.format("Fruit: %010d, %s, $%.2f, Total: $%.2f count: %d",
                id(), name(), super.price() / getVolume(), super.price(), units);
    }

    // Getter for units
    public int getUnits() {
        return units;
    }

    // Setter for units 
    public void setUnits(int units) {
        this.units = units;
    }
}