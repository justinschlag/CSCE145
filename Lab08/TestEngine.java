// Copyright CSCE145H FA24
//

/**
 * Class used to test Engine class.
 */
public class TestEngine {

	public static void main(String[] args) {
		System.out.println("TESTING Engine CLASS");
		Engine testEngines[] = {
			new Engine(5.0, EngineLayout.V, ConfigurationType.Eight, FuelType.Petrol),
			new Engine(2.8, EngineLayout.V, ConfigurationType.Four, FuelType.Diesel),
			new Engine(3.6, EngineLayout.Inline, ConfigurationType.Six, FuelType.Petrol)
		};
		String[] expectedToStrings = {
			"5.0L V8",
			"2.8L Four cylinder (diesel)",
			"3.6L Inline Six"
		};
		
		boolean passed = true;
		for (int i = 0; i < testEngines.length; ++i) {
			System.out.println("  Expected: " + expectedToStrings[i]);
			System.out.println("  Actual: " + testEngines[i].toString());
			
			if (!expectedToStrings[i].equals(testEngines[i].toString())) {
				passed = false;
			}
		}
		System.out.println(passed ? "  PASSED!" : "  FAILED");
	}

}
