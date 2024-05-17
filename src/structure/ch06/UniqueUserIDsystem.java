package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDsystem {

	private HashSet<String> userIDs;

	public UniqueUserIDsystem() {
		this.userIDs = new HashSet<String>();

	}

	// 사용자 ID등록
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}

	// 시스템 실행
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("이름을 작성해주세요");
			String input = scanner.nextLine();
			if ("end".equals(input)) {
				System.out.println("종료합니다");
				break;
			}

			if (registerUserID(input) == true) {

				System.out.println("유저 등록 되었습니다");

			} else {
				System.out.println("이미 등록 된 유저입니다");
				System.out.println("수정하려면 1번");
				int numInput = scanner.nextInt();

				System.out.println("1번누름");

				if (numInput == 1) {
					System.out.println("바꿀이름을 적어주세요");
					String input2 = scanner.nextLine();
					for (String string : userIDs) {
						if (input == string) {
							System.out.println("ㅇㅇㅇㅇ");
							input2 = string;
							System.out.println(string);
						}
					}
				}

			}
		}
		System.out.println("등록된 유저: " + userIDs);
		scanner.close();
		// 동작 -스캐너활용
		// 실행 흐름 만들기 -->while,if
		// 결과 정상 유저 등록
		// --> 이미 등록된 사용자 입니다.
	}

	public static void main(String[] args) {
		UniqueUserIDsystem system = new UniqueUserIDsystem();
		system.run();

	}
}
