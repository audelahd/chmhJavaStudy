package test.day24;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("---------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 |5. 종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int select = scanner.nextInt();
			
			if (select ==1) {
				create();
			}
			else if (select ==2) {
				list();
			}
			else if (select ==3) {
				Deposit();
			}
			else if (select ==4) {
				Withdraw();
			}
			else {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
	
	public static void create() {
		
		System.out.println("계좌 번호 : ");
		String accountnum= scanner.next();
		System.out.println("계좌주 :");
		String accountname=scanner.next();
		System.out.println("초기 입금액 : ");
		int accountmoney= scanner.nextInt();
		Account account = new Account (accountnum,accountname,accountmoney); 
		
		for (int i=0; i<accArray.length; i++) {
			if(accArray[i] == null) {
				accArray[i] = account;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	public static void list() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for (int i=0; i<accArray.length;i++) {
			Account account = accArray[i];
			if(account!=null) {
				System.out.println(account.getAno()+"  "+account.getOwner()+"  "+account.getBalance());
			}
		}
	}
	
	public static void Deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.println("계좌 번호 : ");
		String accountnum = scanner.next();
		System.out.println("예금액 : ");
	    int money = scanner.nextInt();
		
		Account account = findAccount(accountnum);
		
		if(account ==null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	public static void Withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.println("계좌 번호 : ");
		String accountnum = scanner.next();
		System.out.println("출금액 : ");
	    int money = scanner.nextInt();
		
		Account account = findAccount(accountnum);
		
		if(account ==null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("결과 : 출금이 성공되었습니다.");
		
	}
	
	private static Account findAccount(String s) {
		Account account =null;
		for (int i=0; i<accArray.length; i++) {
			if(accArray[i]!=null) {
				String DBAccountnum = accArray[i].getAno();
				if(DBAccountnum.equals(s)) {
					account = accArray[i];
					break;
				}
			}
		}
		return account;
	}

}
