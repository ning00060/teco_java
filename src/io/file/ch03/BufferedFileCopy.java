package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy extends FileCopy {

	public BufferedFileCopy() {

	}

	public static void main(String[] args) {
		// 기반 스트림 + 보조 스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오

		// 파일 경로 ( 복사할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";
		// 소요시간 확인
		long startTime = System.nanoTime();

		try {
			FileInputStream fis = new FileInputStream(sourceFilePath);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(destinationFilePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);

			}
			bis.read();
			System.out.println("입력 스트림-> 버퍼링->출력 스트림-> 버퍼링 ->입력->출력");

		} catch (Exception e) {
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		double seconds = duration / 1_000_000_000.0;
		// String 클래스에 format 메서드 사용해보기
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		// % 는 포맷 지정자으 ㅣ시작
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리 하겠다
		System.out.println(resultFormat);
	}
}
