// Copyright CSCE 145H FA24
//

public class TestFruit extends TestFood {
    protected static final String[] FRUIT_NAMES = {
            "Banana", "Orange", "Grapes"
    };
    protected static final int[] FRUIT_UNITS = {
    	2, 3, 4
    };
    protected static final double[] FRUIT_PRICES = {
        PRODUCT_PRICES[0] * VOLUMES[0] * FRUIT_UNITS[0],
        PRODUCT_PRICES[1] * VOLUMES[1] * FRUIT_UNITS[1],
    	PRODUCT_PRICES[2] * VOLUMES[2] * FRUIT_UNITS[2],
    };
    protected static final String[] FRUIT_TO_STRINGS = {
            "Fruit: 0000270336, Banana, $9.45, Total: $9.45 count: 2",
            "Fruit: 0020971520, Orange, $10.00, Total: $5.00 count: 3",
            "Fruit: 0001048832, Grapes, $10.00, Total: $25.01 count: 4"
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing Fruit Class:");
        Fruit[] fruits = buildFruit();
        boolean passed = true;

        for (int i = 0; i < fruits.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    FRUIT_TO_STRINGS[i], fruits[i]);
            passed = passed && FRUIT_TO_STRINGS[i].equals(fruits[i].toString());
            System.out.printf("  Price() EXPECTED: %f ACTUAL: %f\n",
            		FRUIT_PRICES[i], fruits[i].price());
            passed = passed && FRUIT_PRICES[i] == fruits[i].price();
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static Fruit[] buildFruit() {
        Fruit[] fruits = new Fruit[PRODUCT_IDS.length];
        for (int i = 0; i < fruits.length; ++i) {
            fruits[i] = new Fruit(
            		PRODUCT_IDS[i], FRUIT_NAMES[i], PRODUCT_PRICES[i], VOLUMES[i], FRUIT_UNITS[i]);
        }
        return fruits;
    }
}
