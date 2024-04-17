package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		// 사용자한테 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		int choice;
		int choice2;
		String info;
		// \n --> 무조건 한줄 내림
		System.out.println("\n메뉴 선택");
		System.out.println("1.등록 2. 조회 3.수정 4.삭제 0.종료");
		System.out.print("선택 : ");
		choice = sc.nextInt();

		// 만약 .. 사용자 1-->
		while (true) {
			if (choice == 0) {// 종료 페이지
				System.out.println("종료를 선택했습니다");
				break;
			} // 종료 페이지
			else if (choice == 1) { // 등록 페이지
				System.out.println("등록을 선택했습니다");
				System.out.println("\n다음 메뉴 선택");
				System.out.println("1.계정등록 2.취소 ");
				System.out.print("선택 : ");
				choice2 = sc.nextInt();
				if (choice2 == 1) {// 등록2 페이지
					System.out.println("계정등록을 선택했습니다");
					System.out.print("이름: ");
					info = sc.next();
					System.out.print("아이디: ");
					info = sc.next();
					System.out.print("비밀번호: ");
					info = sc.next(); // **로 표시되는 방법이 필요

				} else if (choice2 == 2) {
					System.out.println("취소를 선택했습니다");
					break;
				} else {
					System.out.println("다시 선택해주세요.");
				} // 등록2 페이지

			} // 등록페이지
			else if (choice == 2) {// 조회 페이지 시작
				System.out.println("조회를 선택했습니다");
				System.out.println("\n다음 메뉴 선택");
				System.out.println("1.계정조회 2.비밀번호 조회 3.취소 ");
				System.out.print("선택 : ");
				choice2 = sc.nextInt();
				if (choice2 == 1) {// 조회2 페이지 시작
					System.out.println("계정조회를 선택했습니다");
					break;
				} else if (choice2 == 2) {
					System.out.println("비밀번호 조회를 선택했습니다");
					break;
				} else if (choice2 == 3) {
					System.out.println("취소를 선택했습니다");
					break;
				} else {
					System.out.println("다시 선택해주세요.");
					System.out.println("\n다음 메뉴 선택");
					System.out.println("1.계정조회 2.비밀번호 조회 3.취소 ");
					System.out.print("선택 : ");
					choice2 = sc.nextInt();
				} // 조회2 페이지끝
			} // 조회 페이지끝
			else if (choice == 3) {
				System.out.println("수정을 선택했습니다");
				System.out.println("\n다음 메뉴 선택");
				System.out.println("1.비밀번호수정 2.회원정보 수정 3.취소 ");
				System.out.print("선택 : ");
				choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.println("비밀번호수정을 선택했습니다");
					break;
				} else if (choice2 == 2) {
					System.out.println("회원정보 수정을  선택했습니다");
					break;
				} else if (choice2 == 3) {
					System.out.println("취소를 선택했습니다");
					break;
				} else {
					System.out.println("다시 선택해주세요.");
					System.out.println("\n다음 메뉴 선택");
					System.out.println("1.비밀번호수정 2.회원정보 수정 3.취소 ");
					System.out.print("선택 : ");
					choice2 = sc.nextInt();
				}
			} else if (choice == 4) {
				System.out.println("삭제를 선택했습니다");
				System.out.println("\n다음 메뉴 선택");
				System.out.println("1.아이디 탈퇴 2.취소 ");
				System.out.print("선택 : ");
				choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.println("아이디 탈퇴를 선택했습니다");
					break;
				} else if (choice2 == 2) {
					System.out.println("취소 선택했습니다");
					break;
				} else {
					System.out.println("다시 선택해주세요.");
					System.out.println("\n다음 메뉴 선택");
					System.out.println("1.아이디 탈퇴 2.취소 ");
					System.out.print("선택 : ");
					choice2 = sc.nextInt();
				}
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
				System.out.println("\n메뉴 선택");
				System.out.println("1.등록 2. 조회 3.수정 4.삭제 0.종료");
				System.out.print("선택 : ");
				choice = sc.nextInt();
			}
		}
//		boolean flag = true; 
//		while (flag) {
//			System.out.println("\n메뉴 선택");
//			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
//			System.out.print("선택 : ");
//			choice = sc.nextInt();
//
//			if (choice == 1) {
//				System.out.println("등록을 선택했습니다.");
//			} else if (choice == 2) {
//				System.out.println("조회를 선택했습니다.");
//			} else if (choice == 3) {
//				System.out.println("수정을 선택했습니다.");
//			} else if (choice == 4) {
//				System.out.println("삭제를 선택했습니다.");
//			} else if (choice == 0) {
//				System.out.println("프로그램을 종료합니다.");
//			   break; // while 반복문을 빠져나와 프로그램 종료
//			} else {
//				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
//			}
//		}
	}// end of main

}// end of class
