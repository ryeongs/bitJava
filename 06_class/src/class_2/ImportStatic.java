package class_2;
import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.String.format;
public class ImportStatic {

	public static void main(String[] args) {
		System.out.println("난수="+Math.random());
		System.out.println("제곱="+pow(2,5));
		System.out.println("소수이하 2째자리="+format("%.2f",12.34567));
	
	}

}
