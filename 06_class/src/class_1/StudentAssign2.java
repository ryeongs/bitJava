package class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentAssign2 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int subjectCnt = 0;
		double avg = 0;
		int tot = 0;
		int jumsu = 0;
		
		int temp;
		System.out.print("�ο���: ");
		cnt =Integer.parseInt(br.readLine());
		
		String[] name =new String[cnt];
		String [][] ar= new String[cnt][];
		//String[] subject=new String[cnt+1];

		for(int i=0; i<=ar.length;i++) {
			System.out.print("�̸��Է�: ");
			name[i]=new String(br.readLine());
			
			System.out.print("����� �Է�: ");
			subjectCnt=Integer.parseInt(br.readLine());
			
			for(int j=0; j<subjectCnt;j++) {
				ar[i] = new String[j];
				System.out.print("����� �Է�: ");
				ar[i][j]=br.readLine();
				//subject[subjectCnt]=ar[i][j];
			
			}
			for(int x=0; x<subjectCnt;x++) {
				System.out.print(ar[i][x]+"���� �Է�: ");
				jumsu=Integer.parseInt(br.readLine());
			}
			tot+=jumsu;
			avg=(double)(tot/subjectCnt);
			System.out.print("�̸�: "+name[i]+"\t����: "+"\t����: "+tot+"\t���"+avg);	
			
			}
			
		}
}


