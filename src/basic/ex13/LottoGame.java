package basic.ex13;

public class LottoGame {

	public static void main(String[] args) {
		int tempBox = 0;
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");

		if (gameNumber1 > gameNumber2) {
			tempBox = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = gameNumber1;
		}
		System.out.println(gameNumber1 + "," + gameNumber2);
		// 오름 차순으로 정렬 해보기
		// 만약 1상자 2상자 보다 크다면 어떤 행동을 하라/

	}

}
