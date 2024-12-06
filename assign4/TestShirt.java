// Copyright CSCE 145H FA24
//

public class TestShirt extends TestClothing {
    protected static final String[] SHIRT_NAMES = {
            "T-Shirt", "Polo Shirt", "Dress Shirt"
    };
    protected static final Clothing.Size[] SHIRT_SIZES = {
            Clothing.Size.M, Clothing.Size.L, Clothing.Size.XL
    };
    protected static final String[] SHIRT_MATERIALS = {
            "Cotton", "Polyester", "Silk"
    };
    protected static final Shirt.Sleeves[] SHIRT_SLEEVES = {
            Shirt.Sleeves.Short, Shirt.Sleeves.Half, Shirt.Sleeves.Long
    };
    protected static final String[] SHIRT_TO_STRINGS = {
            "Short-Sleeved Shirt: 0000270336, T-Shirt, $9.45, Size: M, Material: Cotton",
            "Half-Sleeved Shirt: 0020971520, \"Polo Shirt\", $10.00, Size: L, Material: Polyester",
            "Long-Sleeved Shirt: 0001048832, \"Dress Shirt\", $10.00, Size: XL, Material: Silk"
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing Shirt Class:");
        Shirt[] shirts = buildShirts();
        boolean passed = true;

        for (int i = 0; i < shirts.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    SHIRT_TO_STRINGS[i], shirts[i]);
            passed = passed && SHIRT_TO_STRINGS[i].equals(shirts[i].toString());
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static Shirt[] buildShirts() {
        Shirt[] shirts = new Shirt[PRODUCT_IDS.length];
        for (int i = 0; i < shirts.length; ++i) {
            shirts[i] = new Shirt(
                    PRODUCT_IDS[i], SHIRT_NAMES[i], PRODUCT_PRICES[i],
                    SHIRT_SIZES[i], SHIRT_MATERIALS[i], SHIRT_SLEEVES[i]);
        }
        return shirts;
    }
}
