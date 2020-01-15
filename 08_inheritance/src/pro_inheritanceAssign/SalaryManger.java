package pro_inheritanceAssign;

import java.text.DecimalFormat;
import java.util.Scanner;

import inheritance.EmployeeDTO;
import inheritance.SalaryManager;

public class SalaryManger {
	Scanner sc = new Scanner(System.in);
	EmployeeDTO ar[] = new EmployeeDTO[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,####");
		SalaryManager mm = new SalaryManager();
		mm.menu();
		System.out.println("프로그램을 종료합니다");
	}
	public void menu() {
		int num = 0;
		while (true) {
			System.out.println("*************");
			System.out.println("  1. 등록");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 검색");
			System.out.println("  5. 종료");
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = sc.nextInt();
			if (num == 5)
				break;

			if (num == 1)
				this.insert(); // 내 클래스 안에 잇는 함수를 사용
			else if (num == 2)
				this.list();
			else if (num == 3)
				this.update();
			else if (num == 4)
				this.search();
			
		} // while
	}

	private void insert() {
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				break; // 만약 for문을 다 돌았다는건 한번도 null값이 없다는 뜻(=전부 값이 있다)
		}
		if (i == ar.length) {
			System.out.println("5명 정원이 꽉 찼습니다");
			return;// 메소드를 벗어나라
		}
		System.out.println("----------------------");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포지션 입력 : ");
		String position = sc.next();
		System.out.print("기본급 입력 : ");
		int basePay = sc.nextInt();
		System.out.print("수당 입력 : ");
		int benefit = sc.nextInt();
		
		System.out.println();
		ar[i] = new EmployeeDTO(name, position, basePay,benefit); // 방을 설정해줌

		int cnt = 0;
	//	System.out.println("1 row(s) created");

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				cnt++;
		}
		System.out.println(cnt + " 자리가 남았습니다");
	}

	public void list() {
		System.out.println("이름\t직급\t기본급 \t수당 \t세율\t월급 ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				ar[i].calc();
				System.out.println(ar[i]);
//				System.out.println(
//						ar[i].getName() + "\t" 
//				+ ar[i].getPosition() + "\t" 
//				+ ar[i].getBasePay()+ "\t" 
//				+ ar[i].getBenefit()+"\t"
//				+ ar[i].getTaxRate()+"\t"
//				+ ar[i].getSalary());
			}
		}
	}

	public void update() {
		System.out.println("이름 입력:");
		String name = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.println(
						ar[i] );
				// ------------------------------
				System.out.print("수정 할 직급 입력 : ");
				ar[i].setName(sc.next());

				System.out.print("수정 할 기본급 입력 : ");
				ar[i].setBasePay(sc.nextInt());

				System.out.print("수정 할 수당 입력 : ");
				ar[i].setBenefit(sc.nextInt());

			//	System.out.println("1 rows updated");
				break;
			} // if
		} // for

		if (i == 5) { // for i 가 다 차면 찾는 회원이 없는것
			System.out.println("찾는 회원이 없습니다");
		}

	}
	
	public void search() {
		System.out.println("이름 입력:");
		String name = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.println(
						ar[i]);
				break;
			}
		}
		if (i == 5) { // for i 가 다 차면 찾는 회원이 없는것
			System.out.println("찾는 회원이 없습니다");
		}
	}
}
