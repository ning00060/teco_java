package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {

		// 생성 불가
//		Company company = new Company();

		// 고민 ! Company 객체를 어떻게 접근 할 수 있을까?
		// 1클래스
		Company company = Company.getInstance();
		System.out.println(company);
		// 2클래스
		Company company2 = Company.getInstance();
		System.out.println(company);

	}// end of main
}// end of class
