package Pro_Forassign4;

public class assign7 {

	public static void main(String[] args) {
		int dan,i,j;
		for(int w=2;w<=8;w+=3) { //2�ܺ��� 
			for(i=1;i<=9;i++) {				//W1 W2 W3 -(W1 - W3)=2
				for(dan=w;dan<=w+2;dan++) { //2�� 3�� 4�� -w3�� 
										//5�� 6�� 6��  -w3��
					if(dan!=10)					// ...
					System.out.print(dan+"*"+i+"="+dan*i+"\t");
				}
				System.out.println();
			}//for dan
			System.out.println();
		}//for w
	}

}
