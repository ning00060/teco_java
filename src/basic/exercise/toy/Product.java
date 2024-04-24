package basic.exercise.toy;

import java.util.Random;

public class Product {
	String name;
	int weight;
	int price;
	int quantity;

	static Random random = new Random();

	public void showinfo() {
		System.out.println("상품명: " + name);
		System.out.println("상품무게: " + weight);
		System.out.println("상품가: " + price);
		System.out.println("상품수량: " + quantity);
	}

	public static int catchs() {
		int putnumber = random.nextInt(5);
		if (putnumber % 2 == 1) {
			putnumber += 1;
		}
		System.out.println(putnumber);

		return putnumber;
	}

}
