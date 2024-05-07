package basic.abcd;

public class TestClass {
	public void print() {
		System.out.println("야호");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			if (i == 4) {
				return;
			}
		}
		System.out.println("\n메서드 끝남");
	}
	
	
	public int add() {
		return 1;
	}
	
	public static void main(String[] args) {
		TestClass testclass = new TestClass();
		testclass.print();
		int il = testclass.add();
		System.out.println("--------------------");
		System.out.println(testclass.add());
		System.out.println(Math.abs(-1)); 
	}
	
	
}
