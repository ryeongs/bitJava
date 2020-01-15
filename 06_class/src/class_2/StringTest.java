package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple"; // literal 생성
		String b = "apple"; // literal은 같은 값이 있으면 메모리를 만들지 않는다
							// b는 결국 a의 주소값을 갖게된다.
		if (a == b) {// 주소가 같은지
			System.out.println("a와b의 참조값은 같다");
		} else {
			System.out.println("다르다");
			System.out.println();
		}
		if(a.equals(b)) System.out.println("문자열 같다");
		else System.out.println("문자열은 다르다");


		String c = new String("apple"); // 메모리를 계속 만든다
		String d = new String("apple");// 싱글톤 - new 는 1번만 해야한다, static영역
		// 똑같은 문자열은 한번만 new 해야한다
		if (c == d) {// 주소가 같은지
			System.out.println("a와b의 참조값은 같다");
		} else {
			System.out.println("다르다");
			//System.out.println();
		}
		if(c.equals(b)) System.out.println("문자열 같다");
		else System.out.println("문자열은 다르다");
		
		String e="오늘날짜는 "+2019+12+30;
		System.out.println("e ="+e);
		
		/*
		 * 문자열은 절대 편집이 안되므로 메모리 4번 생성된다
		 * (JVM이 삭제)삭제시 garbage collector로 보낸다
		 * Garbage Collector가 실행되면 컴퓨터는 멈춘다
		 */
		System.out.println("문자열ㅇ크기= "+e.length());
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+":"+e.charAt(i));
		}
		System.out.println("부분문자열 추출="+e.substring(7));
		System.out.println("부분문자열 추출="+e.substring(7,11));//7번부터 10번까지 (11번 전)
		
		System.out.println("대문자 변경="+"Hello".toUpperCase());//HELLO
		System.out.println("소문자 변경="+"Hello".toLowerCase());//hello
		
		System.out.println("문자열 검색="+e.indexOf("짜"));//짜 라는 글자를 찾아라(몇번째인지)
		System.out.println("문자열 검색="+e.indexOf("날짜"));
		System.out.println("문자열 검색="+e.indexOf("개바부")); //없으면 -1 이 나온다
	}
	

}
