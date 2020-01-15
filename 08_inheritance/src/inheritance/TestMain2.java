package inheritance;
class AA{
	public int a=3;
	public void disp() {
		a+=5;
		System.out.println("AA : "+a+" ");
	}
}
class BB extends AA{
	public int a=8;
	public void disp() {
		this.a+=5;
		System.out.println("BB : "+a+" ");
	}
}
//===========================================
public class TestMain2 {

	public static void main(String[] args) {
		BB bb=new BB();
		bb.disp();//BB: 13
		System.out.println(bb.a);

		AA aa=new BB(); //부모=자식 참조가능
		aa.disp(); //BB: 13
		System.out.println(aa.a); //3 변수는 override, overload 개념 없음!!!!!
		
		BB bb2 = (BB)aa;
		System.out.println(bb2.a);
	}

}
