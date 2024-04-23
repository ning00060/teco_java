package basic.ch17;

public class Archor extends Hero {

	public Archor(String name, int hp) {
		super(name, hp);
	}

	@Override
	void attack(Warrior warrior) {

		super.attack(warrior);
	}

	@Override
	void attack(Wizard wizard) {

		super.attack(wizard);
	}

	public void fireArrow() {

	}

}
