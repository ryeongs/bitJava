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
		SimpleDateFormat sdf=new SimpleDateFormat("y�� MM�� dd�� E���� H:m:s");
		System.out.println("���ó�¥: "+sdf.format(date));
		System.out.println();
		
		SimpleDateFormat input=new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth=input.parse("19910716103518"); //String -> Date�� ��ȯ 
		System.out.println("�� ����: "+birth);
		System.out.println("�� ����:  "+sdf.format(birth));
		System.out.println();
		
	//	Calendar cal = new Calendar(); -�߻��̶� ����, �̹� �ȿ� �ڽ�Ŭ������ ���� 
		Calendar cal = new GregorianCalendar();//Sub class �̿��� ���� 
		Calendar cal2 = Calendar.getInstance(); //�޼ҵ带 �̿��� ���� 
	//	int year = cal.get(Calendar.YEAR);
		int year =cal.get(1);
		int month = cal.get(Calendar.MONTH)+1; //1�� - 0 
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK);//�Ͽ��� - 1
		
		String dayOfWeek=null;
		switch(week) {
			case 1: dayOfWeek="�Ͽ���";break;
			case 2: dayOfWeek="������";break;
			case 3: dayOfWeek="ȭ����";break;
			case 4: dayOfWeek="������";break;
			case 5: dayOfWeek="�����";break;
			case 6: dayOfWeek="�ݿ���";break;
			case 7: dayOfWeek="�����";break;
		}
		
		System.out.println("���� ��¥: "+year+"��"
					+month+"��"+
					day+"��"+
					dayOfWeek
					);
		}

	
}
