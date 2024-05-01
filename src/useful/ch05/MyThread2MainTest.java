package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자
	public static void main(String[] args) {
		System.out.println("main start");

		MyThread2 mythread2 = new MyThread2();
//		mythread2.run(); 일반 메서드 호출임 -> 작업자에게 멀티쓰레드 호출이아님
		// 새로운 작업자를 생성해서 위임 시킬때는 Thread
		// 안에 있는 start() 메서드를 호출 해야 한다.

//		new Thread(mythread2).start(); 일회용 선언으로 
		Thread thread1 = new Thread(mythread2);
		thread1.start();
		System.out.println(Thread.currentThread());
		// 문제 mythread2를 메모리에 올리고
		// 그안에 정의된 run() 메서드를 호출 하시오
		// 힌트 --> Thread 문서를 반드시 확인 하시오

	}
}
