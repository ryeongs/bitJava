package class_1;

public class ShapeAssign2 {

	public static void main(String[] args) {
		ShapeAssign1 area = new ShapeAssign1();
		
		area.area(3);
		System.out.println("¿øÀÇ ³ĞÀÌ: "+area.getAreaOne());
		area.area(5,7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: "+area.getAreaT());
		area.area(2,3,5);
		System.out.println("»ç´Ù¸®²ÃÀÇ ³ĞÀÌ: "+area.getAreaNemo());
		

	}

}
