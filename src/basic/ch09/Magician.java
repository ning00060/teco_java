package basic.ch09;

public class Magician {
	String name;
	int HP;//
	int MP;
	int attck;
	int defence;
	int speed;
	int count;

	public Magician(String mname, int mhp, int mmp, int mat, int mde, int msp) {
		name = mname;
		HP = mhp;
		MP = mmp;
		attck = mat;
		defence = mde;
		speed = msp;
	}

	public void TakeW(int at, int deal, Warrior warrior) {
		at += attck;
		warrior.Injuried(attck);
		deal += count;
	}

	public void TakeA(int at, int deal, Archor archor) {
		at += attck;
		archor.Injuried(attck);
		deal += count;
	}

	public void Injuried(int Mhp) {
		HP -= Mhp;
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
