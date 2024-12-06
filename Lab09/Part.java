//Copyright 2024 Justin Schlag


/**
 * The Part class is a parent class that will be extended by child classes to
 * represent common parts added to vehicles, e.g., tires and engines. There
 * will be two additional child classes between Tire and Engine, representing
 * a Part that is unique in the class and a part that is often added in groups.
 * See PartGroup and UniquePart for more.
 */
public class Part {
    // Private 
    private int identifier;
    private String partNumber;
    private double price;

    /**
     * Full constructor. Sets all private attributes.
     *
     * @param id : int
     * @param partNo : String
     * @param price : double
     */
    public Part(int id, String partNo, double price) {
        this.identifier = id;
        this.partNumber = partNo;
        this.price = price;
    }

    /**
     * Accessor for part's identifier.
     *
     * @return Value of identifier.
     */
    public int id() {
        return identifier;
    }

    /**
     * Accessor for part's part number.
     *
     * @return Value of part number.
     */
    public String partNo() {
        return partNumber;
    }

    /**
     * Accessor for part's price.
     *
     * @return Value of part price.
     */
    public double price() {
        return price;
    }

    /**
     * The equals method compares two parts based on their part identifier attributes.
     *
     * @param rhs : Part The right-hand-side of this == rhs.
     *
     * @return True if the two Parts' identifiers are equal.
     */
    @Override
    public boolean equals(Object rhs) {
        if (rhs == this) {
            return true;
        }
        if (rhs == null || !(rhs instanceof Part)) {
            return false;
        }
        Part other = (Part) rhs;
        return this.identifier == other.identifier;
    }

    /**
     * The toString method builds a comma-delimited concatenation of the three attributes.
     *
     * The identifier is displayed as a 10-digit integer, left-padded with zeros
     * if it is less than 10 digits.
     * ", "
     * The part number is second.
     * ", "
     * The price is given with a leading dollar sign and is rounded to two digits.
     *
     * @return The string described above.
     */
    @Override
    public String toString() {
        return String.format("%010d, %s, $%.2f", identifier, partNumber, price);
    }
}
