package Pro_ConstAssign;

import java.util.Scanner;

public class MemberMain {
	Scanner sc = new Scanner(System.in);
	MemberDTO ar[] = new MemberDTO[5];

	public static void main(String[] args) {

		MemberMain mm = new MemberMain();
		mm.menu();
		System.out.println("프로그램을 종료합니다");
	}

	public void menu() {
		int num = 0;
		while (true) {
			System.out.println("*************");
			System.out.println("  1. 가입");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 탈퇴");
			System.out.println("  5. 끝내기");
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = sc.nextInt();
			if (num == 5)
				break;

			if (num == 1)
				this.insert(); // 내 클래스 안에 잇는 함수를 사용
			else if (num == 2)
				this.list();
			else if(num==3) this.update();
			else if(num==4) this.delete();
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
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		String address = sc.next();
		System.out.print("핸드폰 입력 : ");
		String phone = sc.next();
//		 if(!phone.matches("(01[016789])-(\\d{3,4})-(\\d{4})")) {
//		 System.out.println("ex)010-1234-5678");
//		 }
		System.out.println();
		ar[i] = new MemberDTO(name, age, address, phone); // 방을 설정해줌

		int cnt = 0;
		System.out.println("1 row(s) created");

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				cnt++;
		}
		System.out.println(cnt + " 자리가 남았습니다");

	}

	public void list() {
		System.out.println("name\tage\tAddress\tphone");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println(
						ar[i].getName() + "\t" 
						+ ar[i].getAge() + "\t" 
						+ ar[i].getPhone() + "\t" 
						+ ar[i].getAddress());
			}

		}
	}

	public void update() {
		System.out.println("핸드폰 번호 입력:");
		String phone = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getPhone().equals(phone)) {
				System.out.println(
						ar[i].getName() + "\t" 
						+ ar[i].getAge() + "\t" 
						+ ar[i].getPhone() + "\t" 
						+ ar[i].getAddress());
				// ------------------------------
				System.out.print("수정 할 이름 입력 : ");
				ar[i].setName(sc.next());

				System.out.print("수정 할 핸드폰 입력 : ");
				ar[i].setPhone(sc.next());

				System.out.print("수정 할 주소 입력 : ");
				ar[i].setAddress(sc.next());
				
				System.out.println("1 rows updated");
				break;
			}//if
		}//for
		
		if(i==5) { //for i 가 다 차면 찾는 회원이  없는것 
			System.out.println("찾는 회원이 없습니다");
		}

	}
	
	public void delete() {
		System.out.println("핸드폰 번호 입력:");
		String phone = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getPhone().equals(phone)) {
				ar[i]=null;
				System.out.println("1 rows deleted");
				break;
			}//if
		}//for
		if(i==5) { //for i 가 다 차면 찾는 회원이  없는것 
			System.out.println("찾는 회원이 없습니다");
		}//if
	}
}
