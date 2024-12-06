//Copyright 2024 Justin Schlag

// Extending the Product class
public class Electronics extends Product {
    private int warrantyPeriod; // Warranty period in months
    private boolean isBatteryPowered; // Whether the product is battery-powered

    // Constructor
    public Electronics(int id, String name, double price, int warrantyPeriod, boolean isBatteryPowered) {
        super(id, name, price); // Call the parent Product constructor
        this.warrantyPeriod = warrantyPeriod;
        this.isBatteryPowered = isBatteryPowered;
    }

    // Override toString method
    @Override
    public String toString() {
        // Use the base Product toString and append warranty and battery info
        return String.format("%s, Warranty: %d months, Battery: %s",
                super.toString(), warrantyPeriod, isBatteryPowered ? "Yes" : "No");
    }

    // Getters
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public boolean getIsBatteryPowered() {
        return isBatteryPowered;
    }

    // Setters (optional, based on further requirements)
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setIsBatteryPowered(boolean isBatteryPowered) {
        this.isBatteryPowered = isBatteryPowered;
    }
}