package class_1;

public class ShapeAssign2 {

	public static void main(String[] args) {
		ShapeAssign1 area = new ShapeAssign1();
		
		area.area(3);
		System.out.println("���� ����: "+area.getAreaOne());
		area.area(5,7);
		System.out.println("�ﰢ���� ����: "+area.getAreaT());
		area.area(2,3,5);
		System.out.println("��ٸ����� ����: "+area.getAreaNemo());
		

	}

}
