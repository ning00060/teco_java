package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에 3의 배수를 출력 하세요

		// 1 ~ 100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요
		// 반복문은 while 을 사용해 주세요
		// ctrl +shift +f -> 생활화
		int i = 1;

		while (i < 101) {// start of while
			i++;

			if ((i % 3) == 0) {// start of if
				System.out.println("3의배수 : " + i);
			} // end of if
		} // end of while

		// 풀이 -2 : 특정 조건이 되었을 때 반복문을 멈추어라
		boolean flag = true;
		while (flag) {
			if ((i % 3) == 0) {// start of if
				System.out.println("3의배수 : " + i);
			} // end of if

			// 특정 조건 --> 멈추기
			if (i == 100) {
				flag = false;
			}
			i++; // i == 101
		}

	}// end of main

}
// end of class
