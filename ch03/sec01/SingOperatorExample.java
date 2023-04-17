package ch03.sec01;

public class SingOperatorExample {

	public static void main(String[] args) {
		int i=5;
		int sum = ++i + i++;
	
		i=5;
		int sum2 = ++i + ++i;
		System.out.println(i);
		System.out.println(sum);
		System.out.println(sum2);
		
	}

}
