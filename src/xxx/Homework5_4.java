package xxx;

public class Homework5_4 {
	public static void main(String[] args) {
		HomeWork05_04_MyRectangle m1 = new HomeWork05_04_MyRectangle();
		m1.setDepth(20);
		m1.setWidth(10);
		System.out.println("m1 = "+m1.getArea());
		
		HomeWork05_04_MyRectangle m2 = new HomeWork05_04_MyRectangle(10,20);
		System.out.println("m2 = "+m2.getArea());

	}

}