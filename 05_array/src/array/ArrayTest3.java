package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		ArrayTest3 arr=new ArrayTest3();

		System.out.print("배열크기 ar=");
		int size=Integer.parseInt(arr.br.readLine());
		System.out.println("[실행결과]");

		int [] ar;
		ar =new int[size];
		int sum =arr.input(ar);
		int max=arr.max(ar);
		int min=arr.min(ar);
		arr.output(ar, sum, max, min);

		//MAX&MIN
//		int min;
//		int max=min=ar[0];
//		for(int i=1; i<size;i++) {
//			if(ar[i] >max) max=ar[i];
//			if(ar[i] <min) min=ar[i];
//		}

		//output
	}//Main

	public int input(int ar[]) throws IOException {
		//SUM
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			System.out.print("ar["+i+"] : ");
			ar[i]=Integer.parseInt(br.readLine());
			sum+=ar[i];
		}
		return sum;
	}
	public int max(int ar[]) {
		int max=ar[0];
		for(int i=1; i<ar.length;i++) {
			if(ar[i] >max) max=ar[i];
		}
		return max;
	}
	public int min(int ar[]) {
		int min;
		 min=ar[0];
		for(int i=1; i<ar.length;i++) {
			if(ar[i] <min) min=ar[i];
		}
		return min;
	}
	public void output(int[] ar, int sum, int max, int min) {
		for(int data:ar) {
			System.out.print(data+" ");
		}
		//Print MAX&MIN
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		//Print SUM 
		System.out.println("합:"+sum);
	}
}
/*
 * 배열의 크기를 입력받아서 배열을 생성하고 데이터 입력후 출력하시오
 * [실행결과]
 * 배열크기:3
 * ar[0]:25
 * ar[1]:36
   ar[2]:-78
   
   25 36 -78
   합 =
  최대값=
  최소값=
 */