package basic.ch10;

import java.util.Scanner;

public class HeroTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터가 있으면 1,아니면 2");
		int select1=sc.nextInt();
		if(select1==1) {
		System.out.println("아이디를 입력해주세요");
		String cre_id=sc.next();
		
		
		}
		
		
		else {
		System.out.println("이름은 변경이 불가능합니다!");
		System.out.print("이름:");
		
		String name=sc.next();
		
		
			
		Hero hero1 = new Hero(name);
		
		hero1.setHp(100);
		hero1.setPower(30);
		hero1.setDefense(10.3);
		hero1.setIsDie(true);
		hero1.showinfo();
		
		}
		System.out.println();
	
	}//end of main
	
}//end of class
