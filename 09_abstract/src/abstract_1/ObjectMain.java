package abstract_1;
/*
 * class Object{
 * public String toString(){}
 */

//class Object{
//	public String toString() { 
//		return null;}
//	public int hashCode() { //문자열(무한대)
//		return 0;}
//	public boolean equals(Object ob) {
//		return false;}	
//}

class Test extends Object{
	@Override
	public String toString(){return getClass()+"@개바뷰";} 
	
}
//-----------------
public class ObjectMain {
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t="+t);
		System.out.println("객체t = "+t.toString());
		System.out.println("객체t="+t.hashCode());
		System.out.println();
		
		String str="apple";
		System.out.println("객체 t="+str);
		System.out.println("객체t = "+str.toString());
		System.out.println("객체t="+str.hashCode()); //10진수
		System.out.println();
		
		String aa=new String("apple");
		String bb=new String("apple");
		System.out.println("aa==bb: "+(aa==bb));//참조값 f
		System.out.println("aa.equals(bb) : "+aa.equals(bb));//문자열 t
		System.out.println();
		
		Object cc=new Object();
		Object dd=new Object();
		System.out.println("cc==dd: "+(cc==dd));//참조값 -f
		System.out.println("cc.equals(dd) : "+cc.equals(dd));//참조값 -f
		System.out.println();
		
		Object ee=new String("apple");//오버라이딩이므로 자식equals가 처리된다
		Object ff=new String("apple");
		System.out.println("ee==ff: "+(ee==ff));//참조값 -t
		System.out.println("ee.equals(ff) : "+ee.equals(ff));//참조값 -f
		System.out.println();
	}
	
}
