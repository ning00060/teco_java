package basic.ch23;

public class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		// 객체가 될 때 맨 처음 동작하는 코드는 새엇ㅇ자이다
		this.account = account;
	}

	// 위임 시킬 일을 정의 할 예정
	@Override
	public void run() {
		account.saveMoney(10000);
	}

}
