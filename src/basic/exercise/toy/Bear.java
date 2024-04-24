package basic.exercise.toy;

public class Bear extends Product {
	public Bear() {
		name = "곰인형";
		price = 21_000;
		weight = 880;
		quantity = 10;
	}

	public void getPercent() {
		if (Product.catchs() == 4)
			if (quantity == 1) {
				System.out.println("10프로성공 확률입니다");
				int percent = random.nextInt(9);
				if (percent == 0) {
					getBear();
				} else {
					failBear();
				}
			} else if (quantity == 2) {
				System.out.println("20프로성공 확률입니다");
				int percent = random.nextInt(4);
				if (percent == 0) {
					getBear();
				} else {
					failBear();
				}
			} else if (quantity == 3) {
				System.out.println("30프로성공 확률입니다");
				int percent = random.nextInt(9);
				if (percent == 0 || percent == 1 || percent == 2) {
					getBear();
				} else {
					failBear();
				}
			} else if (quantity == 4) {
				System.out.println("40프로성공 확률입니다");
				int percent = random.nextInt(4);
				if (percent == 0 || percent == 1) {
					getBear();
				} else {
					failBear();
				}
			} else if (quantity >= 5) {
				System.out.println("50프로이상성공 확률입니다");
				int percent = random.nextInt(1);
				if (percent == 0) {
					getBear();
				} else {
					failBear();
				}
			} else {
				System.out.println("성공확률이 없습니다");
			}

	}

	public void getBear() {
		System.out.println("곰 뽑기에 성공했습니다");
		quantity--;
	}

	public void failBear() {
		System.out.println("곰 뽑기에 실패했습니다");
	}
}
