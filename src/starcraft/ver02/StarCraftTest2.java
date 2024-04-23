package starcraft.ver02;

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;

		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(2);

		Zealot zealot1 = gateway1.createZealot("질럿1");
		Zealot zealot2 = gateway1.createZealot("질럿2");
		System.out.println(gateway1.getGateWayNumber() + " : " + gateway1.getCount());
		System.out.println(gateway2.getGateWayNumber() + " : " + gateway2.getCount());
		System.out.println("--------------");

		Barrack barrack1 = new Barrack(1);
		Barrack barrack2 = new Barrack(2);

		Marine marine1 = barrack1.buildMarine("마린1");
		Marine marine2 = barrack2.buildMarine("마린2");
		System.out.println(barrack1.getBarrackNumber() + "(배럭명)" + barrack1.getCount() + "(생성수)");
		System.out.println(barrack2.getBarrackNumber() + "(배럭명)" + barrack2.getCount() + "(생성수)");
		System.out.println("==마린====");

		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(2);

		Zergling zergling1 = hatchery2.BuildZergling("저글1");
		Zergling zergling2 = hatchery2.BuildZergling("저글2");

		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
			unitChoice = sc.nextInt();

			if (unitChoice == ZEALOT) {

			} else if (unitChoice == MARINE) {

			} else if (unitChoice == ZERGLING) {

			} else {
				System.out.println("프로그램을 종료 합니다");
				unitChoice = GAME_END;
			}

		} while (unitChoice != GAME_END);

		// while <-- , do while
		// while --> 조건식을 확인하고 코드를 수행하는 녀석
		// do while --> 무조건 한번은 수행을 하고 다시 조건을 확인하는 녀석

	}

}
