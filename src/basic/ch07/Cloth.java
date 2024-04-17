package basic.ch07;

public class Cloth {

	String clothName;
	int size;
	String Category;
	String Texture;
	
	void take() {
		System.out.println(Category + "부위를 입었습니다");
	}
	void favor() {
		System.out.println(clothName+" 라고부르는옷의 "+Texture+ "재질을 좋아합니다");
	}
	
	void looks() {
		System.out.println(size+ " 사이즈 종류별로 다양합니다.");
	}
	
	void info() {
		System.out.println("---------상세정보-----------");
		System.out.println("이름 : " + clothName);
		System.out.println("사이즈 : " + size);
		System.out.println("종류 : " + Category);
		System.out.println("부위 : " + Texture);
	}
}
