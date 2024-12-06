
public class TestPart {

	public static void main(String[] args) {
		testConstructor();
		testToString();
	}
	
	
	protected static final int[] PART_IDS = {
		1 << 10,
		1 << 20,
		1 << 30
	};
	
	protected static final String[] PART_NOS = {
		"MSP430FG4619IQZWT",
		"MSP430CE4619TQZWR",
		"MSP430PG4619IQZWT"
	};
	
	protected static final double[] PART_PRICES = {
		247.505,
		259.254,
		287.7545
	};
	
	protected static final String[] PART_TO_STRINGS = {
		"0000001024, MSP430FG4619IQZWT, $247.51",
		"0001048576, MSP430CE4619TQZWR, $259.25",
		"1073741824, MSP430PG4619IQZWT, $287.75"
	};
	
	private static void testConstructor() {
		System.out.println("TESTING Part(int, String, double)");
		boolean passed = true;
		for (int i = 0; i < PART_IDS.length; ++i) {
			Part testPart = new Part(PART_IDS[i], PART_NOS[i], PART_PRICES[i]);
			
			// check id
			System.out.printf(
					"    Expected id: %d,  Actual id: %d\n", PART_IDS[i], testPart.id());
			passed = passed && PART_IDS[i] == testPart.id();
			
			// check part number
			System.out.printf(
					"    Expected partNo: %s,  Actual partNo: %s\n",
					PART_NOS[i], testPart.partNo());
			passed = passed && PART_NOS[i] == testPart.partNo();
			
			// check price
			System.out.printf(
					"    Expected price: %f,  Actual price: %f\n",
					PART_PRICES[i], testPart.price());
			passed = passed && PART_PRICES[i] == testPart.price();
		}
		System.out.printf("  %s\n", passed ? "PASSED" : "FAILED");
	}
	
	private static void testToString() {
		System.out.println("TESTING Part(int, String, double).toString()");
		boolean passed = true;
		for (int i = 0; i < PART_IDS.length; ++i) {
			Part testPart = new Part(PART_IDS[i], PART_NOS[i], PART_PRICES[i]);
			
			System.out.printf(
					"    Expected: %s\n    Actual:   %s\n", PART_TO_STRINGS[i], testPart);
			
			passed = passed && PART_TO_STRINGS[i].equals(testPart.toString());
		}
		System.out.printf("  %s\n", passed ? "PASSED" : "FAILED");
	}
}
