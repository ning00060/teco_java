package basic.ch22;

public abstract class Calculator implements Calc {

	@Override
	public double divide(int n1, int n2) {
		if (n2 == 0||n1==0) {
			System.out.println("0으로 나눌수 없습니다");
		return 0.0;
		}
		return n1 / n2;
	}

}
