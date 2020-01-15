package collection_Assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

//��ȣ, �̸�, ����, ����, ���� 
public class SungJukService {
	Scanner sc = new Scanner(System.in);
	ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

	public void menu() {
		int num = 0;
		while (true) {
			System.out.println("*************");
			System.out.println("  1. �Է�");
			System.out.println("  2. ���");
			System.out.println("  3. �˻�");
			System.out.println("  4. ����");
			System.out.println("  5. ����");
			System.out.println("  6. ����");
			System.out.println("*************");
			System.out.print("  ��ȣ : ");
			num = sc.nextInt();
			if (num == 6)
				break;

			if (num == 1)
				this.insertArticle(); // �� Ŭ���� �ȿ� �մ� �Լ��� ���
			else if (num == 2)
				this.printArticle();
			else if (num == 3)
				this.searchArticle();
			else if (num == 4)
				this.deleteArticle();
			else if (num == 5)
				this.sortArticle();

		} // while
	}

	private void insertArticle() {
		SungJukDTO dto = new SungJukDTO();

		System.out.println("----------------------");
		System.out.print("�̸� �Է� : ");
		dto.setName(sc.next());
		System.out.print("��ȣ �Է� : ");
		dto.setNum(sc.nextInt());
		System.out.print("����  �Է� : ");
		dto.setKor(sc.nextInt());
		System.out.print("����  �Է� : ");
		dto.setEng(sc.nextInt());
		System.out.print("���� �Է�");
		dto.setMath(sc.nextInt());
		dto.calc();
		list.add(dto);
	}

	public void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t���� \t����\t����\t��� ");
		for (SungJukDTO dto : list) {
			System.out.println(dto);
		}
	}

	public void searchArticle() {
		System.out.println("ã���� �� �̸� �Է�:");
		String name = sc.next();
		int i;
		int count = 0;
		for (SungJukDTO dto : list) {
			if (dto.getName().equals(name)) {
				System.out.println(dto);
				count++;
			}
		}
		if (count == 0)
			System.out.println("ã�� ȸ���� �����ϴ�");
	}

	public void deleteArticle() {
		System.out.println("������ �̸� �Է�:");
		String name = sc.next();
		int count = 0;
		
		Iterator<SungJukDTO> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO dto = it.next();

			if (dto.getName().equals(name)) {
				it.remove();
				count++;
			}
		}//while
		if(count==0)System.out.println("ã�� ȸ���� �����ϴ�");
		else System.out.println(count+"�� �����Ϸ�");
		
	}

	public void sortArticle() {
		int num = 0;
		while(true) {
			System.out.println();
			System.out.println("1.�̸����� ��������");
			System.out.println("2.�������� ��������");
			System.out.println("3.�����޴�");
			System.out.println("��ȣ �Է�: ");
			num=sc.nextInt();
			if(num==3) break;
			
			if(num==1) {
				Comparator<SungJukDTO> com=new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
				};
				Collections.sort(list,com);
				printArticle();
				
			}
			if(num==2) {
				Collections.sort(list);
				printArticle();
				
			}
		}//while

	}

}
