package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {

		Order Order1 = new Order();
		Order1.title = "김밥";
		Order1.number = 2;
		Order1.address = "연제구";
		Order1.name = "김명기";

		System.out.println("품목: " + Order1.title);
		System.out.println("수량: " + Order1.number);
		System.out.println("주소: " + Order1.address);
		System.out.println("구매자명: " + Order1.name);
	}

}
