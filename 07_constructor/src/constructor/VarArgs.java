package constructor;


public class VarArgs {
 //개수를 자유롭게 구현 
	public int sum(int...ar) { //배열화작업
		 //배열로 받겟다
		int tot = 0;
		for(int i=0;i<ar.length;i++) {
			tot+=ar[i];
		}
		return tot;
	}
	
	public static void main(String[] args) {
		VarArgs va=new VarArgs();
		System.out.println("합= "+va.sum(10,20));
		System.out.println("합= "+va.sum(10,20,30));
		System.out.println("합= "+va.sum(10,20,30,40));

	}



}
