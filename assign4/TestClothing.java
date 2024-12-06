// Copyright CSCE 145H FA24
//

public class TestClothing extends TestProduct {
    protected static final String[] CLOTHING_NAMES = {
            "Jacket", "Jeans", "Sweater"
    };
    protected static final Clothing.Size[] CLOTHING_SIZES = {
            Clothing.Size.L, Clothing.Size.M, Clothing.Size.XL
    };
    protected static final String[] CLOTHING_MATERIALS = {
            "Leather", "Denim", "Wool"
    };
    protected static final String[] CLOTHING_TO_STRINGS = {
            "0000270336, Jacket, $9.45, Size: L, Material: Leather",
            "0020971520, Jeans, $10.00, Size: M, Material: Denim",
            "0001048832, Sweater, $10.00, Size: XL, Material: Wool"
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing Clothing Class:");
        Clothing[] clothing = buildClothing();
        boolean passed = true;

        for (int i = 0; i < clothing.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    CLOTHING_TO_STRINGS[i], clothing[i]);
            passed = passed && CLOTHING_TO_STRINGS[i].equals(clothing[i].toString());
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static Clothing[] buildClothing() {
        Clothing[] clothing = new Clothing[PRODUCT_IDS.length];
        for (int i = 0; i < clothing.length; ++i) {
            clothing[i] = new Clothing(
                    PRODUCT_IDS[i], CLOTHING_NAMES[i], PRODUCT_PRICES[i],
                    CLOTHING_SIZES[i], CLOTHING_MATERIALS[i]);
        }
        return clothing;
    }
}
