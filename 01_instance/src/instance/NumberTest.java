package instance;

/*
 * Practice 01
 * 320,258�� ������ �����Ͽ� ���� ���Ͻÿ�.
 * 
 * [������]
 * 320+258=xxx
 * 320-258=xxx
 * 320*258=xxx
 * 320/258=xxx
 */
public class NumberTest {

	public static void main(String[] args) {
		//Test
		int a=320;
		int b=258;
		int sum=a+b;
		//sum
		System.out.println("a("+a+")"+"+b("+b+")="+sum);
		//sub
		int sub=a-b;
		System.out.println("a("+a+")"+"-b("+b+")="+sub);
		//mul
		int mul=a*b;
		System.out.println("a("+a+")"+"*b("+b+")="+mul);
		//div
		double div=(double)a/b;
		System.out.println("a("+a+")"+"/b("+b+")="+String.format("%.2f",div));

	}

}
