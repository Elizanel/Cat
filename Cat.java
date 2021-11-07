
public class Cat {
	
	private String color;
	private String breed;
	private double weight;
	
	public Cat(String co, String br, double we) {
		color = co;
		breed = br;
		weight = we;
	}
	
	// default constructor
	public Cat() {
		color = "orange";
		breed = "siamese";
		weight = 13;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String toString() {
		return "color: " + color + " breed: " + breed;
	}
	
	
}
