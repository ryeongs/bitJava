package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//�������,�ߺ� ��밡��
		list.add("ȣ����");
		list.add("����");
		list.add("ȣ����");
		//list.add(25); -int
		//list.add(43.8);
		list.add("�⸰");
		list.add("�ڳ���");
		
		//�ݺ���
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String a:list) {
			System.out.println(a);
		}
		

	}

}
