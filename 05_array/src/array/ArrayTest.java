package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ar = new int[] {10,20,30};
		int[] a;
		a = new int[5];
		int dan=3;
		a[0]=25;
		a[1]=36;
		a[2]=47;
		a[3]=55;
		a[4]=60;
		System.out.println("배열명a="+a.toString());
		//순서대로 
//		for(int i=0; i<a.length;i++) {
//			System.out.println("a["+i+"]"+"="+a[i]);//+"*"+i+"="+a[i]*i
//		}
		//거꾸로 출력
//		for(int i=a.length-1; i>=0;i--) {
//			System.out.println("a["+i+"]"+"="+a[i]);
//		}
//		//홀수만 출력
//		System.out.println("홀수");
//		for(int i=0; i<a.length;i++) {
//			if(a[i]%2==1)System.out.println("a["+i+"]"+"="+a[i]);
//		}
		//확장 for 방번호 상관없이 데이터만 출력(주소 모름)
		System.out.println("확장for");
		for(int data:a) {//a의 크기만큼 반복하면서 데이터릉 꺼내준다.
			System.out.println(data);
		}
		System.out.println();
	}
}
