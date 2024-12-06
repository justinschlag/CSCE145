// Copyright CSCE145H FA24
//

/**
 * Class used to test Tire class.
 */
public class TestTire {

	public static void main(String[] args) {
		System.out.println("TESTING Tire CLASS");
		Tire[] testTires = {
				new Tire(TireType.P, 215, 65, ConstructionType.R, 15, 89, SpeedRating.H),
				new Tire(TireType.LT, 225, 55, ConstructionType.R, 17, 101, SpeedRating.M)
		};
		String[] tireToStrings = {
				"P 215/65 R 15 89 H",
				"LT 225/55 R 17 101 M"
		};
		
		boolean passed = true;
		for (int i = 0; i < testTires.length; ++i) {
			System.out.println("  Expected: " + tireToStrings[i]);
			System.out.println("  Actual: " + testTires[i].toString());
			if (tireToStrings[i].equals(testTires[i].toString())) {
				passed = true;
			} else {
				passed = false;
			}
		}
		System.out.println(passed ? "  PASSED!" : "  FAILED");
	}

}
