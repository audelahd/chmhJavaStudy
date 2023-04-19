package test.day19;


public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [][][] test1 = new int [3][2][3];
		
		while(true) {
			int count=0;
			int num =1;
			System.out.println("데이터 입력");
			for (int i=0; i<3; i++) {
				for (int k=0; k<2; k++) {
					for (int j=0; j<3; j++) {
						
						test1[i][k][j]=num;
						num++;
						count++;
						
						if (count%6==0) {
							num=11;
						}
						if (count%12==0) {
							num=21;
						}
						
					}
				}
			}
		
			for(int i=0; i<3; i++) {
				for (int k=0; k<2; k++) {
					for (int j=0; j<3; j++) {
						System.out.printf(" %2d", test1[i][k][j]);
						count++;
						//System.out.print(count);
						if(count%3==0) {
							System.out.println();
						}
						if (count%6==0) {
							System.out.printf("--------\n");
						}
					}
				}
			}
			break;
		}
	}

}
