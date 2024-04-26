package useful;

public class StringTest2 {

	
	public static void main(String[] args) {

		
			String str3= "abc";
			String str4= "abc"; // 불편
			System.out.println(System.identityHashCode(str3));
			System.out.println(System.identityHashCode(str4));
			 
			 str3 = str3+ ": def";
			 System.out.println(System.identityHashCode(str3));
			 
			

			 // 리터널 타입으로 생성한 String 한번 생상하면 불변이다.
			 
	}
}
