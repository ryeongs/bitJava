package array;

public class MultiArray {

	public static void main(String[] args) {
		int[][] ar= new int[3][2];
		
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		
		ar[2][0]=50;
		ar[2][1]=60;
		System.out.println("배열명="+ar);

		for(int i=0;i<ar.length;i++) {//행
			for(int j=0;j<ar[i].length;j++) {//열
				System.out.println("ar["+i+"]["+j+"] = "+ar[i][j]);
			}
			System.out.println();
		}
	}

}
