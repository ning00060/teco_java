package useful.ch04;

public class AiCar extends Car {

	@Override
	void drive() {
		System.out.println("AI car 자율 주행을 합니다");
		System.out.println("스스로 방향을 바꿉니다 ");
		
	}

	@Override
	void stop() {
		System.out.println("자동으로 자동차를 멈춥니다");
		System.out.println("위험을 감지해서 스스로 멈춥니다");
		
	}
	

}
