package basic.ch09;

import java.util.Scanner;

public class ClassMainLine {
	
	public static void main(String[] args) {
//		final int W_POWER = 10;
//		final int A_POWER = 20;

		Scanner sc = new Scanner(System.in);

//		System.out.println("직업을 선택해주세요(전사:1, 마법사:2, 궁수:3");
//		int class1= sc.nextInt();
//		String name= sc.next();
//		int hp =sc.nextInt();
//		int mp =sc.nextInt();
//		int at =sc.nextInt();
//		int de =sc.nextInt();
//		int sp =sc.nextInt();
//		Warrior warrior = new Warrior(name, hp, mp, at, de, sp);		
//		warrior.showinfo();
//		Magician magician = new Magician(name, hp, mp, at, de, sp);
//		magician.showinfo();
//		Archor archor = new Archor(name, hp, mp, at, de, sp);
//		archor.showinfo();

		System.out.println("공격자를 선택해주세요(전사:1, 마법사:2, 궁수:3)");
		int self1 = sc.nextInt();

		// 역할군 정보
		Warrior warrior = new Warrior("전사", 100, 20, 15, 30, 10);
		Magician magician = new Magician("마법사", 100, 50, 20, 10, 15);
		Archor archor = new Archor("궁수", 100, 35, 20, 10, 20);
		//

		// if-1 시작 :전사를 선택했을때
		if (self1 == 1) {//
			warrior.showinfo();// 전사의 정보

			// 공격의대상
			System.out.println("공격대상을 선택하세요- 1. 마법사  2.궁수");
			int perform = sc.nextInt();
			//

			// if1-1시작 :마법사공격횟수
			if (perform == 1) {
				System.out.println("전사가 마법사을 몇번 공격하시겠습니까");
				int intputData = sc.nextInt();

				for (int i = 0; i < intputData; i++) {
					warrior.TakeM(15, 1, magician);
					// Take 의 중간매개변수는 누적공격횟수인데 코드만 있고 만들지않음
					System.out.println();
				} // 포문의 끝
			} // if1-1 끝:마법사공격횟수

			// if1-2시작 :궁수공격횟수
			else {
				System.out.println("전사가 궁수를 몇번 공격하시겠습니까");
				int intputData = sc.nextInt();

				for (int i = 0; i < intputData; i++) {
					warrior.TakeA(15, 1, archor);
				} // 포문의 끝

			} // if1-2끝: 궁수공격횟수

		} // if-1 의 끝:전사선택

		// if-2의 시작:마법사 선택
		else if (self1 == 2) {
			magician.showinfo();// 클래스의 정보

			System.out.println("공격대상을 선택하세요- 1. 전사  2.궁수");
			int perform = sc.nextInt();// 공격대상

			// if2-1시작: 전사공격횟수
			if (perform == 1) {
				System.out.println("마법사가 전사를 몇번 공격하시겠습니까");
				int intputData = sc.nextInt();

				for (int i = 0; i < intputData; i++) {
					magician.TakeW(20, 1, warrior);
				} // 포문의 끝

			} // if 2-1끝 :전사공격횟수1

			// if2-2의 시작:궁수공격횟수2
			else {
				System.out.println("마법사가 궁수를 몇번 공격하시겠습니까");
				int intputData = sc.nextInt();

				for (int i = 0; i < intputData; i++) {
					magician.TakeA(20, 1, archor);
				} // 포문의끝

			} // if2-2의 끝:궁수 공격 횟수

		} // if2의 끝:마법사 선택

		// if-3의 시작:궁수 선택
		else {
			archor.showinfo(); // 클래스정보

			System.out.println("공격대상을 선택하세요- 1. 전사  2.마법사");
			int perform = sc.nextInt(); // 공격대상

			// if3-1의 시작:전사공격 횟수
			if (perform == 1) {
				System.out.println("궁수가 전사를 몇번 공격하시겠습니까");
				int intputData = sc.nextInt();

				for (int i = 0; i < intputData; i++) {
					archor.TakeW(20, 1, warrior);
				} // 포문의끝

			} // if3-1의 끝:전사공격 횟수

			// if3-2의 시작:마법사공격 횟수
			else {
				System.out.println("궁수가 마법사를 몇번 공격하시겠습니까");
				int intputData = sc.nextInt();

				for (int i = 0; i < intputData; i++) {
					archor.TakeM(20, 1, magician);
				} // 포문의끝
				
			} // if3-2의 끝:마법사공격 횟수

		} // if3의 끝:궁수 선택

	}// 메인의 끝

}// 클래스의 끝
