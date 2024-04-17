package basic.ch06;

//자바의 모든 코드는 cllass XXX {} 블로안에 코드를 작성하기로 되어 있다.

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		add(10, 10);
		calcSum(1, 10);
		int sum = calcSum(1, 10);
		int sum2 = calcSum(7, 200);
		System.out.println(calcSum(8, 9));
		System.out.println(calcSum(7, 200));
		System.out.println("sum: " + sum);
		System.out.println("sum2: " + sum2);
	}// end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습문제
	// 함수를 수정 -- 파라메터 정수 2개를 받을 수 있도록 설계
	// s1, s2 --> 반복
	// 1, 10 ---> 55
	// 7, 200 --> 7 + 8 + 9 ..
	static int calcSum(int s1, int s2) {
		int i;
		int sum = 0;
		for (i = s1; i <= s2; i++) {// 횟수 101번 동작 하는 녀석
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050
		}
		return sum;
	}

}// end of class
