package basic.exercise.toy;

import java.util.Random;

// 클래스 -인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구조건
// 배열을 활용해서 객체들을 담아 주세요

public class ToyMachine {
	int power;
	int height;
	static int coin;
	Product product;
	ToyMachineTest toyMachineTest;
	Random random = new Random();

	public ToyMachine() {
		toyMachineTest = new ToyMachineTest();
		product = new Product();
	}

}
