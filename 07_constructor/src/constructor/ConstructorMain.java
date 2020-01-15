package constructor;

class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest() { //기본생성자, void, int,..return타입 불가
		System.out.println("기본 생성자");
	}
	public ConstructorTest(String name)//생성자 오버로드
	{	this();//기본 생성자호출 , 오버로드된 다른 생성자를호출
		this.name=name;
	}
	public ConstructorTest(int age) {//생성자 오버로드
		this("코난"); // 생성자끼리는 서로 호출가능, 맨 윗줄에 호출해야함
		this.age=age;
		
	}
	
	
	public String getName() {return name;}
	public int getAge() {return age;}
	
}

public class ConstructorMain {

	public static void main(String[] args) {
		//생성자는 (new)한번 호출 가능 //수시로 값이 바뀌면 setter
		//생성자는 return type 없다
		//생정가 필요한 이유!!!!!객체초기화!!!!!!!!!!!!!!!!!!!!!!!!
		ConstructorTest aa=new ConstructorTest();
		//생성자 호출
		System.out.println("이름="+aa.getName()+"\t나이="+aa.getAge());
		System.out.println("");
		
		ConstructorTest bb=new ConstructorTest("홍길동");
		System.out.println("이름="+bb.getName()+"\t나이="+bb.getAge());
		System.out.println("");
		
		ConstructorTest cc=new ConstructorTest(25);
		System.out.println("이름="+cc.getName()+"\t나이="+cc.getAge());
		System.out.println("");
		
	}

}
