package basic.ch03;


/**
 * 빠른 평가란?
 * 논리 연산에 있어 첫 번째 조건이 결과를 결정할 때 
 * 두 번째 조건을 평가 하지 않는  것을 의미한다.
 *
 */
public class Operation7 {

	public static void main(String[] args) {
		
		int number = 5;
		int index = 0;
		
		// 빠른 평가가 동작하는 식을 만들어 보자.
		//  										F
		//					15						<10
		boolean result = ( (number = number + 10) < 10) && ( (index = index + 2) <10 );
		System.out.println("현재 number 변수에 값은 :"+number);
		System.out.println("현재 index 변수에 값은 :"+index);
		System.out.println(result);
		System.out.println("----------------");
		
		// number 값 재 설정
		number = 5;
		// 논리합을 이용한 빠른 평가 식을 만들어 보자.
		
		// 					F			  ||		T
		result = (  (number += 10) < 10 ) || (  (index += 2) < 10 );
		
		// 문제
		
		System.out.println("1 number : "+ number);
		System.out.println("1 index : "+ index);
		
		// 도전 문제 number와 index 반대로 변경 해서 출력해보자
		
		result = (  (index += 2) < 10 ) || (  (number += 10) < 10 );
		
		System.out.println("2 number : "+ number);
		System.out.println("2 index : "+ index);		
		result = (  (index += 2) < 10 ) || (  (number += 10) < 10 );
		
		System.out.println("3 number : "+ number);
		System.out.println("3 index : "+ index);		
		result = (  (index += 2) < 10 ) || (  (number += 10) < 10 );
		
		System.out.println("4 number : "+ number);
		System.out.println("4 index : "+ index);
		
		// 빠른 평가가 진행이 안되었다 -- 그래서 두번째 식이 동작 했었다. 
		// -> 논리 합은 논리 곱과는 반대로 T로 이어지다가 F로 되면 그뒤 연산과정이 있을경우
		// 그 수식을 연산한다.
		//              10 < 10         ||       25  = 15 + 10              
		result = (  (index += 2) < 10 ) || (  (number += 10) < 10 );
		
		System.out.println("5 number : "+ number);
		System.out.println("5 index : "+ index);		
	} // end of main
	
} // end of class
