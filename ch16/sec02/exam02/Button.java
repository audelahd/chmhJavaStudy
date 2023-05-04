package ch16.sec02.exam02;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener{
		void onClick(); //람다식이 함수형 인터페이스에 접근할 수 있도록...
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
