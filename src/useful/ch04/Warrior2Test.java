package useful.ch04;

public class Warrior2Test {

	public static void main(String[] args) {
		Warrior2 aiWarrior = new AiWarrior();
		Warrior2 manualWarrior = new ManualWarrior();
		aiWarrior.battle();
		System.out.println("------------");
		manualWarrior.battle();
	}
}
