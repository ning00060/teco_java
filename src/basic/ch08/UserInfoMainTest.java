package basic.ch08;

public class UserInfoMainTest {
	// main의 시작점
	public static void main(String[] args) {
		UserInfo userInfo1 = new UserInfo("123");
		userInfo1.info();
		UserInfo userInfo2 = new UserInfo("123", "홍길동");
		userInfo2.info();
		UserInfo userInfo3 = new UserInfo("123", "이순신", "1q2w3r");
		userInfo3.info();
		UserInfo userInfo4 = new UserInfo("123", "장보고", "qwer", "서울");
		userInfo4.info();
		UserInfo userInfo5 = new UserInfo("123", "강감찬", "1234", "부산", "0101111111");
		userInfo5.info();

	}// end of main

}// end of class
