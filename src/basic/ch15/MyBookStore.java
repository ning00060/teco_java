package basic.ch15;
/*
 * author -김근호
 *  모든 프로그래밍의기본은 CRUD 이다
 * 
 * */

import java.util.Scanner;

public class MyBookStore {
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열 선업
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램 종료");
			// 문자열 + 다음줄로 이동 처리
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장하기 <<");
				save(sc, books);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByTtile(sc, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println("잘못된 선택 입니다");

			}
		}
	}// end of main

	// 함수에 활용
	public static void readAll(Book[] books) {
		System.out.println("-----전체 조회 -----");
//		if(books.length <=0) {
//			System.out.println("책이 하나도 없습니다");	
//		}
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());

			}
		}
	}

	public static void deleteAll(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
			System.out.println(" 전체 삭제 되었습니다");
		}
	}

	// 저장하기 (하나의 북 객체를 저장)
	public static void save(Scanner sc, Book[] books) {
		System.out.println("------저장하기-------");
		System.out.println(" 책의 제목을 입력 하세요");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력 하세요");
		String bookAuthor = sc.nextLine();

		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다");
			return;
		}

		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해 보자
				break;
			}
		}
		System.out.println("책이 저장 되었습니다");
	}

	// 사용자가 입력한 책 제목
	// books 전부 조사 books[0] --> 객체 --> 객체.getTitle()
	// 문자열 --> eqauls
	// books[0].getTitle().equals(0 // 배열안에 객체가 없다면 --> null pointer -->방어적코드
	public static void readByTtile(Scanner sc, Book[] books) {
		System.out.println("---- 선택 조회 하기------");
		System.out.println(">> 책 제목을 입력 해주세요 <<");
		String bookTtile = sc.nextLine();
		boolean isFind = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 논리곱으로 사용도 가능
				if (bookTtile.equals(books[i].getTitle())) {
					books[i].showinfo();
//					isFind= true;
					break;
				}
				// 만약 선택된 값이 없다면
				// 해당 제목에 책은 존재하지 않습니다.
				// if(isFind ==false){
//				 System.out.println("해당책은 존재 하지안스빈다.");}
			}

			// 만약 사용자가 입력한 책 제목과 배열 요소안에 title 값이
			// 같다면 화면에 책 제목, 책저자 이름을 출력하고
			// 아니ㅏ면 '해당책이없습니다. 문구를 출력하시오'

			// 심화 --반복문을 전부 돌리면안됩니다

		}
		if (isFind == false) {
			System.out.println("해당책이없습니다");
			return;
		}
	}

}// end of class
