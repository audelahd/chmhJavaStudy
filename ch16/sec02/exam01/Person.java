package ch16.sec02.exam01;

public class Person {
	public void action (Workable workable) {
		workable.work();
		System.out.println("action 클래스 작동");
	}

}
