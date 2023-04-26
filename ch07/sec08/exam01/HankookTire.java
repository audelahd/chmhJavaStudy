package ch07.sec08.exam01;

public class HankookTire extends Tire {

	@Override 
	public void roll() { //재정의하기 때문에 오버라이드
		System.out.println("한국 타이어가 회전합니다.");
	}
	
}
