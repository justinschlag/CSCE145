// Copyright CSCE 145H FA24
//

public class TestFurniture extends TestProduct {
	protected static final String[] FURNITURE_NAMES = {
		"Couch", "Love Seat", "Kitchen Table"
	};
	protected static final String[] FURNITURE_DIMS = {
		"36 x 72 x 32", "36 x 56 x 32", "60in diameter"
	};
	protected static final double[] FURNITURE_WEIGHTS = {
		278, 187.2, 100.5
	};
	protected static final Furniture.Material[] FURNITURE_MATS = {
		Furniture.Material.Fabric, Furniture.Material.Leather, Furniture.Material.Wood
	};
	protected static final Furniture.Location[] FURNITURE_LOCATIONS = {
			Furniture.Location.LivingRoom, Furniture.Location.LivingRoom, Furniture.Location.DiningRoom
	};

	protected static final String[] FURNITURE_TO_STRINGS = {
		"0000270336, Couch, $9.45, Dimensions: 36 x 72 x 32, Weight: 278.00 kg, Material: Fabric, Location: LivingRoom",
		"0020971520, \"Love Seat\", $10.00, Dimensions: 36 x 56 x 32, Weight: 187.20 kg, Material: Leather, Location: LivingRoom",
		"0001048832, \"Kitchen Table\", $10.00, Dimensions: 60in diameter, Weight: 100.50 kg, Material: Wood, Location: DiningRoom"
	};


	public static void main(String[] args) {
		testToString();
	}
	
	
	private static boolean testToString() {
		Furniture[] furniture = buildFurniture();
		
		System.out.println("Testing Furniture Class:");
		boolean passed = true;
		for (int i = 0; i < furniture.length; ++i) {
			System.out.printf(
					"  EXPECTED: %s\n  ACTUAL: %s\n", FURNITURE_TO_STRINGS[i], furniture[i]);
			passed = passed && FURNITURE_TO_STRINGS[i].equals(furniture[i].toString());
		}
		System.out.printf("  %s\n", passed ? "PASSED!" : "FAILED");
		return passed;
	}
	
	
	private static Furniture[] buildFurniture() {
		Furniture[] furniture = new Furniture[PRODUCT_IDS.length];
		
		for (int i = 0; i < furniture.length; ++i) {
			furniture[i]
				= new Furniture(PRODUCT_IDS[i], FURNITURE_NAMES[i], PRODUCT_PRICES[i],
						FURNITURE_DIMS[i], FURNITURE_WEIGHTS[i], FURNITURE_MATS[i],
						FURNITURE_LOCATIONS[i]);
		}
		
		return furniture;
	}

}
