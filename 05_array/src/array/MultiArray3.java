package array;

public class MultiArray3 {

	public static void main(String[] args) {
		int[][] ar= {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0,}};

		//�Է�
		for(int i=0;i<ar.length-1;i++) { //������ 0,0,0,0 �� ���� �������� -1
			for(int j=0;j<ar[i].length-1;j++) {
				ar[i][3] += ar[i][j];//������
			//r[3][i] +=ar[j][i];//������
			//r[3][j] += ar[i][j];
			//r[3][3] += ar[i][j];
			}
			System.out.println();
		}
		// ���
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}

}
