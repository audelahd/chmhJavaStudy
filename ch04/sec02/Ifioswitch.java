package ch04.sec02;

import java.util.Scanner;

public class Ifioswitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		char hak = 'F'; 
		int num = 0, grade=0;
		String jumsu = "";
	

		while (true) {
			System.out.println("점수를 입력 : ");
			jumsu = scanner.nextLine();
		
			if(jumsu.equals("Q"))
				break;
			
			num = Integer.parseInt(jumsu);
			
			grade = num/10; 
			
			switch (grade) {
			
			case 9:
				hak = 'A';
			    break;
		    case 8:
			    hak = 'B';
			    break;
		    case 7:
		    	hak = 'C';
		     	break;
		    case 6:
		 	    hak = 'D';
			    break;
		    default:
			    hak = 'F';

		}
		System.out.println("당신의 점수는 : " + jumsu + " 학점은 " + grade);
	}

		System.out.println("종료");
}
}
