package basic.ch04;

public class WhileTest2_1 {

	// 코드의 시작점(메인함수)
	public static void main(String[] args) {

		// 1 부터 5까지 덧셈 연산을 하라
		// 1 +2 +3 +4 +5
		int start = 1;// 시작값1
		int end = 5; // 5번
		int sum = 0;

		// 첫번째 반복
		// 6번째
		// 6 <= 5 --> 거짓 --> 반복문 종료

		// 특정 조건식을 만들어서 반복문을 멈추게 해야한다.
		// 만약 start 값이 10일때 종료 하라
		boolean flag = true;
		while (flag) {

			if (start == end) {
				flag = false;
				// return; // return --> 종료
				// 실행에 제어권 반납한다

			}
			// 1: 1 = 0 + 1 ==> sum : 1
			// 2: 1+ 2 ==> sum : 3
			// 3: 3+ 3 ==> sum : 6
			// 4: 6+ 4 ==> sum : 10
			// 5: 10+ 5 ==> sum : 15
			sum = sum + start;
			System.out.println("sum(" + start + "):" + sum);
			start++;// 1씩증가
		}

	}// end of main

}// end of class
