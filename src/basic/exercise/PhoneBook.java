package basic.exercise;

public class PhoneBook {
	//
	String Name;
	String number;

	public PhoneBook(String name, String number) {
		this.Name = name;
		this.number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void showinfo() {
		System.out.println(">>연락처 정보<<");
		System.out.println(" 이름: " + Name);
		System.out.println(" 번호: " + number);
	}
}
