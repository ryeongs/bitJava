package abstract_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		// 3자리마다 , 찍고 소수이하 3째자리
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();

		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		// 3자리마다 , 찍고 소수이하 3째자리
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();

		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		// 3자리마다 , 찍고 소수이하 3째자리
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();

		// NumberFormat nf4= NumberFormat.getInstance(); //메소드를 통해서 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();// 원화 표시
		nf4.setMaximumFractionDigits(2);
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();

		// NumberFormat nf4= NumberFormat.getInstance(); //메소드를 통해서 생성
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.CANADA);// 캐불 표시
		nf5.setMaximumFractionDigits(2); //
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
	}

}
