package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//순서대로,중복 허용가능
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");
		//list.add(25); -int
		//list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		//반복문
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String a:list) {
			System.out.println(a);
		}
		

	}

}
