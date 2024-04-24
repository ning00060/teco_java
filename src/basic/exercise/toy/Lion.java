package basic.exercise.toy;

public class Lion extends Product {

	public Lion() {
		name = "사자인형";
		price = 14_000;
		weight = 700;
		quantity = 12;
	}

	public void getPercent() {
		if (catchs() == 2)
			if (quantity == 1) {
				System.out.println("10프로성공 확률입니다");
				int percent = random.nextInt(9);
				if (percent == 0) {
					getLion();
				} else {
					failLion();
				}
			} else if (quantity == 2) {
				System.out.println("20프로성공 확률입니다");
				int percent = random.nextInt(4);
				if (percent == 0) {
					getLion();
				} else {
					failLion();
				}
			} else if (quantity == 3) {
				System.out.println("30프로성공 확률입니다");
				int percent = random.nextInt(9);
				if (percent == 0 || percent == 1 || percent == 2) {
					getLion();
				} else {
					failLion();
				}
			} else if (quantity == 4) {
				System.out.println("40프로성공 확률입니다");
				int percent = random.nextInt(4);
				if (percent == 0 || percent == 1) {
					getLion();
				} else {
					failLion();
				}
			} else if (quantity >= 5) {
				System.out.println("50프로이상성공 확률입니다");
				int percent = random.nextInt(1);
				if (percent == 0) {
					getLion();
				} else {
					failLion();
				}
			} else {
				System.out.println("성공확률이 없습니다");
			}

	}

	public void getLion() {
		System.out.println("사자 뽑기에 성공했습니다");
		quantity--;
	}

	public void failLion() {
		System.out.println("사자 뽑기에 실패했습니다");
	}
}
