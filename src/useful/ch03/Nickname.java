package useful.ch03;

public class Nickname {

	String Nick;

	public String getNick() {
		return Nick;
	}

	public void setNick(String nick) throws NicknameException {
		this.Nick = nick;

		if (nick == null) {
			throw new NicknameException("닉네임을 지어주세요");
		}
		if (nick.length() < 4) {
			throw new NicknameException("닉네임은 3자이상입니다");
		}
		if (nick.matches("[a-zA-Zㄱ-ㅎ가-힣0-9]]+")) {
			throw new NicknameException("한글이나 영어,숫자중 만들어주세요");
		}

	}

}
