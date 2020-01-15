package Pro_ArrayAssign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Assign5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ο���: ");
		int cnt=Integer.parseInt(br.readLine());
		
		String[] name=new String[cnt]; //�ο��� ����
		String[][]subject =new String[cnt][]; //���� �迭 �������� ���� ������ �޶��� ���ִ�
		int [][] jumsu=new int[cnt][];
		int subjectCnt; //������ �ʿ���� ��������� ���� ������ 
		double[] avg=new double[cnt];
		DecimalFormat df= new DecimalFormat("##.#");

		for(int i=0; i<cnt;i++) {
			System.out.print("�̸� �Է�: ");
			name[i] =br.readLine();
			
			System.out.print("����� �Է�: ");
			subjectCnt=Integer.parseInt(br.readLine());
			subject[i]=new String[subjectCnt]; //�ѻ���� ����� ������
		
			for(int j=0; j<subjectCnt;j++) {
				System.out.print("����� �Է�: ");
				subject[i][j]=br.readLine();
			}//for j
			
			jumsu[i]=new int[subjectCnt+1]; //������� ������ ����
			
			for(int j=0;j<subjectCnt;j++) {
				System.out.print(subject[i][j]+" �����Է�: ");
				jumsu[i][j]=Integer.parseInt(br.readLine()); 

				//���� 
				jumsu[i][subjectCnt] += jumsu[i][j]; // 
			}//for j
			
			//���
			avg[i] =(double)jumsu[i][subjectCnt] /subjectCnt;
			System.out.println("=============================");
		}//for i
		
		//���
		for(int i=0; i<cnt; i++) {
			System.out.print("�̸�\t");
			for(int j=0; j<subject[i].length;j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("����\t���");
			
			System.out.print(name[i]+"\t");
			for(int j=0;j<jumsu[i].length;j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(df.format(avg[i]));
			System.out.println();
		}//for i
	}

}
