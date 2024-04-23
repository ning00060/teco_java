package starcraft.ver02;

public class Barrack {

	private int barrackNumber;
	private int count;

	// 생산자
	public Barrack(int barracknumber) {
		this.barrackNumber = barracknumber;
		count = 0;
	}

	// 기능
	public Marine buildMarine(String name) {
		count++;
		return new Marine(name);
	}

	// get ,set
	public int getBarrackNumber() {
		return barrackNumber;
	}

	public void setBarrackNumber(int barrackNumber) {
		this.barrackNumber = barrackNumber;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
