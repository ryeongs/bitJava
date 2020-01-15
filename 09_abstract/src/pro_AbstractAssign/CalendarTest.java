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
			cal.set(year, month-1,1); //1일 셋팅
			int end =cal.getActualMaximum(cal.DATE); //달의 마지막 날짜
			int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //요일 (1=일요일 ...7=토요일)
			
			for(int i = 1;i<=end; i++) { //i = day
				if(i==1) {
					for(int j=1; j<dayOfWeek; j++) {
						System.out.print("    ");
					}//for j 공백 채우기 
				}
				if(i<10) { //한자릿수 경우 공백을 추가해서 줄맞추기
					System.out.print(" ");
				}
				System.out.print(" "+i+" "); //날짜 뿌리기 
				if(dayOfWeek%7==0) { //한줄에 7개 씩
					System.out.println();
				}
				dayOfWeek++;
			}//for i
		}
		
		public void display(){
			System.out.println("년도를 입력하세요 : ");
			year= sc.nextInt();
			System.out.println("월를 입력하세요 : ");
			month= sc.nextInt();
			
			System.out.println("[ "+year+"년 ]"+"[" +month+"월 ]");
			System.out.println("   일     월    화     수     목     금    토");
			

		}

	}


