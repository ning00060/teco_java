package basic.ch12;

public class Student {
	private int id;
	private int idnum;
	public static int numbers;

	// 생성자
	public Student(int id, int idnum) {
		this.id = id;
		this.idnum = idnum;
		numbers = 1;

	}

	// 기능-학번숫자가 높아짐
	public void numberCreate() {
		System.out.println(id + "학번의 " + idnum + "학과학생" + "번호는" + (idnum+numbers)+numbers + " 입니다");
		numbers++;
	}

	// 학생마다 새로운 학번 을 만든다
}
