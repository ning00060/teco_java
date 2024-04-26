package basic.exercise.interfaces;

// DTO 개념으로 바라 볼수 있다.
public class UserInfo {
	private int id; // PK -> 홍길동, 나이 == 1 , 2, 3,
	private String userName;
	private String pw;
	public static int SERIAL_NUM = 0;

	public UserInfo(String userName, String pw) {
		this.userName = userName;
		this.pw = pw;

	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return id + ", " + userName + ", " + pw;
	}

}
