package xxx;

public class Cat1 {
	private String name;
	private double weight;
	
	public Cat1() {
		super();
	}

	public Cat1(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getWeightTool() {
		System.out.println("體重計");
	}
}
