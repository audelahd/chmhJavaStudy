package ch09.sec07.exam01;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	//메소드 (필드 사용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//메소드 (로컬 변수 사용)
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}

	public static void main(String args[]) {
		Tire tire = new Tire();
		tire.roll();
		
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire() {
			@Override 
			public void roll() {
				System.out.println("익명자식메인에서만든게굴러갑니다");
			}
		});
		
	}
}

