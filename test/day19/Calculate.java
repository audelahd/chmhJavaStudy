package test.day19;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		int i=3, j=4;
		String c =scanner.next();
		char c2 = c.charAt(0);
		
		int result = calculate(i,j,c2);
		
		if(c2=='+') {
			System.out.println(i+"+"+j+", 덧셈");
		}
		else if(c2=='-') {
			System.out.println(i+"-"+j+", 뺄셈");
		}
		else if(c2=='*') {
			System.out.println(i+"*"+j+", 곱셈");
		}
		else if(c2=='/') {
			System.out.println(i+"/"+j+", 나눗셈");
		}
		else {
			System.out.println("연산자가 아님 ");
		}
		
		
		
		System.out.println("연산값 : "+result);
		
		System.out.println("계속 하시겠습니까? yes->1 no->2");
		int yesorno = scanner.nextInt();
		if (yesorno==1) {
			System.out.println();
			continue;
		}
		else if (yesorno==2) {
			System.out.println("종료됩니다.");
			break;
		}
		}

	}
	
	static int calculate (int a, int b, char s){
		System.out.println();
		if (s=='+') {
			return a+b;
		}
		else if(s=='-') {
			return a-b;
		}
		else if(s=='*') {
			return a*b;
		}
		else if(s=='/') {
			return a/b;
		}
		else
			System.out.println("연산자를 입력해주세요");

		return 0;
		
	}

}
