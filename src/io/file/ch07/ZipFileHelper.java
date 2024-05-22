package io.file.ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileHelper {

	// 파일을 압축하는 기능 - zip
	public static void zipFile(String filetoZip,String zipFileName) {
		
		try  ( 
				
				//ZipoutputStream 을 사용해서 zip 형식ㅇ으로 데티러르 압축할수있다
				//filoutStream을 활용ㄹ해서 설정
				FileInputStream fis =new FileInputStream(filetoZip);
				ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFileName))) {
			
				ZipEntry zipEntry =new ZipEntry(filetoZip);
				zos.putNextEntry(zipEntry);
				
				// 파일 내요ㅕㅇ을 읽고 ZIP 파일에 쓰기위한 버퍼 생성
				byte[] bytes= new byte[1024];
				int length;
				
				while( (length=fis.read(bytes)) >= 0) {
					zos.write(bytes,0,length);
				}
				
				zos.closeEntry();
				System.out.println("zIP 파일 생성 완료: "+ zipFileName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ZIP 파일 생성시 오류 발생");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		ZipFileHelper.zipFile("Seoul.txt", "zipseoul.zip");
		
	}
}
