package abstract_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("Today:"+date);
		SimpleDateFormat sdf=new SimpleDateFormat("y년 MM월 dd일 E요일 H:m:s");
		System.out.println("오늘날짜: "+sdf.format(date));
		System.out.println();
		
		SimpleDateFormat input=new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth=input.parse("19910716103518"); //String -> Date로 변환 
		System.out.println("내 생일: "+birth);
		System.out.println("내 생일:  "+sdf.format(birth));
		System.out.println();
		
	//	Calendar cal = new Calendar(); -추상이라 에러, 이미 안에 자식클래스가 있음 
		Calendar cal = new GregorianCalendar();//Sub class 이용한 생성 
		Calendar cal2 = Calendar.getInstance(); //메소드를 이용한 생성 
	//	int year = cal.get(Calendar.YEAR);
		int year =cal.get(1);
		int month = cal.get(Calendar.MONTH)+1; //1월 - 0 
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK);//일요일 - 1
		
		String dayOfWeek=null;
		switch(week) {
			case 1: dayOfWeek="일요일";break;
			case 2: dayOfWeek="월요일";break;
			case 3: dayOfWeek="화요일";break;
			case 4: dayOfWeek="수요일";break;
			case 5: dayOfWeek="목요일";break;
			case 6: dayOfWeek="금요일";break;
			case 7: dayOfWeek="토요일";break;
		}
		
		System.out.println("오눌 날짜: "+year+"년"
					+month+"월"+
					day+"일"+
					dayOfWeek
					);
		}

	
}
