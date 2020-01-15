package instance;

public class CompTest {

	public static void main(String[] args) {
		int score=60;
		String result = score>=80 && score<=100 ? "합격":"불합격";
		System.out.println("결과="+result);		
		
		result = score%2==0 ? "짝수":"홀수";
		System.out.println("결과="+result);		

		int b=30;
		result = score > b ? "score":"b";// could be score+"" : b+""; 
		System.out.println("큰값="+result);		
		 
		
	}

}
