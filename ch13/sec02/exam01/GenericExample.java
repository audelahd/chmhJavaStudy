package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		Product<TV,String> product1 = new Product<>();
		
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car,String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}
