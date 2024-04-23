package basic.ch17;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// 아처공격
	void attack(Archor archor) {
		System.out.println(name + "가" + archor.name + "를공격합니다");
	}

	// 워리어 공격
	void attack(Warrior warrior) {
		System.out.println(name + "가" + warrior.name + "를공격합니다");
	}

	// 위자드공격
	void attack(Wizard wizard) {
		System.out.println(name + "가" + wizard.name + "를공격합니다");
	}
}
