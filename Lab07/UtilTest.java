//Copyright 2024 Justin Schlag
// Copyright CSCE145H FA24
//

/**
 * Tests the Util class present in the same package.
 */
public class UtilTest {

	public static void main(String[] args) {
		System.out.println("Testing Util.percentDifference(double, double)");
		if (testPercentDifference()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
		
		System.out.println("Testing Util.fpEquals(double, double)");
		if (testFpEquals()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
		
		System.out.println("Testing Util.fpLessThanEqual(double, double)");
		if (testFpLessThanEqual()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
		
		System.out.println("Testing Util.fpGreaterThanEquals(double, double)");
		if (testFpGreaterThanEqual()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
	}
	

	private static boolean testPercentDifference() {
		double[][] pairs = {{-1.0, 1.0}, {17, 18}, {0.000001, 0.00001}};
		String[] expected_diffs = { "200.00%", "5.71%", "163.64%" };
		
		boolean passed = true;
		for (int i = 0; i < pairs.length; ++i) {
			String actual_diff = Util.percentDifference(pairs[i][LHS], pairs[i][RHS]);
			
			if (!expected_diffs[i].equals(actual_diff)) {
				System.out.println("\tTest " + (i + 1) + " Expected: " + expected_diffs[i]
						+ ", Actual: " + actual_diff);
				
				passed = false;
			}
		}
		return passed;
	}
	private static int LHS = 0;
	private static int RHS = 1;
	

	private static boolean testFpEquals() {
		Util.EPSILON = 0.001;  // set static epsilon value for comparisons
		
		double[][] testPairs = {
				{134228224.0, 134228480.0},
				{101.5, 102.625},
				{8589934592.0, 8589934593.0},
				{0.0000061035, -0.0000061035}
		};
		boolean[] expectedOutcomes = { true, false, true, false };
		
		boolean passed = true;
		for (int i = 0; i < testPairs.length; ++i) {
			boolean actualOutcome = Util.fpEquals(testPairs[i][LHS], testPairs[i][RHS]);
			
			if (expectedOutcomes[i] != actualOutcome) {
				System.out.println("\tTest " + (i + 1) + " Expected: " + expectedOutcomes[i]
						+ ", Actual: " + actualOutcome);
				passed = false;
			}
		}
		return passed;
	}
	

	private static boolean testFpLessThanEqual() {
		Util.EPSILON = 0.001;  // set static epsilon value for comparisons
		
		double[][] testPairs = {
				{134228224.0, 134228480.0},
				{101.5, 102.625},
				{8589934592.0, 8589934593.0},
				{0.0000061035, -0.0000061035}
		};
		boolean[] expectedOutcomes = { true, true, true, false };
		
		boolean passed = true;
		for (int i = 0; i < testPairs.length; ++i) {
			boolean actualOutcome = Util.fpLessThanEqual(testPairs[i][LHS], testPairs[i][RHS]);
			
			if (expectedOutcomes[i] != actualOutcome) {
				System.out.println("\tTest " + (i + 1) + " Expected: " + expectedOutcomes[i]
						+ ", Actual: " + actualOutcome);
				passed = false;
			}
		}
		return passed;
	}
	

	private static boolean testFpGreaterThanEqual() {
		Util.EPSILON = 0.001;  // set static epsilon value for comparisons
		
		double[][] testPairs = {
				{134228224.0, 134228480.0},
				{101.5, 102.625},
				{8589934592.0, 8589934593.0},
				{0.0000061035, -0.0000061035}
		};
		boolean[] expectedOutcomes = { true, false, true, true };
		
		boolean passed = true;
		for (int i = 0; i < testPairs.length; ++i) {
			boolean actualOutcome = Util.fpGreaterThanEqual(testPairs[i][LHS], testPairs[i][RHS]);
			
			if (expectedOutcomes[i] != actualOutcome) {
				System.out.println("\tTest " + (i + 1) + " Expected: " + expectedOutcomes[i]
						+ ", Actual: " + actualOutcome);
				passed = false;
			}
		}
		return passed;
	}

}

