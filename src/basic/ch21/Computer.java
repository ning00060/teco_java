package basic.ch21;

public abstract class Computer {

	public void turnOn() {
		System.out.println("작동시킵니다");
	}

	public void turnOff() {
		System.out.println("작동정지합니다");
	}

	public abstract void display();

	public abstract void typing();
}
