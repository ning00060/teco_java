package basic.ch22;

public class Rabbit implements RaceParticipant {
	private final int speed = 10;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "엉금엉금토끼";
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

}
