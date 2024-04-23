package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {
		PhoneBook[] phones = new PhoneBook[100]; // 배열에 메모리 공간 선언
		Scanner sc = new Scanner(System.in);
		phones[0] = new PhoneBook("이순신", "01012341234");
		phones[1] = new PhoneBook("강감찬", "01011112222");
		phones[2] = new PhoneBook("홍길동", "01022223333");
		phones[3] = new PhoneBook("권율", "01033334444");
		phones[4] = new PhoneBook("허준", "01044445555");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_SELECET = "3";
		final String UPDATE = "4";
		final String DELETE_ALL = "5";
		final String DELETE_SELECT = "6";
		final String END = "0";

		boolean flag = true;
		;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.선택수정 5.전체삭제 6.선택 삭제 0.프로그램 종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장하기 <<");
				save(sc, phones);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(phones);
			} else if (selectedNumber.equals(SEARCH_SELECET)) {
				System.out.println(">> 선택 조회 하기 <<");
				searchSelect(sc, phones);
			} else if (selectedNumber.equals(UPDATE)) {
				System.out.println(">>  수정 하기 <<");
				searchUpdate(sc, phones);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deleteAll(phones);
			} else if (selectedNumber.equals(DELETE_SELECT)) {
				System.out.println(">> 선택 삭제 하기 <<");
				deleteSelect(sc, phones);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println("잘못된 선택 입니다");

			}
		}

	}// end of main

	public static void save(Scanner sc, PhoneBook[] phone) {
		System.out.println("----저장하기----");
		System.out.println("이름을 입력하세요");
		String createName = sc.nextLine();
		System.out.println("번호를 입력하세요");
		String createNumber = sc.nextLine();
		PhoneBook phones = new PhoneBook(createName, createNumber);

		if (LAST_INDEX_NUMBER > phone.length) {
			System.out.println("저장공간이 없습니다.");
			return;
		}
		for (int i = 0; i < phone.length; i++) {
			if (phone[i] != null) {
				phone[i] = phones;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println("저장되었습니다");
	}

	public static void readAll(PhoneBook[] phone) {
		for (int i = 0; i < phone.length; i++) {
			if (phone[i] != null) {
				System.out.println(phone[i].getName() + "," + phone[i].getNumber());
			}
		}
	}

	public static void searchSelect(Scanner sc, PhoneBook[] phone) {
		System.out.println("이름을 적어주세요");
		String searchName = sc.nextLine();
		for (int i = 0; i < phone.length; i++) {
			if (searchName.equals(phone[i].Name) && phone[i] != null) {
				System.out.println(phone[i].getName() + "의 번호는" + phone[i].getNumber() + "입니다");
				break;
			} else {
				System.out.println("찾을수 없는 이름입니다");
				return;

			}
		}
	}

	public static void deleteAll(PhoneBook[] phone) {
		for (int i = 0; i < phone.length; i++) {
			phone[i] = null;
		}
		System.out.println("전체 삭제 되었습니다");
	}

	public static void deleteSelect(Scanner sc, PhoneBook[] phone) {
		System.out.println("이름을 적어주세요");
		String searchName = sc.nextLine();
		for (int i = 0; i < phone.length; i++) {
			if (phone[i] != null) { // 논리곱으로 사용도 가능
				if (searchName.equals(phone[i].Name)) {
					phone[i] = null;
					System.out.println("삭제되었습니다");

					break;
				} else {
					System.out.println("찾을수 없는 이름입니다");
					return;
				}
			}
		}

	}

	public static void searchUpdate(Scanner sc, PhoneBook[] phone) {
		System.out.println("이름을 적어주세요");
		String searchName = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < phone.length; i++) {
//			searchName.equals(phone[i].getName()) && phone[i] != null
			//
			// phone[i].getName() <---- null Poiner
			// 1 --> phone[i].getName() --> ok
			// ------------
			// phone[i].getName() --> error
			if (phone[i] != null && searchName.equals(phone[i].getName())) {
				System.out.println("수정할 번호를 입력하세요");
				String createNumber = sc.nextLine();

				phone[i].setNumber(createNumber);

				System.out.println(phone[i].getName() + "의 번호가:" + phone[i].getNumber() + "수정되었습니다.");
				isFind = true;
				break;

			}
		}

		if (isFind == false) {
			System.out.println("잘못됐습니다");
		}
	}

}// end of class
