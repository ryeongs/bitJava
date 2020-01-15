package array;

public class MultiArray3 {

	public static void main(String[] args) {
		int[][] ar= {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0,}};

		//입력
		for(int i=0;i<ar.length-1;i++) { //마지막 0,0,0,0 에 합을 넣을려고 -1
			for(int j=0;j<ar[i].length-1;j++) {
				ar[i][3] += ar[i][j];//가로합
			//r[3][i] +=ar[j][i];//세로합
			//r[3][j] += ar[i][j];
			//r[3][3] += ar[i][j];
			}
			System.out.println();
		}
		// 출력
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}

}
