package basic.ch08;

public class StudentMainTest {

	// 메인의 시작점
	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 101, 3);// 객체
//		System.out.println(s1); //주소값이 출력 된다.
//		s1.showInfo();

		// 연습문제
		// s2참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요
		Student s2 = new Student("이순신", 100, 1);
//		s2.showInfo();

		// 변수에 직접 접근해서 값을 초기화 해보세요.
		Student s3 = new Student();// 기본생성자로 메모리 올림
		s3.name = "dd";
		s3.number = 1;
		s3.grade = 1;
		s3.showInfo();

		// 생성자를 여러개 만들어 줄 수있다.
		// 생성자 오버로딩 이라고 한다.
	}// end of main

}// end of class
