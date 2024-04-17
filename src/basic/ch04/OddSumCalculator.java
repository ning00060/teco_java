package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요:");
		int Putnumber = sc.nextInt();
		int sum = 0;
		int i;
		System.out.println(Putnumber);
//		if ( Putnumber % 2 ==1) {  <-- 받은 숫자가 홀수일 경우의 식을 만들어버림
//			for ( i = 1; i<=Putnumber; i+=2) {
//				sum += i;
//				}
//		}
//		else {
//			
//		if (for ( i = 2; i<=Putnumber; i++) {
//			i;})  {
//			sum += i;
//		}
		System.out.println("짝수시작");
		for (i = 2; i <= Putnumber; i++) {
			System.out.println(i);
			if (i % 2 == 1) {
				sum += i;
				System.out.println("sum값:" + sum + " i값: " + i);
			} else {
				System.out.println("짝수");
			}
		}
		System.out.println("sum값:" + sum);
		
		System.out.println("홀수시작");
		for (i = 1; i <= Putnumber; i++) {
			System.out.println(i);
			if (i % 2 == 1) {
				sum += i;
				System.out.println("sum값:" + sum + " i값: " + i);
			} else {
				System.out.println("짝수");
			}
		}
		System.out.println("sum값:" + sum);
//		System.out.print("sum : "+ sum+ " \t");
//			
//		}
//		for (i = 1; i <= Putnumber; i += 2) {
//			sum += i;
//		}
//		System.out.print("sum : " + sum + " \t");
	}// end of main

}// end of class
