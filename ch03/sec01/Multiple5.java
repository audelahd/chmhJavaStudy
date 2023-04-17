package ch03.sec01;

public class Multiple5 {

	public static void main(String[] args) {
		// 1~100사이에서 5의 배수만 출력
		
		for (int i=1; i<101; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}

	}

}
