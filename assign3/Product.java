//Copyright 2024 Justin Schlag 

/**
 * The Product class stores information about a purchasable item in an
 * online shopping application. It contains information identifying,
 * naming, and providing a price for some item.
 */
public class Product {
    private int id;
    private String name;
    private double price;

    /**
     * Constructor for Product
     *
     * @param id    : product id >= 0
     * @param name  : must not be empty
     * @param price : must be > 0.0
     */
    public Product(int id, String name, double price) {
        if (id < 0 || name == null || name.isEmpty() || price <= 0.0) {
            throw new IllegalArgumentException("Invalid product details provided");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * id accessor
     *
     * @return product id as integer
     */
    public int id() {
        return id;
    }

    /**
     * name accessor
     *
     * @return product name as String
     */
    public String name() {
        return name;
    }

    /**
     * price accessor
     *
     * @return product price as double
     */
    public double price() {
        return price;
    }

    /**
     * Method equals(Product rhs), where equality is determined solely by
     * equal ids. That is, if two products have different ids, they are
     * not equal.
     *
     * @param rhs The right-hand-side of this == rhs
     * @return True when the id of two products are equal.
     */
    public boolean equals(Product rhs) {
        if (rhs == null) {
            return false;
        }
        return this.id == rhs.id;
    }

    /**
     * Returns a string representation of the Product instance with specific formatting.
     * The id is left-padded with zeros to be 10 characters wide, the name is quoted if
     * it contains spaces, and the price is rounded to two decimal places preceded by a
     * dollar sign.
     *
     * @return Formatted string representation of the Product.
     */
    
    public String toString() {
        String formattedId = String.format("%010d", id);
        String formattedName = name.contains(" ") ? "\"" + name + "\"" : name;
        String formattedPrice = String.format("$%.2f", price);
        return formattedId + ", " + formattedName + ", " + formattedPrice;
    }
}