//Copyright 2024 Justin Schlag

// Extending the Furniture class
public class Table extends Furniture {

    // Constructor
    public Table(int id, String name, double price, String dimensions, double weight, Material material, Location location) {
        super(id, name, price, dimensions, weight, material, location); // Call the parent Furniture constructor
    }

    // Override toString method
    @Override
    public String toString() {
        // Prepend "Table: " to the base Furniture's toString implementation
        return String.format("Table: %s", super.toString());
    }
}