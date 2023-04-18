package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		/*for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(i+"x"+j+"="+(i*j));
				System.out.println();
				
				
			}
		}*/
		
		for(int k=0;k<2;k++) {
			for(int j=1; j<=9 ; j++) {
				for(int i=2+(k*4); i<=5+(k*4); i++) {
					System.out.print(i+" x "+j+" = "+ String.format("%2d", i*j) + "   ");
				    //System.out.printf("%d x %d = %2d  ",i,j,i*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
