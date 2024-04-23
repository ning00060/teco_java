package basic.ch17;

public class Cal {

	public Cal() {
		System.out.println("Cal() 부모 생성자 호출");
	}
	
	public int sum(int n1, int n2) {
		return n1+ n2;
	}
	
	public int multiply(int n1, int n2) {
		System.out.println("2.호출");
		System.out.println("여기는 부모 클래스 메서드 입니다");
		return n1 * n2;
	}
	
	//코드 ㅔㅌ스트
	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 3));
		System.out.println(cal2.multiply(10, 01));
	}
	
}

class Cal2 extends Cal {
	
	public Cal2() {
		System.out.println("cal2() 자식 생성자 호출");
	}
	
	
	public int minus(int n1, int n2) {

		return n1 - n2;
		
	}
	
	// 부모 코드의 기능을 변경하고 싶다면 --> 재정의 하고싶다면
	// 오버라이드 처리 한다.
	// a 또는 b --> 논리 연산자 --> 논리 합 --> 둘중에 하나라도 true 라면 --> true이다
	// a 그리고 b --> 논리 연산자 --> 논리 곱 --> 전부 true이여야 -->true 이다
//	public int multiply(int n1, int n2) {
//		if(n1 == 0|| n2==0) {
//			System.out.println("0 을 입력 하지 마시오");
//		}
//		System.out.println("자식 클래스에서 호출된 multiply 메서드");
//		return n1 * n2;
//	}
	
	@Override // <-애노테이션,어노테이션 --> 주석 + 힌트
	public int multiply(int n1, int n2) {
		System.out.println("1.호출");
		return super.multiply(n1, n2);
	}
	
}