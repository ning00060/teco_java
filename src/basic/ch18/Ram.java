package basic.ch18;

public class Ram {
	String name;
	int price;
	int weight;
	Computer computer;
	Monitor monitor;
	CPU cpu;
	int percent;

	void startRam() {
		System.out.println("램이 구동됩니다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void loading(int percent) {
		this.percent = percent;
		for (percent = 0; percent < 102;) {
			percent += 10;

			if (percent == 100) {
				System.out.println("ram준비완료");
			}
		}
	}

	void stopRam() {
		System.out.println("램이 정지합니다");
	}
}
