package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score =0;
		char grade;
		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("score를 입력해주세요. : ");
			String str = scanner.nextLine();
			// int score=85;
			// char grade = (score>90)?'A':((score>80)?'B':'C');
			// 조건문 if문으로 작성하기
		
			if (str.equals("q")||str.equals("Q")) {
				break;
			} 
			
			score=Integer.parseInt(str);
			
			if (score >= 90) {
				grade = 'A';
			}
			else if(score >= 80) {
				grade='B';
			}
			else if (score>= 70) {
				grade='C';
			}
			else if (score>= 60) {
				grade='D';
			}
			else
				grade = 'F';

			System.out.println(score + "점은" + grade + "등급입니다.");

		}
		System.out.println("종료됩니다.");
	}

}
