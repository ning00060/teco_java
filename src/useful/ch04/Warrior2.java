package useful.ch04;

public abstract class Warrior2 {

	void encounter() {
		System.out.println("상대방와 마주쳤습니다");
	}

	abstract void attack();

	abstract void deffense();

	abstract void win();

	final void battle() {
		encounter();
		attack();
		deffense();
		win();
	}

}
