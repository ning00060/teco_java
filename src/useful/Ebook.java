package useful;

public class Ebook {

	private int bookTypeId;
	private String title;
	private String author;
	
	public Ebook(int bookTypeId, String title, String author) {
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}
	
	//object 클래스에 있는 메서드를 재정의
	@Override
	public String toString() {
		return bookTypeId+ ","+title+","+author;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ebook) {
			Ebook tBook= (Ebook)obj;
			// 1. Ebook 클래스의 인스턴스가 맞다면
			// 2. Ebook 의 제목과 저자 의 이름이 같다면 true 반환 시켜라
			if(this.title.equals(tBook.title)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		Ebook book1 = new Ebook(1, "홍길동", "허균");
		Ebook book2 = new Ebook(1, "홍길동", "허균");
		System.out.println("----------------------------------");

		boolean result1= book1==book2;
		System.out.println("result1 : "+ result1);
		
		boolean result2= book1.equals(book2);
		System.out.println("result2 : "+ result2);
	}
	
}
