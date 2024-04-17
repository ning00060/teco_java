package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		// 중간에 멈추는 break 문
		// 소수 7이면 반복문을 멈추어라
		int i = 1;

		while (true) {// start of while
			
			// 단독 if 구문은 -수행이 될수도있고 안될수도 있다
			if ((i % 7) == 0) {// start of if
				break;
			} // end of if

			System.out.println("i의 값 :" + i);
			i++;
		} // end of while
	}// end of main

}// end of class
