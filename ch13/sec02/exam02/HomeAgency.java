package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{

	public Home rent() {
		return new Home();
	}
}
