package basic.ch10;

public class Hero {

	private final String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter,setter 메서드를 만들어 주세요

	// getter
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getIsDie() {
		return this.isDie;
	}

	// setter
	public Hero(String inputname) {
		this.name = inputname;
	}

	public void setHp(int inputhp) {
		if (inputhp < 0) {
			System.out.println("정상적인 값을 입력하세요");
		} else {
			this.hp = inputhp;
		}
	}

	public void setPower(int inputpower) {
		if (inputpower < 0) {
			System.out.println("정상적인 값을 입력하세요");
		} else {

			this.power = inputpower;
		}
	}

	public void setDefense(double inputdefense) {
		if (inputdefense < 0) {
			System.out.println("정상적인 값을 입력하세요");
		} else {

			this.defense = inputdefense;
		}
	}

	public void setIsDie(boolean inputdie) {
		if (inputdie != true || false) {
			System.out.println("정상적인 값을 입력하세요");
		} else {

			this.isDie = inputdie;
		}
	}

	public void showinfo() {
		System.out.println(
				"귀하의 정보:" + "이름:" + name + ", 체력:" + +hp + ", 공격력:" + power + ", 방어력:" + defense + ", 생존:" + isDie);
	}

}
