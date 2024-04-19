package starcraft.ver01;

public class Hatchery {
	private int hatcheryNumber;
	private int count;

	// 생산자
	public Hatchery(int hatcherynumber) {
		this.hatcheryNumber = hatcherynumber;
		count = 0;
	}

	// 기능
	public Zergling BuildZergling(String name) {
		count++;
		return new Zergling(name);

	}

	// get ,set
	public int getHatcheryNumber() {
		return hatcheryNumber;
	}

	public void setHatcheryNumber(int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
