package xxx;

public class Homework9_1{
//	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//	• 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//	  Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//	• 參考範例：CounterRunnable.java
//	• 需留意主執行緒執行順序
	
	public Homework9_1() {

	}
	
	public static void main(String[] args) {
		player p1 = new player("饅頭人");
		Thread t1 = new Thread(p1);
		player p2 = new player("詹姆士");
		Thread t2 = new Thread(p2);
		System.out.println("大胃王比賽開始!!");
		t1.start();
		t2.start();
	  a:while(t1.isAlive() || t2.isAlive()) {
		  if(p1.counts == 10 && p2.counts == 10) {
			  System.out.println("大胃王比賽結束!!");
			  break;
		  }else {
			continue a;
		  }
	  	}
	}
}

class player implements Runnable {
	
	int counts = 0;
	String name;
	
	public player(String name) {
		this.name = name;
	}
	
	public void eat() {
			counts ++;
			System.out.println(name + "吃第" + counts + "碗麵");
			if(counts == 10) {
				System.out.println(name + "吃完了!");
			}
	}
	
	public void run() {
		while(counts < 10) {
			eat();
			try {
				Thread.sleep((int)(Math.random()*2501 + 500));
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}





