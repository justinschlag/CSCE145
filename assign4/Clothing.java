//Copyright 2024 Justin Schlag

// Extending the Product class
public class Clothing extends Product {
    // Enum for size
    public enum Size {
        XXS, XS, S, M, L, XL, XXL
    }

    private Size size; // Size of the clothing
    private String material; // Material of the clothing

    // Constructor
    public Clothing(int id, String name, double price, Size size, String material) {
        super(id, name, price); // Call the parent Product constructor
        this.size = size;
        this.material = material;
    }

    // Override toString method
    @Override
    public String toString() {
        // Use the base Product toString and append size and material
        return String.format("%s, Size: %s, Material: %s",
                super.toString(), size, material);
    }

    // Getters
    public Size getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    // Setters (optional, based on further requirements)
    public void setSize(Size size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}