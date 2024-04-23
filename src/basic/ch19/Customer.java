package basic.ch19;

public class Customer {

	private String name;

	public Customer(String name) {
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// 은행 서비스를 이용하는 메서드 - 연관 관계
	public void useBankService(Bank bank) {
		bank.provideSerice(ServiceType.DEPOSIT, this);

	}

}
