package basic.ch06;

//자바의 모든 코드는 cllass XXX {} 블로안에 코드를 작성하기로 되어 있다.

public class FunctionMainTest1 {

	// 메인 함수 : void- 텅빈( 리턴값이 없다)
	public static void main(String[] args) {

		System.out.println("여기 메인 함수를 시작합니다");
		int result1 =add(5, 10);
		System.out.println("result1:" + result1);

		// 성적 합을 궇나다
		int result2 =add(90, 80);
		System.out.println("result2:"+ result2);
	}// end of add(함수) -- 함수 안에 선언하는 변수는 지역 변수
		// 두 수를 받아서 덧셈하는 함수르 만들어보자.

	static int add(int n1, int n2) {
		int result; // 변수->> 지역변수
		result = n1 + n2;
		return result;

	}// end of add(함수) -- 함수 안에 선언하는 변수는 지역 변수
}// end of class

// int a; 사용못함