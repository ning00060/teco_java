package useful;

public class StringBufferTest {
	
	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {
		
			String str1 = new String("Hello");
			String str2 = new String("World");
			
			StringBuffer bufferStr =new StringBuffer("Hello");
			System.out.println(bufferStr);
			System.out.println(System.identityHashCode(bufferStr));// 원시 주소 값
			
			bufferStr.append(str2);
			System.out.println(bufferStr);
			System.out.println(System.identityHashCode(bufferStr));
		
	}// end of main
}// end of class
