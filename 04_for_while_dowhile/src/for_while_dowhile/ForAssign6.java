package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [����5] ���� ���� ���α׷� �߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�
		 */
		char grade = 0;
		double midFin, tot, assign2, check2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�߰���縦 �Է��Ͻÿ� : ");
		int mid = Integer.parseInt(br.readLine());
		System.out.println("�⸻��縦 �Է��Ͻÿ� : ");
		int fin = Integer.parseInt(br.readLine());
		System.out.println("����������  �Է��Ͻÿ� : ");
		int assign = Integer.parseInt(br.readLine());
		System.out.println("�⼮������  �Է��Ͻÿ� : ");
		int check = Integer.parseInt(br.readLine());

		midFin = ((mid + fin) / 2) * ((3.00 / 5));
		check2 = check * ((1.00 / 5));
		assign2 = assign * ((1.00 / 5));
		tot = midFin + assign2 + check2;


		switch((int)tot/10) { 
		case 10: grade = 'A';break;
		case 9: grade = 'A';break;
		case 8: grade = 'B';break;
		case 7: grade = 'C';break;
		case 6: grade = 'D';break;
		case 5: grade = 'F';break;
		
		}
		
		String eval = null;
		switch (grade) {
		case ('A'):
			eval = "excellent";break;
		case ('B'):
			eval = "excellent";break;
		case ('C'):
			eval = "good";break;
		case ('D'):
			eval = "good";break;
		case ('F'):
			eval = "poor";break;

		}

		System.out.println("����=" + String.format("%.2f", tot));
		System.out.println("����=" + grade);
		System.out.println("��=" + eval);

	}

}
