// Copyright CSCE145H FA24
//

/**
 * Class used to test Vehicle class; can be considered a light integration test (vs the strictly
 * unit testing we have seen so far).
 */
public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("TESTING Vehicle CLASS");
		Engine testEngines[] = {
				new Engine(5.0, EngineLayout.V, ConfigurationType.Eight, FuelType.Petrol),
				new Engine(2.8, EngineLayout.V, ConfigurationType.Four, FuelType.Diesel),
				new Engine(3.6, EngineLayout.Inline, ConfigurationType.Six, FuelType.Petrol)
			};
		Tire[] testTires = {
				new Tire(TireType.P, 215, 65, ConstructionType.R, 15, 89, SpeedRating.H),
				new Tire(TireType.LT, 225, 55, ConstructionType.R, 17, 101, SpeedRating.M),
				new Tire(TireType.P, 215, 65, ConstructionType.R, 15, 89, SpeedRating.P),
			};
		int[] doorCount = { 4, 4, 2 };
		int tireCount = 4;
		String[] testMakes = { "Honda", "Chevrolet", "Ford" };
		String[] testModels = { "Accord", "Silverado", "F150" };
		String[] testToStrings = {
				"4-door Honda Accord, Tires: P 215/65 R 15 89 H x 4, Engine: 5.0L V8",
				"4-door Chevrolet Silverado, Tires: LT 225/55 R 17 101 M x 4, Engine: 2.8L Four cylinder (diesel)",
				"2-door Ford F150, Tires: P 215/65 R 15 89 P x 4, Engine: 3.6L Inline Six"
		};
		
		boolean passed = true;
		for (int i = 0; i < testMakes.length; ++i) {
			Vehicle testVehicle = new Vehicle(testMakes[i],
					testModels[i], doorCount[i], testTires[i], tireCount, testEngines[i]);
			
			System.out.println("  Expected: " + testToStrings[i]);
			System.out.println("  Actual: " + testVehicle);
			if (!testToStrings[i].equals(testVehicle.toString())) {
				passed = false;
			}
		}
		System.out.println(passed ? "  PASSED!" : "  FAILED");
	}

}
