// Copyright CSCE145H FA24
//

/**
 * Class used to test Tire class.
 */
public class TestTire extends TestPart {
	public static final int[] COUNTS = { 10, 8, 4 };
	
	public static final String[] TIRE_TO_STRINGS = {
		"10, P 215/65 R 15 89 H",
		"08, LT 225/55 R 17 101 M",
		"04, ST 205/45 D 16 92 P"
	};

	public static void main(String[] args) {
		System.out.println("TESTING Tire CLASS");
		
		boolean passed = true;
		PartGroup[] testTires = buildTires();
		String[] toStrings = buildToStrings();
		for (int i = 0; i < testTires.length; ++i) {
			System.out.println("  Expected: " + toStrings[i]);
			System.out.println("  Actual: " + testTires[i].toString());
			if (toStrings[i].equals(testTires[i].toString())) {
				passed = true;
			} else {
				passed = false;
			}
		}
		System.out.println(passed ? "  PASSED!" : "  FAILED");
	}
	
	
	public static String[] buildToStrings() {
		String[] toStrings = new String[TIRE_TO_STRINGS.length];
		for (int i = 0; i < toStrings.length; ++i) {
			toStrings[i] = PART_TO_STRINGS[i] + ", " + TIRE_TO_STRINGS[i];
		}
		return toStrings;
	}
	

	public static PartGroup[] buildTires() {
		PartGroup[] tires = {
				new Tire(
					PART_IDS[0], PART_NOS[0], PART_PRICES[0], COUNTS[0],
					Tire.Type.P, 215, 65, Tire.Construction.R, 15, 89, Tire.SpeedRating.H),
				new Tire(
					PART_IDS[1], PART_NOS[1], PART_PRICES[1], COUNTS[1],
					Tire.Type.LT, 225, 55, Tire.Construction.R, 17, 101, Tire.SpeedRating.M),
				new Tire(
					PART_IDS[2], PART_NOS[2], PART_PRICES[2], COUNTS[2],
					Tire.Type.ST, 205, 45, Tire.Construction.D, 16, 92, Tire.SpeedRating.P)
		};
		
		return tires;
	}
}
