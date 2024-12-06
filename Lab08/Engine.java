//Copyright 2024 Justin Schlag

/**
 * Enumeration of common engine layouts.
 */
// Straight or inline engine
// Flat engine
// V-engine
enum EngineLayout { Inline, Flat, V }

/**
 * Enumeration of common engine cylinder configurations.
 */
// Twin-cylinder engine
// Four-cylinder engine
// Six-cylinder engine
// Eight-cylinder engine
enum ConfigurationType { Twin, Four, Six, Eight }

/**
 * Enumeration of common engine fuel types.
 */
// Petrol-burning engine
// Diesel-burning engine
// Alternative-fuel-powered engine
enum FuelType { Petrol, Diesel, Alternative }

/**
 * Engine
 *
 * Class used to describe a consumer or light-commercial grade engine.
 */
public class Engine {
    private double displacement;
    private EngineLayout layout;
    private ConfigurationType configuration;
    private FuelType fuel;

    /**
     * FULL constructor METHOD (no default required)
     * 
     * @param displacement : double (must be > 1)
     * @param layout : EngineLayout
     * @param configuration : ConfigurationType
     * @param fuel : FuelType
     */
    public Engine(double displacement, EngineLayout layout, ConfigurationType configuration, FuelType fuel) {
        this.displacement = displacement;
        this.layout = layout;
        this.configuration = configuration;
        this.fuel = fuel;
    }

    /**
     * toString METHOD
     * 
     * Engines have colloquial descriptions that are used by mechanics and the like.
     * Use their terminology to "name" your engine instances as follows.
     * 
     * Displacement is added as a floating point with one decimal place followed by
     * the letter "L" for liters. Layout and configuration are handled as follows:
     *   - Inline and Flat configurations:
     *       Inline Twin, Inline Four, Inline Six, Inline Eight
     *       Flat Twin, Flat Four, Flat Six, Flat Eight
     *   - V configurations:
     *       V Twin, Four Cylinder, Six Cylinder, V8
     * Only add fuel type if not petrol. Do so by adding fuel type in parenthesis at
     * the end, e.g. (diesel).
     */
    public String toString() {
        StringBuilder description = new StringBuilder();
        
        description.append(String.format("%.1fL ", displacement));
        
        if (layout == EngineLayout.V) {
            if (configuration == ConfigurationType.Eight) {
                description.append("V8");
            } else if (configuration == ConfigurationType.Four) {
                description.append("Four cylinder");
            } else if (configuration == ConfigurationType.Six) {
                description.append("Six cylinder");
            } else {
                description.append("V ").append(configuration.name());
            }
        } else {
            description.append(layout.name()).append(" ").append(configuration.name());
        }
        
        if (fuel != FuelType.Petrol) {
            description.append(" (").append(fuel.name().toLowerCase()).append(")");
        }
        
        return description.toString();
    }
}
