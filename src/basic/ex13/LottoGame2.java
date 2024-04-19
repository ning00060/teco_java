package basic.ex13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1 ~ 6 까지 나온 결과값을 오름 차순으로 정렬
		// 단, 중복 값은 무시!
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);
		System.out.println("----");
		int tempBox = 0;
		int i;
		for (i = 1; i < 5;) {
//			2 18 1 13 8 21
			//     2				18
			if (gameNumber1 > gameNumber2) {
				// 
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
				System.out.println("1번째if"+i+"번째 변환됨");
			}
//					18      	 	1
			if (gameNumber2 > gameNumber3) {
				// 18 			1
				tempBox = gameNumber2;
				//  1  				18
				gameNumber2 = gameNumber3;
				// 18 			
				gameNumber3 = tempBox;
				System.out.println("2번째if"+i+"번째 변환됨");
			}
			//    18			13
			if (gameNumber3 > gameNumber4) {
			//  	18			18
				tempBox = gameNumber3;
			//  	13			
				gameNumber3 = gameNumber4;
			//   	18			
				gameNumber4 = tempBox;
				System.out.println("3번째if"+i+"번째 변환됨");
			}

			//		18				8
			if (gameNumber4 > gameNumber5) {
				// 18
				tempBox = gameNumber4;
				//	8
				gameNumber4 = gameNumber5;
				// 	18
				gameNumber5 = tempBox;
				System.out.println("4번째if"+i+"번째 변환됨");
			}
				// 	18			21
			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
				System.out.println("5번째if"+i+"번째 변환됨");
			}
			i++;
			//1 사이클 2 1 13 8 18 21
			// 2 사이클1 2 8 13 18 21 끝
			System.out.println(gameNumber1);
			System.out.println(gameNumber2);
			System.out.println(gameNumber3);
			System.out.println(gameNumber4);
			System.out.println(gameNumber5);
			System.out.println(gameNumber6);
			System.out.println(i+"사이클----");
		}

		// 1, 5, 7, 2, 3, 9

	} // end of main
}
