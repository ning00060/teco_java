package useful.ch04;

public class ManualWarrior extends Warrior2 {

	@Override
	void attack() {
		System.out.println("적군을 공격합니다");

	}

	@Override
	void deffense() {
		System.out.println("적군의 공격에 방어를 합니다");
	}

	@Override
	void win() {
		System.out.println("승리");
	}

}
