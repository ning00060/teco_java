package io;

import java.io.IOException;

public class MySystemIn2 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");

		// 바이트 동작 --> 0과 1로 구성

		// 정수 -> byte, short, int, long

		int i;
		// 한 바이트 씩 키보드에 값을 읽어라

		try {
			// 100 != 302 --> true
			while ((i = System.in.read()) != '\n') {
				System.out.println("i :" + i);
				System.out.println("(char)i :" + (char) i);
			}

			// 문자로 변환하고 싶다면 --> 컴퓨터 안에 있는 문자표를 활용(인코딩)
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
