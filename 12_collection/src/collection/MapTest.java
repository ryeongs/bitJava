package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		//Value, key 중복 허용
		map.put("book101","백설공주");
		map.put("book201","인어공주");
		map.put("book102","백설공주");
		map.put("book301","피오나");
		map.put("book101","엄지공주");
		
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
