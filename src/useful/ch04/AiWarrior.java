package useful.ch04;

public class AiWarrior extends Warrior2 {

	@Override
	void attack() {
		System.out.println("자동으로 적을 공격합니다");
	}

	@Override
	void deffense() {
		System.out.println("자동으로 방어를 취합니다");
	}

	@Override
	void win() {
		System.out.println("자동시스템으로 승리하였습니다");
	}

}
