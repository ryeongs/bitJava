package array;

public class MultiArray5 {

	public static void main(String[] args) {
		
		
		
		
		
		int [][] ar= new int[2][];
		
		ar[0] =new int[2];
		ar[1]=new int[2];
		
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=0; j<ar[i].length;j++) {
				System.out.print("����:"+i+"]["+j+"]"+"="+ar[i][j]);
			}
			System.out.println();
		}
	}

}


