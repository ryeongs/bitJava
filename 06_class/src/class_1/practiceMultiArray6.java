package class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practiceMultiArray6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt;
		System.out.println("�ο���: ");
		cnt=Integer.parseInt(br.readLine());
		String name[] =new String[cnt];
		int subjectCnt[]=new int[cnt];
		String[][]subject=new String[cnt][];
		double[][]jumsu=new double[cnt][];
		
		for(int i=0;i<cnt;i++) {
			System.out.println("�̸��Է�: ");
			name[i]=br.readLine();
			System.out.println("����� �Է�:");
			subjectCnt[i]=Integer.parseInt(br.readLine());
			subject[i]=new String[subjectCnt[i]];
			jumsu[i]=new double[subjectCnt[i]+2];
			
			for(int j=0; j<subjectCnt[i];j++) {
				System.out.print("����� �Է�: ");
				subject[i][j]=br.readLine();
			}
			for(int j=0;j<subjectCnt[i];j++) {
				System.out.print(subject[i][j]+"�����Է�: ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				jumsu[i][jumsu[i].length-2]+=jumsu[i][j];
			}
			jumsu[i][jumsu[i].length-1]+=jumsu[i][jumsu[i].length-2]/subjectCnt[i];
			System.out.println("=====================================");
		}
		for(int i=0; i<cnt;i++) {
			System.out.println("�̸�\t");
			for(int j=0; j<subjectCnt[i];j++) {
				System.out.println(subject[i][j]+"\t");
				
			}
			System.out.println("����\t��� \n");
			System.out.print(name[i]+ "\t");
			for(int j=0;j<jumsu[i].length-1;j++) {
				System.out.print((int)jumsu[i][j]);
			}
			System.out.print(String.format("%.2f", jumsu[i][jumsu[i].length-1]));
			System.out.println();
		}
	}

}
