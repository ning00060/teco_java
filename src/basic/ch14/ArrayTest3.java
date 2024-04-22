package basic.ch14;

public class ArrayTest3 {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch1 = 'A';
		alphabets[0] = ch1;

		char ch2 = 'B';
		alphabets[1] = ch2;

		char ch3 = 'C';
		alphabets[2] = ch3;

		char ch26 = 'z';
		alphabets[25] = ch26;
		System.out.println("-----------");
		System.out.println(alphabets[3]);
		if (alphabets[3] == 0) {
			System.out.println("동작함");
		}
		System.out.println("-----------");

		// 배열은 반복문과 함께 많이 사용 된다.
		int forCount = 0;
		int eCount = 0;
		for (int i = 0; i < alphabets.length; i++) {
			if (alphabets[i] != 0) {
				eCount++;

			}
			// alphabets
			System.out.println(alphabets[i]);
			forCount++;
		}
		System.out.println("for 동작 횟수" + forCount);
		System.out.println("배열안에 요소의 갯수는 ?" + (eCount));

	}

}
