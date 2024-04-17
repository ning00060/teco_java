package basic.exercise;

public class exercise1 {
	
	// 코드의 시작점(main 함수)
	public static void main(String[] args) {
		// 1. 데이터 10,100,100 변수를 여러분들이 이름을 정해서 선언
		// 선언하고 동시에 초기화 후 화면에 출력
		int x = 10; // 변수에 선언과 동시에 초기화(값을 넣다)
		int y = 100;
		int z = 100;
		 
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// 2. int ageBox 상자에 20을 담기
		int ageBox;
		ageBox = 20;
		
		// 2-1 ageBox 상자의 값을 30으로 변경하고 기존에
		// 담겨있던 데이터를 다른 곳으로옮기기
		int oldBox = ageBox;
		ageBox = 30;
		// 아까있던 녀석은 어떻게 찾아 오지?
		System.out.println("ageBox : "+ageBox);
		System.out.println("oldBox : "+oldBox);
		
		// 3. int a = 1; int b = 3;
		int a = 1;
		int b = 3;
		// 값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서
		// 넣어 두면 된다.
		int temp= a ;
		a = b;
		b = temp;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		//선언하고 a 와 b 에 담겨있는 값을 서로 스위칭
	}//end of main
}//end of class
