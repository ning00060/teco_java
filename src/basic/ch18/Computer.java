package basic.ch18;

public class Computer {
	String name;
	int price;
	int weight;

	CPU cpu;
	Monitor monitor;
	Ram ram;

	public Computer() {
		cpu = new CPU();
		monitor = new Monitor();
		ram = new Ram();
	}

	void computerStart() {
		cpu.start();
		cpu.loading(100);
		ram.startRam();
		ram.loading(100);
		System.out.println("본체가 구동됩니다");
		monitor.startscreen();
	}

	void computerStop() {
		cpu.start();
		ram.stopRam();
		System.out.println("본체가 정지합니다");
		monitor.stopscreen();
	}
}
