package useful.ch03;

import java.util.Scanner;

public class NicknameTest {

	public static void main(String[] args) {
		Nickname nickname = new Nickname();
		String inPut = null;
		Scanner sc = new Scanner(System.in);
		inPut = "가발aB";
//		inPut = "가";
		String inPut2 = sc.nextLine();
//		System.out.println("닉네임입력");

		try {
			nickname.setNick(inPut2);
		} catch (NicknameException e) {
			System.out.println("닉네임규정에 문제발생");
		} catch (Exception e) {
			System.out.println("예외 발생" + e.getMessage());
		}

	}
}
