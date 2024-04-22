package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터

		// 배열에 특징
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3];
		int intBoxes[] = new int[5];

		// 값 넣기 (초기화)
		// 배열에 길이 ->3
		// 인덱스에 길이 -> 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;

//		numbers[3] = 1003; --> 인덱스으 ㅣ길이를 벗어남났음,오류발생
		// 사전기반 지식 -> 모든 프로그래밍에 인뎃스 번호에 시작은 0부터

		// 배열에 선언과 동시에 초기화
		int[] grades = new int[3];
		int[] grades2 = { 5, 3, 1 }; // new int[] 생략 가능하다

		// 문제 1
		// 5개의 크기를 가지는 double 타입의 배열을 선언 하시오
		// 단, 배열에 이름은 마음대로 작성하세요.
		double[] arrayDouble1 = new double[5];

		// 문제 2
		// 위에서 선언한 배열에 값을 인ㄷ게스 0~2까지 초기화 하시오
		// 값은 아무거나 상관 없음
		arrayDouble1[0] = 0.5;
		arrayDouble1[1] = 1.0;
		arrayDouble1[2] = 2.0;

		// arrayDouble1[4]= 0.0; 값을 안넣으면 0
		// arrayDouble1[5]= 0.0;

		// 문제 3
		// String 타입에 배열을 선언,배열으 ㅣ크기는 3개,
		// 선언과 동시에 초기화 하세요
		String[] arrayString1 = { "1", "2", "3" };

	}// end of main

}// end of class
