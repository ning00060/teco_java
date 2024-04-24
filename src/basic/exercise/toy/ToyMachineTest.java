package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

import basic.ch20.Banana;

public class ToyMachineTest {

	public static void main(String[] args) {
		Random random = new Random();
		final String QUANTITY = "1";
		final String INFO = "2";
		final String START = "3";
		final String END = "0";
		Product product1 = new Product();
		Scanner sc = new Scanner(System.in);
		Product[] product = new Product[10];
		Airpod airpod1 = new Airpod();
//				Airpod airpod2= new Airpod();
		Lion lion1 = new Lion();
//				Lion lion2= new Lion();
		Bear bear1 = new Bear();
//				Bear bear2 =new Bear();
		ToyMachine toy1 = new ToyMachine();
		ToyMachineTest toy2 = new ToyMachineTest();
		boolean flag = true;
		product[0] = airpod1;
//				product[1]=airpod2;
		product[2] = lion1;
//				product[3]=lion2;
		product[4] = bear1;
//				product[5]=bear2;
//		product1.catchs();
		System.out.println("금액을 입력해주세요");
		toy2.playgame(sc);
		while (flag) {
			System.out.println("1. 매물 확인하기 2.매물 정보 보기 3.뽑기 0.종료");
			String selectedNumber = sc.next();

			if (selectedNumber.equals(QUANTITY)) {
				System.out.println(">> 매물 확인하기(에어팟 ,사자인형,곰인형) <<");
				for (int i = 0; i < 5;) {
					if (product[i] instanceof Airpod) {
						System.out.println(((Airpod) product[i]).quantity);
					} else if (product[i] instanceof Lion) {
						System.out.println(((Lion) product[i]).quantity);
					} else {
						System.out.println(((Bear) product[i]).quantity);
					}
					i += 2;
				}
			} else if (selectedNumber.equals(INFO)) {
				System.out.println(">> 매물 정보 보기 <<");
				((Airpod) airpod1).showinfo();
				System.out.println("-----------");
				((Lion) lion1).showinfo();
				System.out.println("-----------");
				((Bear) bear1).showinfo();
			} else if (selectedNumber.equals(START)) {
				System.out.println(">> 뽑기 <<");
//				Product.catchs();
				airpod1.getPercent();
				lion1.getPercent();
				bear1.getPercent();
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println("잘못된 선택 입니다");
			}
//			((Airpod) product[0]).getPercent();
		}

	}// end of main

	public void playgame(Scanner sc) {

		int putMoney = sc.nextInt();
		int i = putMoney;
		if (i <= 3000 || i > 999) {
			ToyMachine.coin = 1;
			System.out.println("1코인 충전되었습니다");
		} else if (i > 3000 && i <= 6000) {
			ToyMachine.coin = 2;
			System.out.println("2코인 충전되었습니다");
		} else {
			ToyMachine.coin = 3;
			System.out.println("3코인충전되었습니다");
		}
	}

}// out of class
