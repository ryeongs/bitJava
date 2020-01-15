package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		PersonMain pm=new PersonMain();
		PersonDTO aa= new PersonDTO("홍길동",25);
		PersonDTO bb= new PersonDTO("코난",5);
		PersonDTO cc= new PersonDTO("또치",40);
		
		ArrayList<PersonDTO> list =new ArrayList<PersonDTO>();
		//주소담김
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list; //주소 넘김
	}
	public static void main(String[] args) {
		PersonMain pm =new PersonMain();
		//주소 리턴 받음
		ArrayList<PersonDTO> list= pm.init();
		//for문 3가지 방법 
		//1
		for(int i =0;i<list.size();i++) {
			System.out.println("이름"+list.get(i).getName()
					+"\t나이: "+list.get(i).getAge());
		}
		System.out.println("--------------------");
		//2
		for(PersonDTO data:list) {
//			System.out.println("이름"+data.getName()
//					+"\t나이: "+data.getAge());
			System.out.println(data); //3
		}
		System.out.println("--------------------");
		
		Iterator <PersonDTO> it= list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
