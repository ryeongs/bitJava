package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * interface 
 * 1.모든 메소드를 Override
 * 2.익명클래스- 모든 추상메소드를override
 * 3.implements 대신해주는 클래스
 * 4.메소드
 */
@SuppressWarnings("all")
public class CollectionTest {
	public static void main(String[] args) {
		Collection coll=new ArrayList();
		//collection(부모)로 해서 자식한테 있는 get에 접근 불가 
		
		//순서, 타입 상관없이 된다, 중복허용
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it=coll.iterator(); //생성
		it.hasNext(); //항목이 있으면 true 업으면 false 
		it.next();// 현재 위치의 항목을 꺼내고 다음으로 이동
		
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		
	}

}
