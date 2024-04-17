package basic.exercise;

public class exercise2 {
	
	// 코드의 시작점(main 함수)
	public static void main(String[] args) {
		
		// 1. 정수 550 을 tecoBox1 이름으로 변수에 담아 보세요.
		int tecoBox1 ;
		tecoBox1 = 550;

		System.out.println(tecoBox1);
		// 2. 정수 22억을 tecoBox2 이름으로 변수에 담아 보세요.

		long tecoBox2 =2200000000l;
		

		System.out.println(tecoBox2);
		// 3. 문자 A를 tecoBox3 이름으로 변수에 담아 보세요.
		char tecoBox3 ='A';
		
		System.out.println(tecoBox3);
		// 4. 실수 float 타입으로 0.12345678을 tecoBox4 이름으로 변수에 담아 보세요.

		float tecoBox4 = 0.12345678f;
		
		System.out.println(tecoBox4);
		// 5. 실수 double 타입으로 200.0035을 tecoBox5 이름으로 변수에 담아 보세요.

		
		double tecoBox5 = 200.0035;
		System.out.println(tecoBox5);
		// 6. 논리 자료형 isOk 이름의 변수를 선언해 보세요.
		boolean isOk;
		
		// 7. isOk 변수에 값을 false 로 초기화 해보세요.
		isOk = false;
		
		System.out.println(isOk);
		// 8. isOk 변수에 값을 true 로 변경해 보세요.
		isOk = true;

		System.out.println(isOk);
		// 9. 변수란 무엇인지 서술해 보세요.
		// ->
		/*
		 * 변수란 임의의 값에 특정명령어를 사용해서 값을 지정하는것인데
		 * 그중 기본 데이터 타입으로 설명하자면
		 * '정수형' 을 이용할수있고 8바이트 이상으로 넘어갈시에는
		 * 값뒤에 l 을 추가해야한다
		 * '실수형'는 double 을 기본으로하며 float 값으로 할때는 f 를 넣어줘야한다 
		 * '논리형 으로는  true ,false 를 값으로 지정할수있으며
		 * boolean 으로 변수를 준다  */

		// 10. 기본 데이터 타입에 종류 8가지를 서술해 보세요.
		// 표기방법 (byte, short , ...)
		// 정수형 : 8bit -> 1byte, 16bit->2byte(short), 32bit->4byte->int기본형0,64bit->8bit(long)
		// 실수형 :float->4byte, double ->8byte (기본형)
		// 문자형 :char ->''(홑따옴표를 사용)
		// 논리형 :boolean 을 사용 -> true,false(기본형) 값 을 지정

	}//end of main
}//end of class
