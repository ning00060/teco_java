package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름 만들기
		// 2번을 누르면 지하철 태우는 실행에 흐름을 만들어 보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		String name1 = sc.next();

		System.out.println("성인은 1번 학생은 2번 아동은 3번");
		int age1 = sc.nextInt();

		System.out.println("버스는 1번 지하철은 2번");
		int button1 = sc.nextInt();

		if (button1 == 1) {
			System.out.println("한명 이면 1번 두명이면 2번");
			int busperson = sc.nextInt();
		}
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);

		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);

		Student s1 = new Student(name1, 100_000);
		Student s2 = new Student("티모", 100_000);

		Adult a1 = new Adult(name1, 100_000);
		Adult a2 = new Adult(name1, 100_000);

		Child c1 = new Child(name1, 5_000);
		Child c2 = new Child(name1, 5_000);
		if (age1 == 1) {
			if (button1 == 1) {
				System.out.println("한명 이면 1번 두명이면 2번");
				int busperson = sc.nextInt();
				if (busperson == 1) {
					a1.takeBus(bus1);
					a1.showInfo();
					bus1.showInfo();
				} else {
					a1.takeBus2(bus1);
					a1.showInfo();
					bus1.showInfo();
				}
			} else {
				a1.takeSubway(subway1);
				a1.showInfo();
				subway1.showInfo();
			}

		} else if (age1 == 2) {
			if (button1 == 1) {
				s1.takeBus(bus1);
				s1.showInfo();
				bus1.showInfo();
			} else {
				s1.takeSubway(subway1);
				s1.showInfo();
				subway1.showInfo();
			}

		} else {
			if (button1 == 1) {
				c1.takeBus(bus1);
				c1.showInfo();
				bus1.showInfo();
			} else {
				c1.takeSubway(subway1);
				c1.showInfo();
				subway1.showInfo();
			}

		}

		// 만약1번이라면 ~~ 만약2번이라면 ~~~ 원하는 대로 만들기

	}// end of main

}// end of class
