package inheritance;

class AAA{}

class BBB extends AAA{}

public class InstanceOf {

	public static void main(String[] args) {
		AAA aa=new AAA();
		BBB bb=new BBB();
		AAA aa2= new BBB(); //자식을 부모에 넣음 
		
		AAA aa3=aa;
		
		
		if(aa instanceof AAA) System.out.println("1.True");
		else System.out.println("1.False");

		AAA aa4 = bb; 
		if(bb instanceof AAA )System.out.println("2.True");
		else System.out.println("2.False");
		
		//BBB bb2 =(BBB) aa; //자식=(자식)부모
		if(aa instanceof BBB) System.out.println("3.True");
		else System.out.println("3.False");
		
		BBB bb3=(BBB)aa2; //자식을 부모에 넣음 부모는 자식이있는지 모른다 그래서 안됨
		if(aa2 instanceof BBB) System.out.println("4.True");
		else System.out.println("4.False");
		
	}

}
