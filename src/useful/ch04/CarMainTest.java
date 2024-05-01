package useful.ch04;

public class CarMainTest {

	public static void main(String[] args) {
		
		Car aiCar =new AiCar();// 다형성, 업캐스팅
		// 프로그램 실행시키기ㅣ위해서 run() 메서드를 호출해야한다 -약속
		aiCar.run();
		
		System.out.println("------------");
		
		Car manualCar = new ManualCar();
		manualCar.run();

	}//main

}//class
