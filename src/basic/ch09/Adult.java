package basic.ch09;

public class Adult {
	String name;
	int money;// 소지금

	public Adult(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	}

	// 성인이 버스를 탄다.
	public void takeBus(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus.take(1500);
//		money = money-1500;
		money -= 1500;

	}

	public void takeBus2(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus.take2(1500 * 2);
//		money = money-1500;
		money -= (1500 * 2);

	}

	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		// 어떻게 코드를 만들어야 할까?
		subway.take(1100);
//		money = money-1500;
		money -= 1100;

	}

	// 상태창을 보여 준다.
	public void showInfo() {
		System.out.println("성인 이름: " + name);
		System.out.println("성인 소지금: " + money);
	}

}
