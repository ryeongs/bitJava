package instance;

public class Operator {
	public static void main(String[] args) {
		int a=5;
		a+=2;
		a*=3;
		System.out.println("a= "+a);
		a++;
		System.out.println("a= "+a);
		
		int b=a++;
		System.out.println("a= "+a+"\t b="+b);
	
		int c =++a -b--;
		System.out.println("a= "+a+"\t b="+b+"\tc= "+c);
		
		System.out.println(a++);
		System.out.println(a);
	}
}
