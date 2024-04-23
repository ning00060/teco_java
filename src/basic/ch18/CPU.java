package basic.ch18;

public class CPU {
	String name;
	int price;
	int weight;
	int percent;

	Computer computer;
	Monitor monitor;
	Ram ram;

	void start() {
		System.out.println("CPU구동시작합니다");
		
	}
	void loading(int percent) {
		this.percent=percent;
		for(percent=0;percent<101;) {
			percent+=5;
			if(percent==50) {
				System.out.println("cpu50%");
			}
			if(percent==100) {
				System.out.println("cpu준비완료");
			}
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void stop() {
		System.out.println("CPU구동이정지됩니다");
	}
}
