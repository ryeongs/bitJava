package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>(); 
		//중복허용 안됨, 순서대로 안됨
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이");//중복허용 안됨
		set.add("기린");
		set.add("코끼리");
		
		Iterator<String> it=set.iterator(); //생성
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
	}
}
