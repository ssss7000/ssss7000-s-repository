package xxx;

public class Homework9_2 {
//	熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//	錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//	3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//	以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//	大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//	已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
//	1000元,寫一個Java程式模擬匯款10次與提款10次的情
//	形。
//	• 參考範例：TestWaitNotify.java
	public static void main(String[] args) {
		Account account = new Account();
		Mother mother = new Mother(account);
		Son son = new Son(account);
		mother.start();
		son.start();
	}
}


class Account{
	private int accountMoney = 0;
	boolean end = false;
	
	synchronized public void deposit(int money) {
			for(;accountMoney >= 3000;) {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");
				System.out.println("熊大被老媽告知帳戶已經有錢!");
				try {
					if(!end) {
						wait();
					}else {
						break;
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			if(accountMoney < 3000) {
				accountMoney += money;
				System.out.println("媽媽存了" + money + "，帳戶共有:" + accountMoney);
				notify();
			}
	}
	
	synchronized public void withdraw(int money) {	
		for(;accountMoney < money;) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");
			try {
				if(!end) {
					wait();
				}else {
					break;
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	
			accountMoney -= money;
			System.out.println("熊大領了" + money + "，帳戶共有:" + accountMoney);
			if(accountMoney <= 2000) {
				System.out.println("熊大看到帳戶餘額在2000以下，要求匯款");
				notify();
				
			}
		
	}	
}

class Mother extends Thread{
	Account account;
	public Mother(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(!account.end) {
				account.deposit(2000);
			}else {
				break;
			}
		}
		account.end = true;
	}
}

class Son extends Thread{
	Account account;
	public Son(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(!account.end) {
				account.withdraw(1000);
			}else {
				break;
			}
		}
		account.end = true;
	}
}
