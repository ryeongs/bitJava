package method;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a/3; //cast연산-형변환
		
		int c=5;
		Integer d = c; //AutoBoxing 기본형 ->객체형 (기본형을 객체로 만드는것)
		//Integer d= new Integer(c); JDK 5.0버전
		
		Integer e=5;
		int f = e; //unAutoBoxing 객체형을 기본형으로 만드는것 
		//int f = e.intValue(); JDk 5.0 이전
	}

}
