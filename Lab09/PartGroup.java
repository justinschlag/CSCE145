// Copyright CSCE145H FA24
//
// Do not modify this file. I will use my own version for testing.


/**
 * Make sure your parent (Part) and child (Tire) correctly interface
 * with this file.
 */
public class PartGroup extends Part {

	public PartGroup(int id, String partNo, double price, int count) {
		super(id, partNo, price);
		
		this.count = count;
	}
	
	public String toString() {
		return super.toString() + ", " + String.format("%02d", count);
	}

	private int count;
}
