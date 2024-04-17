package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다

	// 기본 생성자 형태 만들어 보기
	public UserInfo() {
	}

	public UserInfo(String id) {
		userId = id;

	}

	public UserInfo(String id, String Name) {
		userId = id;
		userName = Name;
	}

	public UserInfo(String id, String Name, String pwd) {
		userId = id;
		userName = Name;
		userPassword = pwd;
	}

	public UserInfo(String id, String Name, String pwd, String adrs) {
		userId = id;
		userName = Name;
		userPassword = pwd;
		userAddress = adrs;
	}

	public UserInfo(String id, String Name, String pwd, String adrs, String pnb) {
		userId = id;
		userName = Name;
		userPassword = pwd;
		userAddress = adrs;
		phoneNumber = pnb;
	}

	// 연습 문제 -
	// 1- 매개변수 3개를 받는 생성자를 만들어 주세요

	// 2- 매개변수 4개를 받는 생성자를 만들어 주세요

	// 3- 매개변수 5개를 받는 생성자를 만들어 주세요
	public void info() {
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userPassword);
		System.out.println(userAddress);
		System.out.println(phoneNumber);
	}
}
