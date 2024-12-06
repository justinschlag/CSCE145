// Copyright 2024 Justin Schlag 

import java.util.ArrayList;

/**
 * Class representing a vehicle. It consists of vehicle-specific
 * attributes as well as a list of parts. You MUST store that data
 * as a Part instance - consider using an ArrayList.
 */
public class Vehicle {
    // Private attributes
    private String make;    // Vehicle make
    private String model;   // Vehicle model
    private int doors;      // Number of doors
    private ArrayList<Part> parts; // List of parts (Tires and Engine)

    /**
     * FULL constructor METHOD (no defaults needed).
     * 
     * @param make  : String
     * @param model : String
     * @param doors : int
     */
    public Vehicle(String make, String model, int doors) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.parts = new ArrayList<>(); // Initializes parts list
    }

    /**
     * Mutator method addPart.
     * 
     * Adds a new part to the list of parts making up a vehicle.
     * 
     * @param addMe : Part
     */
    public void addPart(Part addMe) {
        if (addMe != null) {
            parts.add(addMe); // Add the part to the list
        }
    }

    /**
     * toString METHOD.
     * 
     * When doors > 0, begin string with #-door where # is the number of doors,
     * follow with the string "Part List:" and a list of each part of stored by the
     * vehicle, delimited by newline characters (\n).
     * 
     * @return String description of the Vehicle.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Add doors, make, and model information
        result.append(doors > 0 ? doors + "-door " : "");
        result.append(make).append(" ").append(model).append("\n");

        // Add Part List 
        result.append("Part List:\n");

        // Append each part's toString
        for (Part part : parts) {
            result.append(" ").append(part.toString()).append("\n");
        }

        // Trim newline character and return result
        return result.toString().trim();
    }
}
