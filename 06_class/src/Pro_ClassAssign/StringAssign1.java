package Pro_ClassAssign;

import java.util.Scanner;

public class StringAssign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0;//��ġ
		int count=0;//����
		
		System.out.println("���ڿ� �Է�: ");
		String str = sc.next();
		 
		System.out.println("���� ���ڿ� �Է�: ");
		String target = sc.next();
		 
		System.out.println("�م� ���ڿ� �Է�: ");
		String replacing = sc.next();
		
		if(str.length() <target.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
			return;
		}
		
		str=str.toLowerCase();
		target=target.toLowerCase();
		//index ��ġ���� target�� ã�ƶ�
		while(str.indexOf(target, index)!=-1) {
			index +=target.length();
			count++;
		}//while
		
		System.out.println(str.replace(target, replacing));
		System.out.println(count+"�� ġȯ");	

	}

}
