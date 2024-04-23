package starcraft.ver02;

public class StarCraftTest1 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		System.out.println(zealot1.getName() + zealot2.getName());
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		System.out.println(zergling1.getName() + zergling2.getName());
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		System.out.println(marine1.getName() + marine2.getName());

		for (int i = 0; i < 15; i++) {
			zealot1.attack(marine2);
		}
		marine2.showinfo();

	}

}
