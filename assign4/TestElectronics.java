// Copyright CSCE 145H FA24
//

public class TestElectronics extends TestProduct {
    protected static final String[] ELECTRONICS_NAMES = {
            "Laptop", "Desktop", "Tablet"
    };
    protected static final int[] WARRANTY_PERIODS = {12, 24, 36};
    protected static final boolean[] IS_BATTERY_POWERED = {true, false, true};
    protected static final String[] ELECTRONICS_TO_STRINGS = {
            "0000270336, Laptop, $9.45, Warranty: 12 months, Battery: Yes",
            "0020971520, Desktop, $10.00, Warranty: 24 months, Battery: No",
            "0001048832, Tablet, $10.00, Warranty: 36 months, Battery: Yes"
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing Electronics Class:");
        Electronics[] electronics = buildElectronics();
        boolean passed = true;

        for (int i = 0; i < electronics.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    ELECTRONICS_TO_STRINGS[i], electronics[i]);
            passed = passed && ELECTRONICS_TO_STRINGS[i].equals(electronics[i].toString());
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static Electronics[] buildElectronics() {
        Electronics[] electronics = new Electronics[PRODUCT_IDS.length];
        for (int i = 0; i < electronics.length; ++i) {
            electronics[i] = new Electronics(
                PRODUCT_IDS[i], ELECTRONICS_NAMES[i], PRODUCT_PRICES[i],
                WARRANTY_PERIODS[i], IS_BATTERY_POWERED[i]);
        }
        return electronics;
    }
}
