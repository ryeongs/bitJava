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
		System.out.println("�迭��a="+a.toString());
		//������� 
//		for(int i=0; i<a.length;i++) {
//			System.out.println("a["+i+"]"+"="+a[i]);//+"*"+i+"="+a[i]*i
//		}
		//�Ųٷ� ���
//		for(int i=a.length-1; i>=0;i--) {
//			System.out.println("a["+i+"]"+"="+a[i]);
//		}
//		//Ȧ���� ���
//		System.out.println("Ȧ��");
//		for(int i=0; i<a.length;i++) {
//			if(a[i]%2==1)System.out.println("a["+i+"]"+"="+a[i]);
//		}
		//Ȯ�� for ���ȣ ������� �����͸� ���(�ּ� ��)
		System.out.println("Ȯ��for");
		for(int data:a) {//a�� ũ�⸸ŭ �ݺ��ϸ鼭 �����͸� �����ش�.
			System.out.println(data);
		}
		System.out.println();
	}
}
