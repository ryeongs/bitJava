package instance;

public class CompTest {

	public static void main(String[] args) {
		int score=60;
		String result = score>=80 && score<=100 ? "�հ�":"���հ�";
		System.out.println("���="+result);		
		
		result = score%2==0 ? "¦��":"Ȧ��";
		System.out.println("���="+result);		

		int b=30;
		result = score > b ? "score":"b";// could be score+"" : b+""; 
		System.out.println("ū��="+result);		
		 
		
	}

}
