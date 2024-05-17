package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//문자 기반 스트림 + 보조 문자 기반 스트림을 확인
//한줄 입력 하면 종료 됨
//여러줄 반복적으로 동작할 수 있도록 기능을 추가해주세요.
public class StandardInputExample2 {

	public static void main(String[] args) {
		// 데이터를 통으로 관리 하고 싶다면 --> 자룟구조 --> 적잘한 자료 구조를 선택
		List<String> lines = new ArrayList<String>();

		System.out.println("빈줄에서 엔터를 누르면 종료");

		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr)) {

			// isr -> 한 문자씩 읽는 기능 read() 가지고 있었다.
			// br -> 한번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
//			System.out.println("더 많은 텍스트를 입력 하세요 (한줄 단위) -> 엔터");
			String line;

			// ""--> 엔터 --> line.isEmpty() --! --> F--> 실행에 종료가 된다.
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				lines.add(line); // 한줄에 데이터를 자료구조에 저장
//				System.out.println("입력 확인: "+ line);
				// isr.read();-->기능 확장
			}

			for (String data : lines) {
				System.out.println(data);
			}

			System.out.println("프로그램 종료 처리");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
