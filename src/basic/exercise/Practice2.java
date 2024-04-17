package basic.exercise;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
//		greet("명기");// 인사말
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요");
		String put1 = sc.next();
		greet(put1);// 인사말 출력
		
		System.out.println("---------------------");
		
		System.out.println("제곱 계산을 위한 값을 넣어주세요");
		int input1 = sc.nextInt();
		int answer1 = square(input1);
		System.out.println("입력값:" + input1 + " 제곱 계산하기 " + +answer1);// 제곱
		
		System.out.println("---------------------");

		System.out.println("나이 확인을 위한 값을 넣어주세요");
		int input2 = sc.nextInt();
		boolean answer2 = checkAdult(input2);
		System.out.println("입력값:" + input2 + " 나이 확인: " + answer2);// 나이 확인
		
		System.out.println("---------------------");
		
		System.out.println("부호 판별을 위한 값을 넣어주세요");
		int input3 = sc.nextInt();
		String answer3 = signOfNumber(input3);
		System.out.println("입력값:" + input3 + " 부호 판별: " + answer3);// 부호 판별
		System.out.println("최대값 판별 위한 값을 넣어주세요");
		int input4 = sc.nextInt();
		int input5 = sc.nextInt();
		int answer4 = findMax(input4, input5);
		System.out.println("입력값:" + input4 + "," + input5 + " 최대값 찾기: " + answer4);// 최대값
	}

	static void greet(String greeting) {// 인사
		System.out.println("안녕하세요," + "[" + greeting + "]" + "님!");
	}

	static int square(int n1) {// 제곱
		int i;
		i = (n1 * n1);
		return i;
	}

	static boolean checkAdult(int n1) {// 나이
		boolean check;
		if (n1 >= 18) {
			check = true;
		}

		else {
			check = false;
		}
		return check;
	}

	static String signOfNumber(int n1) {
		String react;

		if (n1 > 0) {
			react = "Positive";

		} else if (n1 == 0) {
			react = "Zero";

		} else {
			react = "Negative";
		}
		return react;

	}

	static int findMax(int n1, int n2) {
		int i;
		if (n1 > n2) {
			i = n1;
		} else {
			i = n2;
		}
		return i;
	}
}