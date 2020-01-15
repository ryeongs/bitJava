package instance;

public class Operator3 {

	public static void main(String[] args) {
		boolean a =25>36;
		System.out.println("a="+a);
		System.out.println("a!="+!a);
		
		
		String b ="apple"; //문자열literal
		String c=new String("apple");
	
		//주소가 같은지 물어보는것
		if(b==c) System.out.println("same");
		else if(b!=c) System.out.println("true");
		//자바의 경우) 주소=참조값 

		System.out.println("b.equals(c) : "+(b.equals(c) ? "same":"different"));
		System.out.println("b.equals(c) T or F: "+(!b.equals(c) ? "true":"false"));

	}
	

}
