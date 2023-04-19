package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int [] arr1;
		int [] arr2;
		int [] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;

		System.out.println(arr1==arr2); //false
		System.out.println(arr2==arr3); //true
		/* 이유 설명
		 * arr1과 arr2는 구성요소는 같지만 주소(영역)가 같지 않기 때문에 ==가 false가 뜬다.
		 * arr2와 arr3은 아예 대입을 해버렸기 때문에 ==가 true가 뜬다.
		 */
	}

}
