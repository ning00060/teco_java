package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	@Override
	void attack(Warrior warrior) {

		super.attack(warrior);
	}

	@Override
	void attack(Archor archor) {
		super.attack(archor);
	}

	public void fireArrow() {

	}
}
