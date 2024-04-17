package basic.ch03;
/*
 * 부호 연산자
 * 단항 연산자 --> 변수에 부호를 변경(리털값에 부호를 변경)
 * */
public class Operation {

	public static void main(String[] args) {

		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println("---------------");
		System.out.println(intData);
		// 반드시 기억 -> (부호 연산자는 변수에 실제 값이 변경 되는 것은 아니다)
		
		// 메모리 공간 안에 실제 값을 변경 하려면 어떻게 해야 할까?
		// 답은 --> 대입 연산자와 함께 사용해야 한다.
		
		intData = -intData;
		System.out.println("실제 변수안에 들어있는 값 :"+intData);
		
		// 연습문제
		int oneStepDistance = 1;
		final int ZERO_POINT = 0; // 상수를 사용할때는 대문자를 권장 한다.
		int currentPosition = 0;
		
		// 제로 포인트에서 왼쪽으로 3칸 이동한 값을 출력하시오
		// 식
		currentPosition = ZERO_POINT -(3* oneStepDistance);
		
		// 결과
		System.out.println(currentPosition);
		
		// 절대값이란?
		// 절대값이란 어떤 수의 크기를 나타내는 것으로 그 수가 0에서 얼마나 떨어져
		// 있는지를 표시합니다.
		// 즉, 어떤 수의 절대값은 그 수가 양수이든 음수이든 상관없이 항상 양수 입니다.
		// 0의 절대값은 0입니다.
		
		// currentPosition 값이 양수 였다면 부호연산자를 통해 변경하고
		// 절대값이 틀려지게 된다.
		System.out.println(-currentPosition);
		
		// 우리는 절대값을 구하는 알고리즘 만들어야 한다.
		
		// 자바 개발자들이 이미 만들어둔 도구 이다.
//		Math math; // 수학과 관련된 기능들에 모음,
		System.out.println("math 라이브러리 사용 : "+Math.abs(currentPosition));
	}// out of main

}// out of class
