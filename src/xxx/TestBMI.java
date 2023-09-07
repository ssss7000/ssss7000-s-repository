package xxx;

public class TestBMI {
	
	public static void main(String[] args) {
		// step 1: 建立身高/體重資料
		double height = 1.8, weight = 63; 
		
		// step 2: 算出BMI並顯示出來
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi);
		// step 3: 顯示結果
		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi >= 24) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}
		
		
	}

}
