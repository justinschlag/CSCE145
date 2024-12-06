// Copyright 2024 Justin Schlag 

/**
 * Vehicle
 *
 * Class to represent a consumer or light-grade commercial vehicle.
 */
public class Vehicle {
    // Private attributes as specified
    private String make;
    private String model;
    private int doors;
    private Tire tire;
    private int wheels;
    private Engine engine;

    /**
     * FULL constructor METHOD (no defaults needed)
     * @param make : String
     * @param model : String
     * @param doors : int (must be >= 0, I may pass in -1 doors)
     * @param tire : Tire
     * @param wheels : int (must be > 0, I may pass in 0 wheels)
     * @param engine : Engine
     */
    public Vehicle(String make, String model, int doors, Tire tire, int wheels, Engine engine) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.tire = tire;
        this.wheels = wheels;
        this.engine = engine;
    }

    /**
     * toString METHOD
     * 
     * When doors > 0, begin string with #-door where # is the number of doors, follow
     * with make and model. See tests for description of adding Tire variables.
     * See tests for description of adding Engine variable.
     */
    public String toString() {
        StringBuilder description = new StringBuilder();

        // Add door information if doors > 0
        if (doors > 0) {
            description.append(doors).append("-door ");
        }

        // Add make and model
        description.append(make).append(" ").append(model);

        // Add tire information
        description.append(", Tires: ").append(tire.toString()).append(" x ").append(wheels);

        // Add engine information
        description.append(", Engine: ").append(engine.toString());

        return description.toString();
    }
}
