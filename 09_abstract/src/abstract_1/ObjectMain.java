package abstract_1;
/*
 * class Object{
 * public String toString(){}
 */

//class Object{
//	public String toString() { 
//		return null;}
//	public int hashCode() { //���ڿ�(���Ѵ�)
//		return 0;}
//	public boolean equals(Object ob) {
//		return false;}	
//}

class Test extends Object{
	@Override
	public String toString(){return getClass()+"@���ٺ�";} 
	
}
//-----------------
public class ObjectMain {
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t="+t);
		System.out.println("��üt = "+t.toString());
		System.out.println("��üt="+t.hashCode());
		System.out.println();
		
		String str="apple";
		System.out.println("��ü t="+str);
		System.out.println("��üt = "+str.toString());
		System.out.println("��üt="+str.hashCode()); //10����
		System.out.println();
		
		String aa=new String("apple");
		String bb=new String("apple");
		System.out.println("aa==bb: "+(aa==bb));//������ f
		System.out.println("aa.equals(bb) : "+aa.equals(bb));//���ڿ� t
		System.out.println();
		
		Object cc=new Object();
		Object dd=new Object();
		System.out.println("cc==dd: "+(cc==dd));//������ -f
		System.out.println("cc.equals(dd) : "+cc.equals(dd));//������ -f
		System.out.println();
		
		Object ee=new String("apple");//�������̵��̹Ƿ� �ڽ�equals�� ó���ȴ�
		Object ff=new String("apple");
		System.out.println("ee==ff: "+(ee==ff));//������ -t
		System.out.println("ee.equals(ff) : "+ee.equals(ff));//������ -f
		System.out.println();
	}
	
}
