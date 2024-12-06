// Copyright CSCE145H FA24
//

/**
 * Class used to test Engine class.
 */
public class TestEngine extends TestPart {
	public static final String[] UUIDS = {
		"44b3866d",
		"a4d96342",
		"e1c49c45"
	};
	
	public static final double[] ENGINE_LITERS = { 5.0, 2.8, 3.6 };
	public static final Engine.Layout[] ENGINE_LAYOUTS = {
		Engine.Layout.V, Engine.Layout.Flat, Engine.Layout.Inline };
	public static final Engine.Configuration[] ENGINE_CONFIGURATIONS = {
		Engine.Configuration.Eight,
		Engine.Configuration.Four,
		Engine.Configuration.Six
	};
	public static final Engine.Fuel[] ENGINE_FUEL_TYPES = {
		Engine.Fuel.Petrol,
		Engine.Fuel.Diesel,
		Engine.Fuel.Alternative
	};
	public static final String[] TO_STRINGS = {
		"44b3866d, 5.0L V8",
		"a4d96342, 2.8L Flat Four (diesel)",
		"e1c49c45, 3.6L Inline Six (alternative)"
	};

	public static void main(String[] args) {
		System.out.println("TESTING Engine CLASS");
		boolean passed = true;
		UniquePart[] testEngines = buildEngines();
		String[] toStrings = buildToStrings();
		for (int i = 0; i < testEngines.length; ++i) {
			System.out.println("  Expected: " + toStrings[i]);
			System.out.println("  Actual:   " + testEngines[i].toString());
			
			if (!toStrings[i].equals(testEngines[i].toString())) {
				passed = false;
			}
		}
		System.out.println(passed ? "  PASSED!" : "  FAILED");
	}
	
	public static UniquePart[] buildEngines() {
		UniquePart[] engines = new Engine[PART_IDS.length];
		for (int i = 0; i < PART_IDS.length; ++i) {
			engines[i] = new Engine(
				PART_IDS[i], PART_NOS[i], PART_PRICES[i],
				UUIDS[i],
				ENGINE_LITERS[i],
				ENGINE_LAYOUTS[i],
				ENGINE_CONFIGURATIONS[i],
				ENGINE_FUEL_TYPES[i]
			);
		}
		return engines;
	}
	
	
	public static String[] buildToStrings() {
		String[] toStrings = new String[TO_STRINGS.length];
		for (int i = 0; i < toStrings.length; ++i) {
			toStrings[i] = PART_TO_STRINGS[i] + ", " + TO_STRINGS[i];
		}
		return toStrings;
	}
}
