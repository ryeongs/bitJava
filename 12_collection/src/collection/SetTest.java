package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>(); 
		//�ߺ���� �ȵ�, ������� �ȵ�
		set.add("ȣ����");
		set.add("����");
		set.add("ȣ����");//�ߺ���� �ȵ�
		set.add("�⸰");
		set.add("�ڳ���");
		
		Iterator<String> it=set.iterator(); //����
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
	}
}
