// Copyright CSCE 145H FA24
//

public class TestTable extends TestFurniture {
    protected static final String[] TABLE_NAMES = {
        "Dining Table", "Coffee Table", "Study Desk"
    };
    protected static final Furniture.Location[] TABLE_LOCATIONS = {
    	Furniture.Location.DiningRoom, Furniture.Location.LivingRoom, Furniture.Location.Bathroom
    };
    protected static final String[] TABLE_DIMS = {
        "120x80x75 cm", "90x60x45 cm", "150x75x70 cm"
    };
    protected static final double[] TABLE_WEIGHTS = {
        30.5, 15.2, 25.0
    };
    protected static final Furniture.Material[] TABLE_MATERIALS = {
        Furniture.Material.Wood, Furniture.Material.Metal, Furniture.Material.Plastic
    };
    protected static final String[] TABLE_TO_STRINGS = {
        "Table: 0000270336, \"Dining Table\", $9.45, Dimensions: 120x80x75 cm, Weight: 30.50 kg, Material: Wood, Location: DiningRoom",
        "Table: 0020971520, \"Coffee Table\", $10.00, Dimensions: 90x60x45 cm, Weight: 15.20 kg, Material: Metal, Location: LivingRoom",
        "Table: 0001048832, \"Study Desk\", $10.00, Dimensions: 150x75x70 cm, Weight: 25.00 kg, Material: Plastic, Location: Bathroom"
    };

    public static void main(String[] args) {
        testToString();
    }

    private static boolean testToString() {
        System.out.println("Testing Table Class:");
        Table[] tables = buildTables();
        boolean passed = true;

        for (int i = 0; i < tables.length; ++i) {
            System.out.printf("  EXPECTED: %s\n  ACTUAL: %s\n",
                    TABLE_TO_STRINGS[i], tables[i]);
            passed = passed && TABLE_TO_STRINGS[i].equals(tables[i].toString());
        }

        System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
        return passed;
    }

    private static Table[] buildTables() {
        Table[] tables = new Table[PRODUCT_IDS.length];
        for (int i = 0; i < tables.length; ++i) {
            tables[i] = new Table(
                    PRODUCT_IDS[i], TABLE_NAMES[i], PRODUCT_PRICES[i],
                    TABLE_DIMS[i], TABLE_WEIGHTS[i], TABLE_MATERIALS[i],
                    TABLE_LOCATIONS[i]);
        }
        return tables;
    }
}
