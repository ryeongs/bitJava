package inheritance;

import java.util.Scanner;


public class ExamMainAssign1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� �Է�: ");
		int person=sc.nextInt();
		ExamAssign1 ar[]=new ExamAssign1[person];
		String name ;
		String dap;
		for(int i =0; i<person;i++) {
			
			System.out.print("�̸� �Է�: ");
			name = sc.next();
			
			System.out.print("�� �Է�:");
			dap=sc.next();
			ar[i] = new ExamAssign1(name, dap);
		}

		System.out.println("�̸�\t1 2 3 4 5\t����");
		for(int i=0;i<person;i++) {
			
			System.out.print(ar[i].getName()+"\t");
			ar[i].compare();
			System.out.println("\t"+ar[i].getScore());
//			System.out.print(ar[i].getOx());
//			System.out.print(ar[i].getScore());

		}

		
		
	}

}
