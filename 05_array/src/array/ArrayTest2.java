package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int size=(int)(Math.random()*4+2);//2~10
		
		String[] ar;
		ar =new String[size];

		System.out.println("�迭�� ar="+ar);
		System.out.println("�迭ũ�� ar="+ar.length); //length �Ϲ� ��ɾ�,�迭�� ()�� ����
		
		for(int i=0;i<ar.length;i++) {
			System.out.print("���ϸ� �Է�:");
			ar[i]=br.readLine();
		}
		for (String data: ar) {
			System.out.println(data);
			System.out.println("ù��° ����="+data.charAt(0));
			System.out.println("���ڿ� ũ��="+data.length()); //length() �Լ�
			System.out.println("���ڿ� ��ġ="+data.indexOf("��"));// ���ڿ��� ��ġ�� ã�°�
			System.out.println("���ڰ����°��"+data.indexOf("��"));//���°�� -1 ���
			System.out.println();
		}
	}

}
