//Copyright 2024 Justin Schlag

// Extending the Product class
public class Food extends Product {
    private double volume; // Volume of the food item

    // Constructor
    public Food(int id, String name, double price, double volume) {
        super(id, name, price); // Call the parent Product constructor
        this.volume = volume;
    }

    // Method to calculate the total price based on volume
    public double price() {
        return volume * super.price(); // Multiply volume by price per unit
    }

    // Override toString method
    @Override
    public String toString() {
        // Use the base Product toString and append total price
        return String.format("%s, Total: $%.2f", super.toString(), price());
    }

    // Getters
    public double getVolume() {
        return volume;
    }

    // Setters (optional, based on further requirements)
    public void setVolume(double volume) {
        this.volume = volume;
    }
}