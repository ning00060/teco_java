package useful;

import java.lang.*;

public class Book extends Object {

	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		return "[ " +title+","+author+" ] ";
	}
	public static void main(String[] args) {
		Book book =new Book("데미안", "헤르만 헤세");
		System.out.println(book);
		System.out.println("---------------");
		
		String str1 = new String("안녕");
		System.out.println(str1);
	}
		
}
