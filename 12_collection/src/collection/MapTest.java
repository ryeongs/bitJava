package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		//Value, key �ߺ� ���
		map.put("book101","�鼳����");
		map.put("book201","�ξ����");
		map.put("book102","�鼳����");
		map.put("book301","�ǿ���");
		map.put("book101","��������");
		
		System.out.println(map.get("book101"));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Code: ");
		String code=sc.next();
		
//		if(map.get(code)==null) {
//			System.out.println(code+"NotFound code");
//		}else
//			System.out.println(map.get(code));
		
		if(map.containsKey(code)) 
			System.out.println(map.get(code));
		else
			System.out.println(code+"NotFound code");
			
		
	
	}
	

}
