package basic.ch19;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank("그린은행");// 독립적ㄱ인 생명 주기를 가진다.
		Customer customer = new Customer("홍길동"); // 독립ㅈ걱인 생명 주기를 가진다.

		customer.useBankService(bank);
		System.out.println("----------------------");
		// enum type 연습
		bank.provideSerice(ServiceType.ACCOUNT_INFO, customer);
	}

}
