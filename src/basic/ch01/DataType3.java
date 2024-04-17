package basic.ch01;

public class DataType3 {
	
	// 메인 함수 -코드의 시작점
	public static void main(String[] args) {
		
		//기본데이터 타입
		// 참조 타입
		
		// 기본 데이터 타입 -실수형
		//float, double
		
		float floatBox1 = 0.5f; // 4바이트 , F(대,소 구분 x )
		float floatBox2 = 0.5f; //  F 는 접미사->기본형이 double 이라 접미사 필요
		
		double doubleBox1 = 0.123;
		double doubleBox2 = 1.12345678;
		// double 8바이트 크기
		// 소수점을 더 많이 표현할 수 있기 때문에 값에 정확도를 높일 수 있다.
		
		// 콘솔창 결과 출력
		System.out.println(floatBox1);
		System.out.println(floatBox2);
		System.out.println(doubleBox1);
		System.out.println(doubleBox2);
		
		System.out.println(0.5f);
		System.out.println(0.10d);
		
	}

}
