//Copyright 2024 Justin Schlag

// Base class for all products
public class Product {
    // Attributes
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    // Equals method to compare two products by ID only
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check class type

        Product product = (Product) obj;

        // Equality check on ID only
        return id == product.id;
    }

    // Override toString to return the formatted string
    @Override
    public String toString() {
        // Format name with quotes only if it contains spaces
        String formattedName = name.contains(" ") ? "\"" + name + "\"" : name;

        // Return the formatted string
        return String.format("%010d, %s, $%.2f", id, formattedName, Math.round(price * 100) / 100.0);
    }
}
