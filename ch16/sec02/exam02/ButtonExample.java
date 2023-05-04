package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button(); //누를 버튼 생성 
		
		btnOk.setClickListener(()->{
			System.out.println("OK버튼을 클릭했습니다.");
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(()->{
			System.out.println("Cancel버튼을 클릭했습니다.");
		});
		
		 btnCancel.click();

	}

}
