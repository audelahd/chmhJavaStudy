package ch07.sec08.exam01;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		System.out.println("조명 색깔 red / yellow");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		//myCar.light = new Car(s);
		
		myCar.light = new Light();
		myCar.click(s);
		myCar.alarm();
	}

}
