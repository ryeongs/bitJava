package Pro_ConstAssign;

import java.util.Scanner;

public class MemberMain {
	Scanner sc = new Scanner(System.in);
	MemberDTO ar[] = new MemberDTO[5];

	public static void main(String[] args) {

		MemberMain mm = new MemberMain();
		mm.menu();
		System.out.println("���α׷��� �����մϴ�");
	}

	public void menu() {
		int num = 0;
		while (true) {
			System.out.println("*************");
			System.out.println("  1. ����");
			System.out.println("  2. ���");
			System.out.println("  3. ����");
			System.out.println("  4. Ż��");
			System.out.println("  5. ������");
			System.out.println("*************");
			System.out.print("  ��ȣ : ");
			num = sc.nextInt();
			if (num == 5)
				break;

			if (num == 1)
				this.insert(); // �� Ŭ���� �ȿ� �մ� �Լ��� ���
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
				break; // ���� for���� �� ���Ҵٴ°� �ѹ��� null���� ���ٴ� ��(=���� ���� �ִ�)
		}
		if (i == ar.length) {
			System.out.println("5�� ������ �� á���ϴ�");
			return;// �޼ҵ带 �����
		}
		System.out.println("----------------------");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		String address = sc.next();
		System.out.print("�ڵ��� �Է� : ");
		String phone = sc.next();
//		 if(!phone.matches("(01[016789])-(\\d{3,4})-(\\d{4})")) {
//		 System.out.println("ex)010-1234-5678");
//		 }
		System.out.println();
		ar[i] = new MemberDTO(name, age, address, phone); // ���� ��������

		int cnt = 0;
		System.out.println("1 row(s) created");

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				cnt++;
		}
		System.out.println(cnt + " �ڸ��� ���ҽ��ϴ�");

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
		System.out.println("�ڵ��� ��ȣ �Է�:");
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
				System.out.print("���� �� �̸� �Է� : ");
				ar[i].setName(sc.next());

				System.out.print("���� �� �ڵ��� �Է� : ");
				ar[i].setPhone(sc.next());

				System.out.print("���� �� �ּ� �Է� : ");
				ar[i].setAddress(sc.next());
				
				System.out.println("1 rows updated");
				break;
			}//if
		}//for
		
		if(i==5) { //for i �� �� ���� ã�� ȸ����  ���°� 
			System.out.println("ã�� ȸ���� �����ϴ�");
		}

	}
	
	public void delete() {
		System.out.println("�ڵ��� ��ȣ �Է�:");
		String phone = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getPhone().equals(phone)) {
				ar[i]=null;
				System.out.println("1 rows deleted");
				break;
			}//if
		}//for
		if(i==5) { //for i �� �� ���� ã�� ȸ����  ���°� 
			System.out.println("ã�� ȸ���� �����ϴ�");
		}//if
	}
}
