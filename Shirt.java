
public class Shirt {

//vars
	private int collarSize;
	private int sleeveLength;
	private String material = "cotton";

// constructors
	public Shirt(int pCollarSize, int pSleeveLength) {
		collarSize = pCollarSize;
		sleeveLength = pSleeveLength;
	}

	public Shirt(int pCollarSize, int pSleeveLength, String pMaterial) {
		collarSize = pCollarSize;
		sleeveLength = pSleeveLength;
		material = pMaterial;
	}

// methods 
	public int getCollarSize() {
		return collarSize;
	}

	public int getSleeveLength() {
		return sleeveLength;
	}

	public String getMaterial() {
		return material;
	}
}
