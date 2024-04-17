package basic.ch05;

public class UserMainTest {

	public static void main(String[] args) {
		User user1 = new User();
		
		
		user1.name="김명기";
		user1.age=32;
		user1.adress="연제구";
		user1.period=1;
		user1.sex="male";

		System.out.println(user1.name +" 이름");
		System.out.println(user1.age +" 나이");
		System.out.println(user1.adress +" 주소");
		System.out.println(user1.period +" 기간");
		System.out.println(user1.sex +" 성별");

	}

}
