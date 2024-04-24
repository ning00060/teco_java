package starcraft.ver04;

/**
 * 
 * public 
 * protected -- 상속관계를 설정할수있다. 
 * default 
 * private
 */
public class Unit {

	String name;
	int power;
	int hp;

	public Unit(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	public void attack(Zealot z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	public void attack(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
		m.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드
		// 80 -- 75 == 5
		// 5-75 = -70
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다");
			hp = 0;
			return;
		}
		hp -= power;
	}

	public void showinfo() {
		System.out.println("=====상태창======");
		System.out.println("이름:" + this.name);
		System.out.println("공격력:" + this.power);
		System.out.println("생명력:" + this.hp);
	}

}
