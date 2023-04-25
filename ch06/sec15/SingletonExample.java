package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getinstance();
		Singleton obj2 = Singleton.getinstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton객체입니다.");
		}
		else {
			System.out.println("다른 Singleton객체입니다.");
		}
		
	}

}
