package pro_inheritanceAssign;

import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο��� �Է�: " );
		int size = sc.nextInt();
		
		ExamAssign1[] exam = new ExamAssign1[size]; //��ü�迭 �迭�� �����Ѱ�!! Ŭ������ �����Ѱ� �ƴ�
		
		for(int i = 0; i<size; i++) {
			exam[i]=new ExamAssign1();
			exam[i].compare();
		}

		System.out.println("�̸�\t1 2 3 4 5\t����");

		for(int i = 0; i<size; i++) {
			
			System.out.print(exam[i].getName()+"\t");
			
			for(int j=0; j<exam[i].getOx().length;j++) {
				System.out.print(exam[i].getOx()[j]+" ");
			}
			System.out.println("\t"+ exam[i].getScore());
		}//for i
		
		
	}
}
