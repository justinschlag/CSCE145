//Copyright 2024 Justin Schlag

// Extending the Clothing class
public class Shirt extends Clothing {
    // Enum for Sleeve types
    public enum Sleeves {
        Short, Half, Long
    }

    private Sleeves sleeveType; // Sleeve type of the shirt

    // Constructor
    public Shirt(int id, String name, double price, Size size, String material, Sleeves sleeveType) {
        super(id, name, price, size, material); // Call the parent Clothing constructor
        this.sleeveType = sleeveType;
    }

    // Override toString method
    @Override
    public String toString() {
        // Construct the sleeve description
        String sleeveDescription = switch (sleeveType) {
            case Short -> "Short-Sleeved Shirt";
            case Half -> "Half-Sleeved Shirt";
            case Long -> "Long-Sleeved Shirt";
        };

        // Use the base Clothing's toString and prepend the sleeve description
        return String.format("%s: %s", sleeveDescription, super.toString());
    }

    // Getter for sleeve type
    public Sleeves getSleeveType() {
        return sleeveType;
    }

    // Setter for sleeve type (optional, based on further requirements)
    public void setSleeveType(Sleeves sleeveType) {
        this.sleeveType = sleeveType;
    }
}