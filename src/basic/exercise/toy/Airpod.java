package basic.exercise.toy;

import java.util.Random;

public class Airpod extends Product {
	Random random = new Random();

	public Airpod() {
		name = "에어팟";
		price = 160_000;
		weight = 100;
		quantity = 7;
	}

	public void getPercent() {
		if (Product.catchs() == 0) {

			if (quantity == 1) {
				System.out.println("10프로성공 확률입니다");
				int percent = random.nextInt(9);
				if (percent == 0) {
					getAir();
				} else {
					failAir();
				}
			} else if (quantity == 2) {
				System.out.println("20프로성공 확률입니다");
				int percent = random.nextInt(4);
				if (percent == 0) {
					getAir();
				} else {
					failAir();
				}
			} else if (quantity == 3) {
				System.out.println("30프로성공 확률입니다");
				int percent = random.nextInt(9);
				if (percent == 0 || percent == 1 || percent == 2) {
					getAir();
				} else {
					failAir();
				}
			} else if (quantity == 4) {
				System.out.println("40프로성공 확률입니다");
				int percent = random.nextInt(4);
				if (percent == 0 || percent == 1) {
					getAir();
				} else {
					failAir();
				}
			} else if (quantity >= 5) {
				System.out.println("50프로이상성공 확률입니다");
				int percent = random.nextInt(1);
				if (percent == 0) {
					getAir();
				} else {
					failAir();
				}
			} else {
				System.out.println("성공확률이 없습니다");
			}
		}
	}

	public void getAir() {
		System.out.println("에어팟 뽑기에 성공했습니다");
		quantity--;
	}

	public void failAir() {
		System.out.println("에어팟 뽑기에 실패했습니다");
	}

}
