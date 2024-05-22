package io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ObjectOut.. ObjectInputStream
public class MyObjectStream {

	public static void main(String[] args) {

		// 객체 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
			
			Person person =new Person("손흥민",30);
			oos.writeObject(person);
			
		} catch (Exception e) {
			
		}
		
		System.out.println("--------------------");
		
		//객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){
			
			// 문자 기반 데이터 를 읽으면 <--- 스트링 값 추출해서 코드상에 활용할수 있도록 object 
			// 만드는 코딩을 해야 한다. name:, 10 <---
			Person person= (Person)ois.readObject();
			System.out.println(person);
			
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 흐름 생성 가능
		}
	}

}
