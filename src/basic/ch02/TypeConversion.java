package basic.ch02;

/*
 * 형 변환이란?
 * 데이터 타입을 다른 타입으로 변경 하는 것
 * 자동 형변환, 강제 형변환
 * */
public class TypeConversion {
	// 코드의 시작점
	public static void main(String[] args) {
		
		int intDataBox = 100;  // 4byte
		double doubleDataBox;  // 8byte
		
		doubleDataBox = intDataBox;
		// 작은 상자에서 큰상자로 들어가는 개념이다.
		System.out.println(doubleDataBox);
		// 자동 형 변환이다.
		
		System.out.println("-----------------");
		
		
		// 그럼 강제 형 변환이란
		final double PI = 3.14159;
		
//		int intBox = PI;// 컴파일러가 작은 상자에 큰 상자로 값을 넣을 수 없어 !!.
		// 컴파일러야 괜찮으니깐 그냥 강제로 넣어.
		int intBox = (int)PI;
		System.out.println(intBox);
		// 소수점 값을 그냥 버려 버림

		
		// 연습
		double interestRate;
		int discount;
		interestRate = 15.5;
		// discount = <-- 변수에 강제 형 변환해서 값을 넣어 보자
		discount = (int)interestRate;
		
		System.out.println(discount);
		
		System.out.println((int)7.5);
		
		//1. 제품의 원래 가격과 할인율을 상수로 선언하십시오.
		//2. 할인된 가격을 계산하고, 그 결과를 정수로 형변환하여 최종 가격을 구하십시오.
		//3. 최종 가격을 출력하십시오.
	}// end of main

}// end of class
