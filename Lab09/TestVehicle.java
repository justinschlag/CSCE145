// Copyright CSCE145H FA24
//

/**
 * Class used to test Vehicle class; can be considered a light integration test (vs the strictly
 * unit testing we have seen so far).
 */
public class TestVehicle {
	public static final int[] DOOR_COUNTS = { 4, 4, 2 };
	public static final String[] TEST_MAKES = { "Chevrolet", "Honda", "Ford" };
	public static final String[] TEST_MODELS = { "Silverado", "Accord", "F150" };
	public static final String[] EXPECTED_TO_STRINGS = {
		"4-door Chevrolet Silverado\nPart List:\n",
		"4-door Honda Accord\nPart List:\n",
		"2-door Ford F150\nPart List:\n"
	};

	public static void main(String[] args) {
		System.out.println("TESTING Vehicle CLASS");
		// use TestEngine class to build Engine instances
		Part[] testEngines = TestEngine.buildEngines();
		// use TestTire class to build Tire instances
		Part[] testTires = TestTire.buildTires();
		
		boolean passed = true;
		String[] expectedToStrings = buildToStrings();
		for (int i = 0; i < TEST_MAKES.length; ++i) {
			Vehicle testVehicle = new Vehicle(TEST_MAKES[i], TEST_MODELS[i], DOOR_COUNTS[i]);
			testVehicle.addPart(testEngines[i]);
			testVehicle.addPart(testTires[i]);
			
			System.out.println("EXPECTED: \n" + expectedToStrings[i]);
			System.out.println("ACTUAL: \n" + testVehicle);
			if (!expectedToStrings[i].equals(testVehicle.toString())) {
				passed = false;
			}
		}
		System.out.println(passed ? "PASSED!" : "FAILED");
	}

	public static String[] buildToStrings() {
		String[] toStrings = new String[EXPECTED_TO_STRINGS.length];
		String[] testTireToStrings = TestTire.buildToStrings();
		String[] testEngineToStrings = TestEngine.buildToStrings();
		
		for (int i = 0; i < toStrings.length; ++i) {
			toStrings[i] = EXPECTED_TO_STRINGS[i];
			toStrings[i] += " " + testEngineToStrings[i] + "\n";
			toStrings[i] += " " + testTireToStrings[i];
		}
		
		return toStrings;
	}
}
