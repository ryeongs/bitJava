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
		System.out.println("���α׷��� �����մϴ�");
	}
	public void menu() {
		int num = 0;
		while (true) {
			System.out.println("*************");
			System.out.println("  1. ���");
			System.out.println("  2. ���");
			System.out.println("  3. ����");
			System.out.println("  4. �˻�");
			System.out.println("  5. ����");
			System.out.println("*************");
			System.out.print("  ��ȣ : ");
			num = sc.nextInt();
			if (num == 5)
				break;

			if (num == 1)
				this.insert(); // �� Ŭ���� �ȿ� �մ� �Լ��� ���
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
				break; // ���� for���� �� ���Ҵٴ°� �ѹ��� null���� ���ٴ� ��(=���� ���� �ִ�)
		}
		if (i == ar.length) {
			System.out.println("5�� ������ �� á���ϴ�");
			return;// �޼ҵ带 �����
		}
		System.out.println("----------------------");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("������ �Է� : ");
		String position = sc.next();
		System.out.print("�⺻�� �Է� : ");
		int basePay = sc.nextInt();
		System.out.print("���� �Է� : ");
		int benefit = sc.nextInt();
		
		System.out.println();
		ar[i] = new EmployeeDTO(name, position, basePay,benefit); // ���� ��������

		int cnt = 0;
	//	System.out.println("1 row(s) created");

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				cnt++;
		}
		System.out.println(cnt + " �ڸ��� ���ҽ��ϴ�");
	}

	public void list() {
		System.out.println("�̸�\t����\t�⺻�� \t���� \t����\t���� ");
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
		System.out.println("�̸� �Է�:");
		String name = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.println(
						ar[i] );
				// ------------------------------
				System.out.print("���� �� ���� �Է� : ");
				ar[i].setName(sc.next());

				System.out.print("���� �� �⺻�� �Է� : ");
				ar[i].setBasePay(sc.nextInt());

				System.out.print("���� �� ���� �Է� : ");
				ar[i].setBenefit(sc.nextInt());

			//	System.out.println("1 rows updated");
				break;
			} // if
		} // for

		if (i == 5) { // for i �� �� ���� ã�� ȸ���� ���°�
			System.out.println("ã�� ȸ���� �����ϴ�");
		}

	}
	
	public void search() {
		System.out.println("�̸� �Է�:");
		String name = sc.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.println(
						ar[i]);
				break;
			}
		}
		if (i == 5) { // for i �� �� ���� ã�� ȸ���� ���°�
			System.out.println("ã�� ȸ���� �����ϴ�");
		}
	}
}
