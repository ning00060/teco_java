package basic.ch09;

public class Child {
	String name;
	int money;// 소지금

	public Child(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	}

	// 성인이 버스를 탄다.
	public void takeBus(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus.take(200);
//		money = money-1500;
		money -= 200;

	}

	public void takeBus2(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus.take2(200 * 2);
//		money = money-1500;
		money -= (200 * 2);

	}

	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		// 어떻게 코드를 만들어야 할까?
		subway.take(150);
//		money = money-1500;
		money -= 150;

	}

	// 상태창을 보여 준다.
	public void showInfo() {
		System.out.println("아동 이름: " + name);
		System.out.println("아동 소지금: " + money);
	}

}
