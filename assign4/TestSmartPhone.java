// Copyright CSCE 145H FA24
//

public class TestSmartPhone extends TestElectronics {
    protected static final String[] SMARTPHONE_NAMES = {
            "Galaxy S22", "iPhone 14", "Pixel 7"
    };
    protected static final SmartPhone.Type[] PHONE_TYPES = {
            SmartPhone.Type.Android, SmartPhone.Type.Apple, SmartPhone.Type.Other
    };
    protected static final String[] SMARTPHONE_TO_STRINGS = {
            "Android SmartPhone: 0000270336, \"Galaxy S22\", $9.45, Warranty: 12 months, Battery: Yes",
            "Apple SmartPhone: 0020971520, \"iPhone 14\", $10.00, Warranty: 24 months, Battery: No",
            "Other SmartPhone: 0001048832, \"Pixel 7\", $10.00, Warranty: 36 months, Battery: Yes"
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing SmartPhone Class:");
        SmartPhone[] smartphones = buildSmartPhones();
        boolean passed = true;

        for (int i = 0; i < smartphones.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    SMARTPHONE_TO_STRINGS[i], smartphones[i]);
            passed = passed && SMARTPHONE_TO_STRINGS[i].equals(smartphones[i].toString());
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static SmartPhone[] buildSmartPhones() {
        SmartPhone[] smartphones = new SmartPhone[PRODUCT_IDS.length];
        for (int i = 0; i < smartphones.length; ++i) {
            smartphones[i] = new SmartPhone(
                    PRODUCT_IDS[i], SMARTPHONE_NAMES[i], PRODUCT_PRICES[i],
                    WARRANTY_PERIODS[i], PHONE_TYPES[i], IS_BATTERY_POWERED[i]);
        }
        return smartphones;
    }
}
