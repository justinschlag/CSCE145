// Copyright CSCE145H FA24
//

/**
 * Tests the Grade class present in the same package.
 */
public class GradeTest {

	public static void main(String[] args) {
		System.out.println("Testing Grade(double)");
		if (testConstructor1()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
		
		System.out.println("Testing Grade(double, double)");
		if (testConstructor2()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
		
		System.out.println("Testing Grade.letter()");
		if (testLetterMiddle() && testLetterEdge()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
		
		System.out.println("Testing Grade.percent()");
		if (testPercentMiddle() && testPercentEdge()) {
			System.out.println("\tPASSED");
		} else {
			System.out.println("\tFAILED");
		}
	}
	
	
	private static boolean testConstructor1() {
		double testScore = 87.675;
		double expectedTotal = 100.0;
		
		boolean passed = true;
		Grade testGrade = new Grade(testScore);
		if (testScore != testGrade.score()) {
			System.out.println("\tGrade(" + testScore + ")"
					+ " Expected score: " + testScore
					+ ", Actual score: " + testGrade.score());
			passed = false;
		}
		if (expectedTotal != testGrade.total())  {
			System.out.println("\tGrade(" + testScore + ")"
					+ " Expected total: " + expectedTotal
					+ ", Actual total: " + testGrade.total());
			passed = false;
		}
		return passed;
	}
	
	
	private static boolean testConstructor2() {
		double testScore = 87.675;
		double testTotal = 80.0;
		
		boolean passed = true;		
		Grade testGrade = new Grade(testScore, testTotal);
		if (testScore != testGrade.score()) {
			System.out.println("\tGrade(" + testScore + ", " + testTotal + ")"
					+ " Expected score: " + testScore
					+ ", Actual score: " + testGrade.score());
			passed = false;
		}
		if (testTotal != testGrade.total())  {
			System.out.println("\tGrade(" + testScore + ", " + testTotal + ")"
					+ " Expected total: " + testTotal
					+ ", Actual total: " + testGrade.total());
			passed = false;
		}
		return passed;
	}

	
	private static boolean testLetterMiddle() {
		double[] scores = { 95, 85, 75, 65, 55 };
		char[] letters = { 'A', 'B', 'C', 'D', 'F' };
		
		for (int i = 0; i < scores.length; ++i) {
			Grade middleTest = new Grade(scores[i]);
			char actual = middleTest.letter();
			if (actual != letters[i]) {
				System.out.println("\tGrade.letter(" + scores[i] + ") Expected: " + letters[i]
						+ ", Actual: " + actual);
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean testLetterEdge() {
		double[] scores = { 89.455, 89.444, 79.455, 79.444, 69.455, 69.444, 59.455, 59.444 };
		char[] letters = { 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'F' };
		
		boolean passed = true;
		for (int i = 0; i < scores.length; ++i) {
			Grade edgeTest = new Grade(scores[i]);
			char actual = edgeTest.letter();
			if (actual != letters[i]) {
				System.out.println("\tGrade.letter(" + scores[i] + ") Expected: " + letters[i]
						+ ", Actual: " + actual);
				passed = false;
			}
		}
		
		return passed;
	}

	
	private static boolean testPercentMiddle() {
		double[] scores = { 90, 80, 70, 60, 50 };
		String[] expectedPercents = { "90.0%", "80.0%", "70.0%", "60.0%", "50.0%"};

		boolean passed = true;
		for (int i = 0; i < scores.length; ++i) {
			Grade middleTest = new Grade(scores[i]);
			
			if (!middleTest.percent().equals(expectedPercents[i])) {
				System.out.println("\tGrade(" + scores[i] + ")"
						+ " Expected: " + expectedPercents[i]
						+ ", Actual: " + middleTest.percent());
				passed = false;
			}
		}
		return passed;
	}
	
	private static boolean testPercentEdge() {
		double[] scores = { 89.455, 89.444, 79.455, 79.444, 69.455, 69.444, 59.455, 59.444 };
		String[] percents = { "89.5%", "89.4%", "79.5%", "79.4%", "69.5%", "69.4%", "59.5%", "59.4%" };
		
		boolean passed = true;
		for (int i = 0; i < scores.length; ++i) {
			Grade edgeTest = new Grade(scores[i]);
			String actual = edgeTest.percent();
			if (!actual.equals(edgeTest.percent())) {
				System.out.println("\tGrade.percent(" + scores[i] + ") Expected: " + percents[i]
						+ ", Actual: " + actual);
				passed = false;
			}
		}
		
		return passed;
	}
}
