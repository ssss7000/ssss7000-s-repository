package xxx;

public class Elephant extends Animal {
	private String name;

	public Elephant() {
		
	}
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	// Annotation (標註) JDK 5 : 給Java工具或框架的資訊
	@Override // 給編譯器的資訊, 讓編譯器對此方法是用override規則檢查 (安全)
	public void speak() {
		super.speak();
		System.out.println("Name is = " + name);
	}
	
	
	// 編譯成功, 但不符合override規則
	// 因為被編譯器當成overloading, 1個是speak() (Animal) 1個是speak(int data) (Elephant)
//	public void speak(int data) {
//		super.speak();
//		System.out.println("Name is = " + name);
//	}
}
