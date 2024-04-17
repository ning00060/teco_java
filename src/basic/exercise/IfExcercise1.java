package basic.exercise;

public class IfExcercise1 {

	// 코드으 ㅣ시작점
	public static void main(String[] args) {

		// 정수값 입력 받기 활용해서 코드에 흐름을 만들어 주세요

		// 조건문을 완성하세요
		// 90 점 이상 -> A학점입니다.
		// 80 점 이상 -> B학점입니다.
		// 70 점 이상 -> C학점입니다.
		// 60 점 이상 -> D학점입니다.
		// 59 점 이상 -> F학점입니다.
		int result = 100;

		if (result < 89) {
			System.out.println("B학점입니다.");
		} else if (result < 79) {
			System.out.println("B학점입니다.");
		} else if (result < 69) {
			System.out.println("C학점입니다.");
		} else if (result < 59) {
			System.out.println("E학점입니다.");
		} else {
			System.out.println("A학점입니다.");
		}

	}// end of main
}// end of class
