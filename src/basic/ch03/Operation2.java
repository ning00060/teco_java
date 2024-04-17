package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
//		int result4 = 5.0 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;

		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);

		// 문제
		// 1. (12+3 ) /3 값을 화면에 출력해 보세요
		// 변수명 , 데이터 유형 스스로 결정하고 식을 만들어 보세요
		int example = (12 + 3) / 3;
		System.out.println("example " + example);

		// 2.(25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을때 나머지가 0이면 짝수 1이면 홀수
		double example2 = (25.0 % 2);
		System.out.println("example2 " + example2);
		if (example2 == 1.0) {
			System.out.println("홀수");
		}
		if (example2 != 1.0) {
			System.out.println("짝수");
		}

		// 도전 문제
		// 직접 산술 연산자
		int oneStepDistance = 1;
		final int ZERO_POINT = 0; // 상수를 사용할때는 대문자를 권장 한다.
		int currentPosition = 0;

		final double COST = 59.99;
		final double SELL = 0.3;

		int discount = 0;

		int triangle_raw = 2;
		int triangle_height = 5;
		if ((triangle_raw * triangle_height) > 1) {
			currentPosition = (oneStepDistance + ZERO_POINT);
		}
		if ((triangle_raw * triangle_height) < 1) {
			currentPosition = (-oneStepDistance + ZERO_POINT);
		}
		System.out.println("조건부 currentPosition:" + currentPosition);

		if (currentPosition > 0) {
			discount = (int) (COST * SELL);
		}
		if (currentPosition < 0) {
			discount = (int) (COST / SELL);
		}

		System.out.println("가격" + discount);
		// 삼각형의 크기가 0보다 클때와 작을때 에 따라 달라지는 가격표를 구하라
	} // end of main

}// end of class
