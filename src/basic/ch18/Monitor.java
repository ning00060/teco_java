package basic.ch18;

public class Monitor {
	String name;
	int price;
	int weight;
	Computer computer;
	CPU cpu;
	Ram ram;

	void startscreen() {
		System.out.println("화면이 작동합니다");
	}

	void stopscreen() {
		System.out.println("화면이 꺼집니다");
	}
}
