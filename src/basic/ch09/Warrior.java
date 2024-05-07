package basic.ch09;

public class Warrior {

	String name;
	int HP;//
	int MP;
	int attck;
	int defence;
	int speed;
	int count;
	
	public Warrior(String Wname, int Whp, int Wmp, int Wat, int Wde, int Wsp) {
		name = Wname;
		HP = Whp;
		MP = Wmp;
		attck = Wat;
		defence = Wde;
		speed = Wsp;
	}
	
	public void TakeM(int at, int deal, Magician magician) {
		at += attck;
		magician.Injuried(attck);
		deal += count;
	}

	public void TakeA(int at, int deal, Archor archor) {
		at += attck;
		archor.Injuried(attck);
		deal += count;
	}

	public void Injuried(int Whp) {
		HP -= Whp;
		if (HP <= 0) {
			System.out.println("사망하였습니다");
			return;
		} else {
			System.out.println(HP + "생존 하였습니다");
			return;
		}

	}

	public void showinfo() {
		System.out.println("영웅 이름: " + name);
		System.out.println("영웅 체력: " + "피 " + HP + "마나 " + MP);
		System.out.println("영웅 공격력: " + attck);
		System.out.println("영웅 방어력: " + defence);
		System.out.println("영웅 속도: " + HP);

	}
}

