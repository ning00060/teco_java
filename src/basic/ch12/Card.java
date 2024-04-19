package basic.ch12;

public class Card {

	// 멤버 변수,static 변수
	private String memberName;
	private static int memberId;

	// 생성자
	public static String Cardname;
	static int cardId = 100;

	// 멤버 함수
	public Card(String cardname, String memname) {
		this.Cardname = cardname;
		this.memberName = memname;
		this.memberId = cardId;
		cardId++;
	}

	// get set
	public String getMembername() {
		return memberName;
	}

	public void setMembername(String membername) {
		this.memberName = membername;
	}

	public static int getMemberId() {
		return memberId;
	}

	public static void setMemberId(int memberId) {
		Card.memberId = memberId;
	}

	public static String getCardname() {
		return Cardname;
	}

	public static void setCardname(String cardname) {
		Cardname = cardname;
	}

	public static int getCardId() {
		return cardId;
	}

	public static void setCardId(int cardId) {
		Card.cardId = cardId;
	}

	public static void main(String[] args) {
		Card card1 = new Card("1팀", "홍길동");
		System.out.println(card1.getCardname() + "," + card1.getMembername() + "," + card1.getMemberId());
		Card card2 = new Card("1팀", "이순신");
		System.out.println(card2.getCardname() + "," + card2.getMembername() + "," + card2.getMemberId());
		Card card3 = new Card("2팀", "강감찬");
		System.out.println(card3.getCardname() + "," + card3.getMembername() + "," + card3.getMemberId());

	}

}
