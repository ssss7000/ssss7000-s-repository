package xxx;

public class HomeWork05_04_MyRectangle {
	double width;
	double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		double area = 0;
		area = width * depth;
		return area;
	}

	public HomeWork05_04_MyRectangle() {

	}

	public HomeWork05_04_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
