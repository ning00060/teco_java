
package basic.exercise;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 스캐너 라이브러리
		System.out.println("성적을 입력하세요 (0-100): "); // 성적입력 명령어
		int score = scanner.nextInt();
		System.out.println("점수:" + score + "점"); // 점수체크 출력
		if (score < 0) {
			System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요");// 0점미만
		} else if (score > 100) {
			System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요");// 100점초과
		} else if (score < 60) {
			char grade = 'F';
			String message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";// 60점미만
			System.out.println(grade + "학점(불합격):" + message);
		} else if (score < 70 && score >= 60) {
			char grade = 'D';
			String message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요";// 60이상 70미만
			System.out.println(grade + "학점:" + message);
		} else if (score < 80 && score >= 70) {
			char grade = 'C';
			String message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다."; // 70이상 80미만
			System.out.println(grade + "학점:" + message);
		} else if (score < 90 && score >= 80) {
			char grade = 'B'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
			String message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!"; // 80이상 90미만
			System.out.println(grade + "학점:" + message);
		} else {
			char grade = 'A'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
			String message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
			System.out.println(grade + "학점:" + message); // 90이상
		}
		// ctrl+shift+F의 생활화
		// .. 코드를 작성해주세요
		// 힌트 - 비교 연산자와 논리연사자를 활용
		// ...
		scanner.close(); // 자원 닫기

	} // end of main

} // end of class
