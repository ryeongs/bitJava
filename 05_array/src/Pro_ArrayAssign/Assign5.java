package Pro_ArrayAssign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Assign5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("인원수: ");
		int cnt=Integer.parseInt(br.readLine());
		
		String[] name=new String[cnt]; //인원수 설정
		String[][]subject =new String[cnt][]; //가변 배열 언제든지 과목 개수가 달라질 수있다
		int [][] jumsu=new int[cnt][];
		int subjectCnt; //저장할 필요없음 쓰고버리고 쓰고 버리고 
		double[] avg=new double[cnt];
		DecimalFormat df= new DecimalFormat("##.#");

		for(int i=0; i<cnt;i++) {
			System.out.print("이름 입력: ");
			name[i] =br.readLine();
			
			System.out.print("과목수 입력: ");
			subjectCnt=Integer.parseInt(br.readLine());
			subject[i]=new String[subjectCnt]; //한사람당 몇과목 잡을지
		
			for(int j=0; j<subjectCnt;j++) {
				System.out.print("과목명 입력: ");
				subject[i][j]=br.readLine();
			}//for j
			
			jumsu[i]=new int[subjectCnt+1]; //신축공사 총점방 만듦
			
			for(int j=0;j<subjectCnt;j++) {
				System.out.print(subject[i][j]+" 점수입력: ");
				jumsu[i][j]=Integer.parseInt(br.readLine()); 

				//총점 
				jumsu[i][subjectCnt] += jumsu[i][j]; // 
			}//for j
			
			//평균
			avg[i] =(double)jumsu[i][subjectCnt] /subjectCnt;
			System.out.println("=============================");
		}//for i
		
		//출력
		for(int i=0; i<cnt; i++) {
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length;j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("총점\t평균");
			
			System.out.print(name[i]+"\t");
			for(int j=0;j<jumsu[i].length;j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(df.format(avg[i]));
			System.out.println();
		}//for i
	}

}
