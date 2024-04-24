package basic.ch19;

public class Classroom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDEND = 30;

	public Classroom(String className) {
		this.className = className;
		students = new Student[MAX_STUDEND];
		this.studentCount = 0;
	}

	// 학생을 추가하는 메서드 만들기
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDEND) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}

	}

	// 학습에 속한 모든 학생 정보를 출력하는 기능을 만드시오
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("====학생정보======");
				// students[i] --> [객체주소] --> heap 영역 객체
				System.out.println("학생이름" + students[i].getName());
				System.out.println("학생나이" + students[i].getAge());
			}
		}
	}
}
