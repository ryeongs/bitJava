package constructor;


public class VarArgs {
 //������ �����Ӱ� ���� 
	public int sum(int...ar) { //�迭ȭ�۾�
		 //�迭�� �ްٴ�
		int tot = 0;
		for(int i=0;i<ar.length;i++) {
			tot+=ar[i];
		}
		return tot;
	}
	
	public static void main(String[] args) {
		VarArgs va=new VarArgs();
		System.out.println("��= "+va.sum(10,20));
		System.out.println("��= "+va.sum(10,20,30));
		System.out.println("��= "+va.sum(10,20,30,40));

	}



}
