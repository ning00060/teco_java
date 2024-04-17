package basic.ch09;

public class Bus {
	int busNumber;
	int passengerCount;// 승객수
	int money;// 수익금

	// 강제성
	public Bus(int number) {
		// 객ㅊ ㅔ생성시에 제일 먼저 실행 되는 부분
		busNumber = number;
	}

	public void take(int pay) {
//		money = money+pay;
		money += pay;
//		passengerCount= passengerCount+ 1;
		passengerCount++;
	}

	public void take2(int pay) {
//		money = money+pay;
		money += pay;
//		passengerCount= passengerCount+ 1;
		passengerCount = passengerCount + 2;
	}

	// 현재 상황을 보여준느 기능을 만들어 보자.
	public void showInfo() {
		System.out.println("버스 번호: " + busNumber);
		System.out.println("버스 승객수: " + passengerCount);
		System.out.println("버스 수익금: " + money);
	}
}
