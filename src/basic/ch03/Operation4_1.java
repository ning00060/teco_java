package basic.ch03;

/*
 * 관계, 비교 연산자
 * 연산의 결과 값이 무조건 true,false 반환 된다.
 * 
*/
public class Operation4_1 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 3;

		// 관계 연산자를 주어로 바라 보자
		boolean value = (num1 > num2);
		System.out.println(value);

		System.out.println(3 < 5);
		System.out.println(3 >= 10);
		System.out.println(3 <= 3);
		System.out.println(3 == 5);
		System.out.println(3 != 2);
		System.out.println("--------------");

		// ------------- 5 3
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

	}// out of main
}// out of class
