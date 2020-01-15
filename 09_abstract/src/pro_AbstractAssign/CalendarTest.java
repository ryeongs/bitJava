package pro_AbstractAssign;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	Scanner sc = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int year, month;
		public static void main(String[] args) {
		
			CalendarTest cal= new CalendarTest();
			cal.display();
			cal.calculator();
		}
		
		public void calculator() {
			cal.set(year, month-1,1); //1�� ����
			int end =cal.getActualMaximum(cal.DATE); //���� ������ ��¥
			int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //���� (1=�Ͽ��� ...7=�����)
			
			for(int i = 1;i<=end; i++) { //i = day
				if(i==1) {
					for(int j=1; j<dayOfWeek; j++) {
						System.out.print("    ");
					}//for j ���� ä��� 
				}
				if(i<10) { //���ڸ��� ��� ������ �߰��ؼ� �ٸ��߱�
					System.out.print(" ");
				}
				System.out.print(" "+i+" "); //��¥ �Ѹ��� 
				if(dayOfWeek%7==0) { //���ٿ� 7�� ��
					System.out.println();
				}
				dayOfWeek++;
			}//for i
		}
		
		public void display(){
			System.out.println("�⵵�� �Է��ϼ��� : ");
			year= sc.nextInt();
			System.out.println("���� �Է��ϼ��� : ");
			month= sc.nextInt();
			
			System.out.println("[ "+year+"�� ]"+"[" +month+"�� ]");
			System.out.println("   ��     ��    ȭ     ��     ��     ��    ��");
			

		}

	}


