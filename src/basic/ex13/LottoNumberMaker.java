package basic.ex13;

import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";

	// 함수
	public static void main(String[] args) {

		makeNumber();
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");

	}// end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!.
//		System.out.println("ver : "+ version);
		// 자바 도구 --표준 API
		// 난수 발생기 -> 랜덤적인 값 생성
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1;
		return resultNumber;// 0~~ 44

	}

}
