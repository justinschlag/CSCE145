// Copyright 2024 Justin Schlag 

/**
 * Class used to describe a consumer or light-commercial grade engine.
 */
public class Engine extends UniquePart {
    /**
     * Enumeration of common engine layouts.
     */
    public enum Layout {
        Inline, Flat, V
    }

    /**
     * Enumeration of common engine cylinder configurations.
     */
    public enum Configuration {
        Twin, Four, Six, Eight
    }

    /**
     * Enumeration of common engine fuel types.
     */
    public enum Fuel {
        Petrol, Diesel, Alternative
    }

    // Private 
    private double displacement; // Engine size 
    private Layout layout;
    private Configuration configuration;
    private Fuel fuel;

    /**
     * FULL constructor METHOD (no default required).
     *
     * @param id            : int
     * @param partNo        : String
     * @param price         : double
     * @param uuid          : String
     * @param displacement  : double
     * @param layout        : Engine.Layout
     * @param configuration : Engine.Configuration
     * @param fuel          : Engine.Fuel
     */
    public Engine(int id, String partNo, double price, String uuid, double displacement, Layout layout,
                  Configuration configuration, Fuel fuel) {
        super(id, partNo, price, uuid); // Call the UniquePart 
        this.displacement = displacement;
        this.layout = layout;
        this.configuration = configuration;
        this.fuel = fuel;
    }

    /**
     * toString METHOD.
     *
     * @return String representation of the engine in colloquial format.
     */
    @Override
    public String toString() {
        StringBuilder engineString = new StringBuilder();
        engineString.append(String.format("%.1fL ", displacement)); // Format displacement with one decimal place
        
        // Handle layout and configuration combinations
        if (layout == Layout.V && configuration == Configuration.Eight) {
            engineString.append("V8");
        } else if (layout == Layout.V) {
            engineString.append(configuration.toString()).append(" Cylinder");
        } else {
            engineString.append(layout).append(" ").append(configuration);
        }

        // Add fuel type if not petrol
        if (fuel != Fuel.Petrol) {
            engineString.append(" (").append(fuel.toString().toLowerCase()).append(")");
        }

        return super.toString() + ", " + engineString.toString();
    }
}
