package ch07.sec08.exam01;

public class Car {

	public Tire tire;
	public Light light;
	
	public void run() {
		tire.roll();
	}
	
	public void alarm() {
		System.out.println("전방에 어린이 보호구역입니다.");
	}
	
	public void click(String s) {
		if(s.equals("red")){
			light.red();
		}
		else if(s.equals("yellow")) {
			light.yellow();
		}
	}
}
