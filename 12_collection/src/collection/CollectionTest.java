package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * interface 
 * 1.��� �޼ҵ带 Override
 * 2.�͸�Ŭ����- ��� �߻�޼ҵ带override
 * 3.implements ������ִ� Ŭ����
 * 4.�޼ҵ�
 */
@SuppressWarnings("all")
public class CollectionTest {
	public static void main(String[] args) {
		Collection coll=new ArrayList();
		//collection(�θ�)�� �ؼ� �ڽ����� �ִ� get�� ���� �Ұ� 
		
		//����, Ÿ�� ������� �ȴ�, �ߺ����
		coll.add("ȣ����");
		coll.add("����");
		coll.add("ȣ����");
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڳ���");
		
		Iterator it=coll.iterator(); //����
		it.hasNext(); //�׸��� ������ true ������ false 
		it.next();// ���� ��ġ�� �׸��� ������ �������� �̵�
		
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		
	}

}
