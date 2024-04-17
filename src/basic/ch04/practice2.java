package basic.ch04;

public class practice2 {
	public static void main(String[] args) {
		int i;
		int j;
		char temp='*';
		for(i=1;i<5;i++) {
			
			for(j=0;j<i;j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		
		
		System.out.println("------------2");
		for(i=1;i<=10;i++) {
			if(i%2==1) {
				
				System.out.println();
			}		
			for(j=0;j<i;j++) {
				if(j%2==1) {
					System.out.print("*");
				}
			}
		}
		System.out.println();
		System.out.println("--------------------3");
		
		for(i=1;i<5;i++) {
			
				for(j=4;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
	System.out.println("----------4");
		}
	}

