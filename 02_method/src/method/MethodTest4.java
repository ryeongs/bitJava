package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		/*
		 * 이름(name),주민번호(id)를 입력하여 성별을 출력
		 * -성별(gender)을 구별하는 comp()메소드, 나이(age)를 계산하는 calcAge() 메소드
		 * [출력]
		 * -이름 입력:
		 * -주민번호 입력:
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4 test4=new MethodTest4();
		
		System.out.print("이름 입력:");
		String name=br.readLine();
		System.out.print("주민번호 입력:");
		String id=br.readLine();
		
		String gender = test4.comp(id.charAt(7));
		
		int j = test4.calcAge(id.substring(0,2),id.charAt(7));
	
		System.out.println("[결과]");
		
		System.out.println("이름:"+name);
		System.out.println("주민번호:"+id);
		System.out.println("나이:"+j);
		System.out.println("성별:"+gender);
	}
	public int calcAge(String age, char c) {
		int result = 0;
		if(c=='3'|| c=='4') {
			result= 2019-(Integer.parseInt(age)+2000)+1;
		}else if(c=='1'||c=='2'){
			result= 2019-(Integer.parseInt(age)+1900)+1;
		}
		/*
		 * int year = Integer.parseInt(id.substring(0,2));
		 * char g=  id.charAt(7);
		 * year+=(g=='1'|| g=='2' ?1900:2000);
		 * int age = 2019-year+1;
		 * return age;
		 */
		return result;
	}
	public String comp(char c) {
		String ForM = null;
		if  (c=='1'||c=='3') return ForM="남자";
		else if (c=='2'||c=='4') return ForM="여자";
		
		return ForM;
	}

}
