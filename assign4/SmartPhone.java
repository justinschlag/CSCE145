//Copyright 2024 Justin Schlag

// Extending the Electronics class
public class SmartPhone extends Electronics {
    // Enum for phone types
    public enum Type {
        Android, Apple, Other
    }

    private Type phoneType; // Type of the smartphone

    // Constructor
    public SmartPhone(int id, String name, double price, int warrantyPeriod, Type phoneType, boolean isBatteryPowered) {
        super(id, name, price, warrantyPeriod, isBatteryPowered); // Call the parent Electronics constructor
        this.phoneType = phoneType;
    }

    // Override toString method
    @Override
    public String toString() {
        // Construct the phone type description
        String phoneTypeDescription = switch (phoneType) {
            case Android -> "Android SmartPhone";
            case Apple -> "Apple SmartPhone";
            case Other -> "Other SmartPhone";
        };

        // Use the base Electronics's toString and prepend the phone type description
        return String.format("%s: %s", phoneTypeDescription, super.toString());
    }

    // Getter for phone type
    public Type getPhoneType() {
        return phoneType;
    }

    // Setter for phone type (optional, based on further requirements)
    public void setPhoneType(Type phoneType) {
        this.phoneType = phoneType;
    }
}