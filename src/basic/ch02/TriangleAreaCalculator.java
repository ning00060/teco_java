package basic.ch02;

public class TriangleAreaCalculator {
	
	public static void main(String[] args) {
		
		// 삼각형 밑변 BASE, 단 상수로 선언
		final double BASE=20;
		// 삼각형 높이 HEIGHT, 단 상수로 선언
		final double HEIGHT=15;
		
		// 결과 값을 area 변수에 저장
		double area =(BASE * HEIGHT)/2;
		// 결과 출력 하기
		System.out.println("삼각형의 면적 :"+area);
		
	}//end of main

}//end of class
