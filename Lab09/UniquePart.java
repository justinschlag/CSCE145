// Copyright CSCE145H FA24
//
// Do not modify this file. I will use my own version for testing.


/**
 * Make sure your parent (Part) and child (Engine) correctly interface
 * with this file.
 */
public class UniquePart extends Part {

	public UniquePart(int id, String partNo, double price, String uuid) {
		super(id, partNo, price);
		
		this.uuid = uuid;
	}
	
	
	public String toString() {
		return super.toString() + ", " + uuid;
	}

	private String uuid;  // a unique id
}
