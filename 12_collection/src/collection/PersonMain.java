package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		PersonMain pm=new PersonMain();
		PersonDTO aa= new PersonDTO("ȫ�浿",25);
		PersonDTO bb= new PersonDTO("�ڳ�",5);
		PersonDTO cc= new PersonDTO("��ġ",40);
		
		ArrayList<PersonDTO> list =new ArrayList<PersonDTO>();
		//�ּҴ��
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list; //�ּ� �ѱ�
	}
	public static void main(String[] args) {
		PersonMain pm =new PersonMain();
		//�ּ� ���� ����
		ArrayList<PersonDTO> list= pm.init();
		//for�� 3���� ��� 
		//1
		for(int i =0;i<list.size();i++) {
			System.out.println("�̸�"+list.get(i).getName()
					+"\t����: "+list.get(i).getAge());
		}
		System.out.println("--------------------");
		//2
		for(PersonDTO data:list) {
//			System.out.println("�̸�"+data.getName()
//					+"\t����: "+data.getAge());
			System.out.println(data); //3
		}
		System.out.println("--------------------");
		
		Iterator <PersonDTO> it= list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
