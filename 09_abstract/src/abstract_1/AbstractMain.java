package abstract_1;
//추상클래스가 가지고 있는 조건들을 똑같이 해야한다(abstract class) - override안해도됨 

public class AbstractMain extends AbstractTest{
	
	//override 
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		//AbstractTest at= new AbstractTest(); //추상클래스는 new 못한다 메모리에 생성을 못한다
		AbstractTest at=new AbstractMain(); //그러므로 자식이 대신 메모리생성을 해준다 ,자식클래스는 원래 부모클래스도 같이 만들어준다
		at.setName("홍길동");
		System.out.println("이름:"+at.getName());
	}
}
