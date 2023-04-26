package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("홍길동");
		SmartPhone smartphone2 = new SmartPhone("김민지");
		
		System.out.println(smartphone.owner+"의 스마트폰");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
		
		System.out.print(smartphone2.owner+"의 스마트폰의 "); smartphone2.turnOn();
	}

}
