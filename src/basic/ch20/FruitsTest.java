package basic.ch20;

public class FruitsTest {

	public static void main(String[] args) {

		// 다형성
		// 다양한 형태로 클래스(데이터 타입을) 바라 볼 수 있다.

		Fruits fruits1 = new Banana();// 업캐스팅된 상태
		Fruits fruits2 = new Peach();

		fruits1.showinfo();
		fruits2.showinfo();

		System.out.println("--------------------");
		// 다형을 사용하면 코드를 유연하게 작성 할 수 있다.
		// 배열

		Banana banana1 = new Banana();
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();

		Fruits[] fruits = new Fruits[3];
		fruits[0] = banana1;
		fruits[1] = peach1;
		fruits[2] = peach2;

		System.out.println("---------------");
		// fruits[0] --> 바나나
		// 바나나의 속성인 origin을 출력하시오
		// 바나나의 기능인 saleBanana() 메서드를 호출하시오
		((Banana) fruits[0]).saleBanana();
		System.out.println(((Banana) fruits[0]).origin);
		// 배열은 반복과 함께 많이 사용 된다.

		System.out.println("-----------------");

		// 0 --> 바나나
		// 1 --> 복숭아

		// instanceof 연산자를 알아야 해결 가능
		// instanceof -->
		// 실행시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		for (int i = 0; i < fruits.length; i++) {
			// 방어적 코드
			if (fruits[i] instanceof Banana) {
				((Banana) fruits[i]).saleBanana();
			} else {
				fruits[i].showinfo();
			}
		}

	}// end of main

}// end of class
