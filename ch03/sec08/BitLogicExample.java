package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		int a =5;
		int b =15;
		
		System.out.println(a&b); //0101 & 1111  > &는 둘다 true여야 true 
		                         //0101, 그래서 5
		System.out.println(a|b); //0101 | 1111  > |는 둘 중 하나라도 true면 true
		                         //1111, 그래서 15
		System.out.println(a^b); //0101 ^ 1111  > ^는 둘이 달라야 true
		                         //1010, 그래서 10

	}

}
