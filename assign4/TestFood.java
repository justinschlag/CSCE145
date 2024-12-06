// Copyright CSCE 145H FA24
//

public class TestFood extends TestProduct {
    protected static final String[] FOOD_NAMES = {
        "Apple", "Bread", "Milk"
    };
    protected static final double[] VOLUMES = {1.0, 0.5, 2.5};
    protected static final String[] FOOD_TO_STRINGS = {
        String.format("0000270336, Apple, $%.2f, Total: $%.2f",
        		PRODUCT_PRICES[0], VOLUMES[0] * PRODUCT_PRICES[0]),
        String.format("0020971520, Bread, $%.2f, Total: $%.2f",
        		PRODUCT_PRICES[1], VOLUMES[1] * PRODUCT_PRICES[1]),
        String.format("0001048832, Milk, $%.2f, Total: $%.2f",
        		PRODUCT_PRICES[2], VOLUMES[2] * PRODUCT_PRICES[2])
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing Food Class:");
        Food[] food = buildFood();
        boolean passed = true;

        for (int i = 0; i < food.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    FOOD_TO_STRINGS[i], food[i]);
            passed = passed && FOOD_TO_STRINGS[i].equals(food[i].toString());
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static Food[] buildFood() {
        Food[] food = new Food[PRODUCT_IDS.length];
        for (int i = 0; i < food.length; ++i) {
            food[i] = new Food(PRODUCT_IDS[i], FOOD_NAMES[i], PRODUCT_PRICES[i], VOLUMES[i]);
        }
        return food;
    }
}
