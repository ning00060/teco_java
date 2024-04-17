package basic.ch02;

public class DiscountCalculator {
	//코드의 시작점
	public static void main(String[] args) {
		
		//상수 선언 - 원가, 할인율
		final double COST=59.99;
		final double SELL=0.3;

		// 할인된 가격 계산하기(비즈니스 로직)
		double DISCOUNTPERCENT=(COST*(1-SELL));
		int discount;
		//최종된 가격을 정수형 으로 형 변환 처리
		discount =(int)DISCOUNTPERCENT;
		//결과 출력
		System.out.println("최종 가격 :"+discount);
		System.out.println("최종 가격(소수점) :"+DISCOUNTPERCENT);
		
		/* 강사님.ver
		 * // 상수 선언 - 원가, 할일율 
		final double ORIGINAL_PRICE = 59.99; 
		final double DISCOUNT_RATE = 0.3; // 30% 할인 
		
		// 할인된 가격 = 원가 × (1 − 할인율)
		// 할인된 가격 계산 하기(비지니스 로직)
		double discountedPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);
		
		// 최종된 가격을 정수형으로 형 변환 처리 
		int finalPrice = (int)discountedPrice;
		// 결과 출력 
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소수점) : " + discountedPrice);
		*/
	}// end of main

}// end of class
