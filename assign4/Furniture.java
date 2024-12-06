//Copyright 2024 Justin Schlag

// Extending the Product class
public class Furniture extends Product {
    // Enum for Material
    public enum Material {
        Wood, Fabric, Leather, Plastic, Metal
    }

    // Enum for Location
    public enum Location {
        LivingRoom, DiningRoom, Bedroom, Office, Outdoor, Bathroom
    }

    private String dimensions;       // Dimensions of the furniture (e.g., "36 x 72 x 32")
    private double weight;           // Weight of the furniture in kilograms
    private Material material;       // Material of the furniture
    private Location location;       // Location for the furniture

    // Constructor
    public Furniture(int id, String name, double price, String dimensions, double weight, Material material, Location location) {
        super(id, name, price); // Call the parent Product constructor
        this.dimensions = dimensions;
        this.weight = weight;
        this.material = material;
        this.location = location;
    }

    // Override toString method
    @Override
    public String toString() {
        // Use the base Product's toString and append the furniture-specific details
        return String.format("%s, Dimensions: %s, Weight: %.2f kg, Material: %s, Location: %s",
                super.toString(), dimensions, weight, material, location);
    }

    // Getters
    public String getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public Material getMaterial() {
        return material;
    }

    public Location getLocation() {
        return location;
    }

    // Setters (optional, based on further requirements)
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
